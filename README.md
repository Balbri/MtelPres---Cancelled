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


Pour la partie Back-Office, la boutique la Poste fonctionne sur Hybris, une plateforme/base de données orientée e-commerce. L'objectif est de développer dans un premier temps une page d'administration du module Quickbuy pour permettre aux webmasters de créer ou modifier des produits mis en vente dans le service.

Pour cela, on utilisera des fichiers ImpEx pour générer des jsp dans l'interface d'administration.


![Impex](https://github.com/Balbri/MtelPres/blob/master/img/Impex_admin_page.PNG)
![Html administration Hybris](img)

Désormais, le webmaster peut créer ou modifier les services via l'interface Hybris.

[Images de l'interface Hybris et de la gestion des tuiles]


# Environnement de travail: Les contrôleurs:

La première étape est d'afficher les trois produits en format json. Pour celà, il faut écrire un contrôleur qui va effectuer un mapping des trois objets présents dans la base et permettre leur récupération au format JSON.


