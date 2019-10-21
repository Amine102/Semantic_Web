import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.RDFDataMgr;

public class Project_query1 {
	/** Quel est le pays ou le Cancer est le premier facteur réduisant l'espérance de vie?
	 * */
	public static void main(String[] args) {
		Model model = RDFDataMgr.loadModel("projet.nt");
		String queryString = "PREFIX ssn: <http://purl.oclc.org/NET/ssnx/ssn#>"
				+ "PREFIX xsd:  <http://www.w3.org/2001/XMLSchema#> "
				+ "PREFIX dbpedia: <http://fr.dbpedia.org/page/>"
				+ "PREFIX db: <http://dbpedia.org/ontology/>"
				+ "PREFIX owl: <http://www.w3.org/2002/07/owl#>"
				+ "Select ?Country (max(?Cancer_rate) AS ?max) WHERE "
				+ "{"
				+ "	?Country dbpedia:Cancer ?Cancer_rate"
				+ "} "
				+ "GROUP BY ?Country "
				+ "ORDER BY DESC(?max)"
				+ "LIMIT 1"
				;
		try (QueryExecution qexec = QueryExecutionFactory.create(queryString, model)) {
			ResultSet results = qexec.execSelect() ;
			for ( ; results.hasNext() ; )
			{
				QuerySolution soln = results.nextSolution() ;
				Resource  l2=soln.getResource("Country");
				System.out.print (l2.getLocalName()+" ");
				Literal l3=soln.getLiteral("max");
				System.out.print(l3.getString()+"  ");
				System.out.println();
				
			}
			qexec.close();
		}
	}

}
