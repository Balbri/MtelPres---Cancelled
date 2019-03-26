# Projet Chef-d'Oeuvre Simplon La Poste 3.

Auteur: Nicolas Filine


## Contexte de développement

Aujourd'hui, La Poste dispose de plusieurs solutions en ligne pour permettre à la clientèle d'effectuer ses achats de produits et services:

- Le site internet www.laposte.fr et sa version site mobile.

- La solution mobile, séparée en deux applications: 'App'Part', pour les particuliers, 'App'Pro' pour les professionels

Le projet consiste en l'intégration d'un module déjà présent sur le site et sa version mobile das l'application Pros. Il s'agit du module MTEL ("Mon timbre en Ligne").

La première partie du développement se concentre sur le service QuickBuy, en cours de déploiement sur les deux plateformes sus-nommées. Dans un lot 2, la poste intégrera les services de personnalisation prévus par "Mon Timbre en Ligne" à l'origine.


## MTEL QuickBuy

Il s'agit d'un module en cours de création, permettant aux webmasters de la Poste de proposer sur le site et l'application mobile plusieurs planches de timbres customisées à imprimer. L'administrateur génère les planches et en fait des produits de vente que le client peut acheter en trois clics: Selection, validation de panier, et paiement.


Le module est en cours de déploiement pour la version [Site Desktop](https://laposteecom.invisionapp.com/share/PUP0CRC8MJV#/screens/340470242) ainsi que pour la version [Site Mobile](https://laposteecom.invisionapp.com/share/HMOF92GGD5E#/screens/337391095). 


Voici le Diagramme des Use Case du module QuickBuy.

![Usecase](https://github.com/Balbri/MtelPres/blob/master/img/QuickBuy_Use_Case.png)




## Environnement de travail: Hybris.

Une vision simplifiée d'une architecture Hybris:
![Architecture Hybris](https://github.com/Balbri/MtelPres/blob/master/img/Crossview-Hybris%20System%20Context.png)


### Lexique:

* POS/mPOS : (mobile)Point of Sale => La boutique.
* ESB : Entreprise Service Bus => Permet la communication entre les différents services. Il assure la partie dynamique d'une base de données.
* ETL Server: Extract Transform Load Server => Serveur assurant la gestion non dynamique d'une base de données.
* Payment Gateway => Plateforme de Paiement.

### Fonctionnement:

Pour la partie Back-Office, la boutique la Poste fonctionne sur Hybris, une plateforme/base de données orientée e-commerce. L'objectif est de développer dans un premier temps une page d'administration du module Quickbuy pour permettre aux webmasters de créer ou modifier des produits mis en vente dans le service.

Pour cela, on utilisera des fichiers ImpEx ainsi qu'un court code HTML pour afficher l'interface d'administration.

L'impex utilisé pour générer le fonctionnement de la page d'administration.
![Impex](https://github.com/Balbri/MtelPres/blob/master/img/Impex_admin_page.PNG)

Le HTML permettant d'afficher la page.
![Html administration Hybris](https://github.com/Balbri/MtelPres/blob/master/img/Html_hybris.PNG)

Désormais, le webmaster peut créer ou modifier les services via l'interface Hybris.

[Images de l'interface Hybris et de la gestion des tuiles]


## Environnement de travail: Les contrôleurs (langage JAVA et XML):

La première étape est d'afficher les trois produits en format json. Pour celà, il faut écrire un contrôleur qui va effectuer un mapping des trois objets présents dans la base et permettre leur récupération au format JSON.

Pour cela, d'un côté la construction des objets (initialement au format MODEL) se fera via des fichiers XML: Une déclaration de Façade et une déclaration d'Entité. 
![Déclaration de façade](https://github.com/Balbri/MtelPres/blob/master/img/TuileQuickBuyBean.PNG)
![Entité](https://github.com/Balbri/MtelPres/blob/master/img/eboutiquecommercewebservices-beans.PNG)

Le contrôleur, pour sa part, est en JAVA. Sa fonction est de récupérer les données, qui transitent par les methodes de mapping que l'on place dans une zone intermédiaire nommée "Façade".


Façade accueillant les méthodes de mapping
![Façade d'un objet produit](https://github.com/Balbri/MtelPres/blob/master/img/tuileQBCompFacade.PNG).

Controller assurant l'unique récupération des données, via la façade
![Controller](https://github.com/Balbri/MtelPres/blob/master/img/QbControllerJava.PNG)

## Environnement de travail: Android (Langage JAVA/Kotlin):

La partie Application du projet est développée sous Android Studio en Java, et connaîtra une itération IOS en Switft (hors projet). A l'heure actuelle, le travail sur le front n'est pas commencé.




