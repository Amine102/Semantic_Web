# Semantic_Web
**Version 1.0.0**

  - Projet universitaire 2019-2020 de web Semantique sur les datasets SPARQL;
  - Sujet: Global Causes of Mortality;
  - lien du googleDoc: <https://docs.google.com/document/d/1dBG-1cdKs59BGM9Qbfp-xvqpxYxkPYj1zKUxr_QZ4b0/edit>;
  - lien du dataset Kaggle: <https://www.kaggle.com/michaelpawlus/global-causes-of-mortality>;
  - lien des slides: <https://slides.com/ayahaiti/deck#/>;
  - Installation de Tarql: <https://github.com/tarql/tarql/releases>;
  - Installation de Apache-Jena: <>.

## Prérequis
  **Tarql**
  - Installer tarql (lien de téléchargement fournis en haut);
  - Pour une utilisation plus simple de la commande tarql, allez dans le fichier ou se trouve les commandes unix (/usr/local/bin sur mac);
  - créer un fichier grâce à la commande suivante: touch tarql
  - modifiez les droits du fichier avec la commande suivante: chmod +x tarql
  - modifiez le fichier en mettant la commande suivante: sh /Users/chemin-se-trouvant-tarql/tarql-1.2/bin/tarql $1 $2 $3
  - sauvegarder votre fichier.
  **Apache-jena**
  - Installer apache-jena (lien de téléchargement fournis en haut);
  - Ouvrez le fichier téléchargé
  - Ouvrez un terminal et tapez la commande suivante: .fuseki-server
  - Ouvrez votre navigateur et mettez dans la barre de recherche localhost: suivi du numéro de port founi par le terminal (la plupart du temps 3030)[localhost:3030];
  - Explorez l'interface de Apache.
## Utilisation

  - Creation des fichiers .ttl ou .nt grâce au commande donnée dans le fichier /TARQL;
  - Ouvrez un terminal et executez les commandes suivantes: 
  - bash ntriples.sh 
  - bash turtle.sh
  
## Test des requêtes

  - Dirigez-vous dans le fichier ou se trouve apache-jena;
  - tapez dans le terminal la commande suivante: ./fuseki-server
  - maintenant, ouvrez un navigateur et taper dans la barre de recherche: localhost:3030
  - Cliquer sur l'onglet Manage Datasets et créer une nouvelle dataset en cliquant sur "+";
  - Donner un nom et charger le fichier turtle (.ttl) generer par le fichier mapping en cliquant sur upload dataset;
  - Revenez dans l'onglet Datasets et testez les requêtes en copiant/collant le contenu ou réécrire une nouvelle puis en cliquant sur le bouton Play se trouvant en haut à droite.

## Liaison des données

  - charger les nouvelles datasets se trouvant dans le fichiers /TTL_FILES
  - Execution des requêtes se trouvant dans le fichier /Linked_Queries
  
## Contributors

- Aya Haiti       <aya.haiti@etu.univ-nantes.fr>
- Amine Boulahmel <amine.boulahmel@etu.univ-nantes.fr>
