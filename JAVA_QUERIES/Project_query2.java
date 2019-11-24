import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.RDFDataMgr;


public class Project_query2 {
	
	
	/** Quel est le pays ayant eu la plus grande espérance de vie durant ce quart de siècle(de 1990 à 2015) étudié?
	 * */
	
	
	public static void main(String[] args) {
		Model model = RDFDataMgr.loadModel("projet.nt");
		String queryString = "PREFIX xsd:  <http://www.w3.org/2001/XMLSchema#> "
				+ "PREFIX dbpedia: <http://fr.dbpedia.org/page/>"
				+ "PREFIX db: <http://dbpedia.org/ontology/>"
				+ "PREFIX owl: <http://www.w3.org/2002/07/owl#>"
				+ "Select ?j ?esperance_vie WHERE "
				+ "{"
				+ "?h dbpedia:Life_expectancy ?esperance_vie;"
				+ "	  dbpedia:Year ?year;"
				+ "	  owl:sameAs ?j."
				+ "} "
				+ "ORDER BY DESC(?esperance_vie) "
				+ "LIMIT 1"
				;
		try (QueryExecution qexec = QueryExecutionFactory.create(queryString, model)) {
			ResultSet results = qexec.execSelect() ;
			for ( ; results.hasNext() ; )
			{
				QuerySolution soln = results.nextSolution() ;
				Literal l2=soln.getLiteral("j");
				System.out.print(l2.getString()+"  ");
				Literal l1=soln.getLiteral("esperance_vie");
				System.out.println(l1);
				System.out.println();
				
			}
			qexec.close();
		}
		
		
		/** Réponse: El Salvador avec une éspérance de vie de 85.4171*/
		
		
	}

}
