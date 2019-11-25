# Semantic_Web
**Version 1.0.0**

  > Projet universitaire 2019-2020 de web Semantique sur les datasets SPARQL;
  > Sujet: Global Causes of Mortality;
  > lien du googleDoc: <https://docs.google.com/document/d/1dBG-1cdKs59BGM9Qbfp-xvqpxYxkPYj1zKUxr_QZ4b0/edit>;
  > lien du dataset Kaggle: <https://www.kaggle.com/michaelpawlus/global-causes-of-mortality/download>;
  > lien des slides: <https://slides.com/ayahaiti/deck#/>.

##Utilisation

  > Creation des fichiers .ttl ou .nt grâce au commande donnée dans le fichier /TARQL;
  > Ouvrez un terminal et executez les commandes suivantes: 
  > bash ntriples.sh 
  > bash .sh
  
##Test des requêtes

  > Dirigez-vous dans le fichier ou se trouve apache-jena;
  > tapez dans le terminal la commande suivante: ./fuseki-server
  > maintenant, ouvrez un navigateur et taper dans la barre de recherche: localhost:3030
  > Cliquer sur l'onglet Manage Datasets et créer une nouvelle dataset en cliquant sur "+";
  > Donner un nom et charger le fichier turtle (.ttl) generer par le fichier mapping en cliquant sur upload dataset;
  > Revenez dans l'onglet Datasets et testez les requêtes en copiant/collant le contenu ou réécrire une nouvelle puis en cliquant sur le bouton Play se trouvant en haut à droite.

##Liaison des données

  > charger les nouvelles datasets se trouvant dans le fichiers /TTL_FILES
  > Execution des requêtes se trouvant dans le fichier /LINKED_QUERIES
  
## Contributors

- Aya Haiti       <aya.haiti@etu.univ-nantes.fr>
- Amine Boulahmel <amine.boulahmel@etu.univ-nantes.fr>
