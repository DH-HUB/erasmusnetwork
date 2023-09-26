# erasmusnetwork
[erasmusnetwork] Backend API REST
Description
[erasmusnetwork] est une API REST construite avec [Spring Boot, Maven] qui permet de rechercher des  utilisateurs. Cette API fournit plusieurs endpoints pour interagir avec les utilisateurs

Fonctionnalités:


Recherche des  utilisateurs.
Gestion des erreurs et validation des données.
Comment lancer l'API localement
Clonez ce dépôt:



git clone [URL du dépôt]
Allez dans le dossier du projet:


cd [erasmusnetwork]
Lancez l'application avec [Maven, Spring Boot]:

./mvnw spring-boot:run

L'API sera disponible à http://localhost:8085.

Endpoints
Utilisateurs
GET /users: Récupère la liste de tous les utilisateurs.
GET /users/{id}: Récupère les détails d'un utilisateur spécifique.
[UI]
![image](https://github.com/DH-HUB/erasmusnetwork/assets/60735833/3bfa4143-395c-4daa-a179-d8a24b3a1109)

Technologies Utilisées
Spring Boot: Pour créer l'API REST.
Hibernate: Pour interagir avec la base de données.
MySQL: Base de données utilisée.
Maven: Outil de gestion de dépendance et de build.



Contributeurs
[Hakima Djermouni] - Développeuse Principal - [https://github.com/DH-HUB/erasmusnetwork/]

Licence
Ce projet est sous licence  - voir le fichier LICENSE.md pour plus de détails.


