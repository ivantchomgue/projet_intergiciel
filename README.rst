=======================
Projet Intergiciel J2EE
=======================

Je viens de créer un gestionnaire de version GIT afin de pouvoir
travailler sur le projet J2EE de manière efficace et synchrone.

Membres du groupe
=================
    * Ivan TCHOMGUE
    * Guilhem MARION
    * Antoine BURIE
    * Victor RIPPLINGER

Documentation Rapide
====================

    Lire cette page : 
	http://www.siteduzero.com/tutoriel-3-254198-gerez-vos-codes-source-avec-git.html

Elle résume tout ce qu'il y a à savoir sur le gestionnaire de version GIT.

URL
===
https://github.com/ivantchomgue
** Notez que cette URL est confidentielle car le projet étant public si vous partagez cette URL tout le monde
pourra y accéder **

Astuces
=======
    * Faire un git pull avant de vous lancer dans le code. Ceci permettra de travailler sur un projet à jour
    * Faire un git add <fichier> pour ajouter un nouveau fichier
    * Faire régulièrement un git commit -m <fichier> pour mettre à jour un fichier que vous avez modifier
    * Faire git status [fichier] pour voir les modifications qui ont été faites depuis le dernier commit
    * Faire git commit -a pour mettre à jour tous les fichiers listés dans git status
    * git diff permet de voir où les modifications ont été faites
    * Enfin de journée, ou quand vous avez terminer de travailler faire un git push pour envoyer les fichiers sur le serveur

Fonctionnalités de l'application
================================
    * Inscription
    * Connexion
    * Changement de profil (mot de passe, e-mail...)
    * Recherche :
        * de résultats du classement
        * de profils dans lesquels on pourra voter +1 ou -1
    * Administration

Technologies utilisées
======================
    * Java EE avec Glassfish
    * HTML5 / CSS3
    * Javascript
    * Ajax

Tables de données
=================
    * meufs :
        * Nombre de votes pour
        * Nombre de votes contre
        * Établissement
        * Caractères physiques ?
    * utilisateurs :
        * Pseudo
        * Mot de passe
        * E-mail
        * Favoris : liste de meufs
        * Likes : liste des meufs pour lesquelles l'utilisateur a voté pour
        * Dislikes : liste des meufs pour lesquelles l'utilisateur a voté contre
        * Notes : liste de couples (meuf, note) ?
    * etablissements ?

(Ɔ)copyleft
---------
