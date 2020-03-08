# Semantic_Web (Global Causes of Mortality)
**Version 1.0.0**

  - Projet universitaire 2019-2020 de web Semantique sur les datasets SPARQL;
  - Sujet: Global Causes of Mortality;
  - Lien du googleDoc: <https://docs.google.com/document/d/1dBG-1cdKs59BGM9Qbfp-xvqpxYxkPYj1zKUxr_QZ4b0/edit>;
  - Lien du dataset Kaggle: <https://www.kaggle.com/michaelpawlus/global-causes-of-mortality>;
  - Lien des slides: <https://slides.com/ayahaiti/deck#/>;
  - Installation de Tarql: <https://github.com/tarql/tarql/releases>;
  - Installation de Apache-Jena: <https://jena.apache.org/download/index.cgi>.

## Prérequis
  **Tarql**
  - Installez tarql (lien de téléchargement fournis en haut);
  - Pour une utilisation plus simple de la commande tarql, allez dans le fichier ou se trouve les commandes unix;
  ```Bash
  /usr/local/bin #sur mac
  ```
  - Créez un fichier grâce à la commande suivante: 
  ```Bash
  touch tarql
  ```
  - Modifiez les droits du fichier avec la commande suivante: 
  ```Bash
  chmod +x tarql
  ```
  - Modifiez le fichier en mettant la commande suivante: 
  ```Bash
  sh /Users/chemin-se-trouvant-tarql/tarql-1.2/bin/tarql $1 $2 $3
  ```
  - Sauvegardez votre fichier 
  
  **Apache-jena**
  - Installez apache-jena (lien de téléchargement fournis en haut);
  - Ouvrez le fichier téléchargé
  - Ouvrez un terminal et tapez la commande suivante: 
  ```Bash
  ./fuseki-server
  ```
  - Ouvrez votre navigateur et mettez dans la barre de recherche localhost: suivi du numéro de port founi par le terminal (la plupart du temps 3030)[localhost:3030];
  - Explorez l'interface de Apache.
## Utilisation

  - Creation des fichiers .ttl ou .nt grâce aux commandes donnée dans le fichier /TARQL;
  - Ouvrez un terminal et executez une des commandes suivantes: 
  ```Bash
  bash ntriples.sh OU bash ntriples.sh
  ```
  
## Test des requêtes

  - Dirigez-vous dans le fichier ou se trouve apache-jena;
  - Tapez dans le terminal la commande suivante:
  ```Bash
  ./fuseki-server
  ```
  - Ouvrez un navigateur et tapez dans la barre de recherche: localhost:3030
  - Cliquez sur l'onglet Manage Datasets et créez une nouvelle dataset en cliquant sur "+";
  - Donnez un nom et charger le fichier turtle (.ttl) generé par le fichier mapping en cliquant sur upload dataset;
  - Revenez dans l'onglet Datasets et testez les requêtes en copiant/collant le contenu ou réécrire une nouvelle puis en cliquant sur le bouton Play se trouvant en haut à droite.

## Liaison des données

  - Chargez les nouvelles datasets se trouvant dans le fichiers /TTL_FILES
  - Executez les requêtes se trouvant dans le fichier /Linked_Queries
  
## Contributors

- Aya Haiti       <aya.haiti@etu.univ-nantes.fr>
- Amine Boulahmel <amine.boulahmel@etu.univ-nantes.fr>
