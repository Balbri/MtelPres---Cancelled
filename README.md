# MtelPres
Présentation d'un projet pour l'école Simplon


# Contexte de développement

Aujourd'hui, La Poste dispose de plusieurs solutions en ligne pour permettre à la clientèle d'effectuer ses achats de produits et services:

- Le site internet www.laposte.fr
- Le site mobile www.m.laposte.fr
- La solution mobile, séparée en deux applications: 'App'Part', pour les particuliers, 'App'Pro' pour les professionels

Le projet consiste en l'intégration d'un module déjà présent sur le site et sa version mobile das l'application Pros. Il s'agit du module MTEL ("Mon timbre en Ligne").

La première partie du développement se concentre sur le service QuickBuy, en cours de déploiement sur les deux plateformes sus-nommées. Dans un lot 2, la poste intégrera les services de personnalisation prévus par "Mon Timbre en Ligne" à l'origine.



# Environnement de travail: Hybris.

Une vision simplifiée d'une architecture Hybris:
![Architecture Hybris](https://github.com/Balbri/MtelPres/blob/master/img/Crossview-Hybris%20System%20Context.png)


Pour la partie Back-Office, la boutique la Poste fonctionne sur Hybris, une plateforme/base de données orientée e-commerce. L'objectif est de développer dans un premier temps une page d'administration du module Quickbuy pour permettre aux webmasters de créer ou modifier des produits mis en vente dans le service.

Pour cela, on utilisera des fichiers ImpEx ainsi qu'un court code HTML pour afficher l'interface d'administration.

L'impex utilisé pour générer le fonctionnement de la page d'administration.
![Impex](https://github.com/Balbri/MtelPres/blob/master/img/Impex_admin_page.PNG)

Le HTML permettant d'afficher la page.
![Html administration Hybris](https://github.com/Balbri/MtelPres/blob/master/img/Html_hybris.PNG)

Désormais, le webmaster peut créer ou modifier les services via l'interface Hybris.

[Images de l'interface Hybris et de la gestion des tuiles]


# Environnement de travail: Les contrôleurs (langage JAVA et XML):

La première étape est d'afficher les trois produits en format json. Pour celà, il faut écrire un contrôleur qui va effectuer un mapping des trois objets présents dans la base et permettre leur récupération au format JSON.

Pour cela, d'un côté la construction des objets (initialement au format MODEL) se fera via des fichiers XML. 


Le contrôleur, pour sa part, est en JAVA. Sa fonction est de récupérer les données, qui transitent par les methodes de mapping que l'on place dans une zone intermédiaire nommée "Façade".


Façade accueillant les méthodes de mapping
![Façade d'un objet produit](https://github.com/Balbri/MtelPres/blob/master/img/tuileQBCompFacade.PNG).

Controller assurant l'unique récupération des données, via la façade
![Controller](https://github.com/Balbri/MtelPres/blob/master/img/QbControllerJava.PNG)




