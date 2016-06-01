# Game

## I Présentation
```
Jeux video d'arcade de sport, inspiré du tennis de table, le jeux pong se joura dans un premier temps à un joueur :

Une raquette (à gauche de l'ecran) qui se deplace seulement de haut en bas, un mur invisible (à droite de l'ecran) et une balle. 
La raquette frappe la balle et rebondie contre le mur, à chaque fois que le joueur renvoie la balle sont score augmente d'un point.

Dans un second temps le jeux ce proposera un deuxieme joueurs, le but et d'envoyer la balle dans le camps adverse sans que l'adversaire
puisse renvoyer la balle, dans ce cas un point sera accordé au joueurs.
```
## II Itération / Planning
```
Jeux PongV1 1 joueur
=> Creation du fond noir
=> Création d'une ligne qui separe le terrain en deux
=> Création de la raquette
=> Déplacement de la raquette ( haut et bas )
=> Délimiter les déplacements de la raquettes ( ne doit pas sortir du cadre )
=> Creation de la balle
=> Déplacement de la balle (gauche et droit)
=> Intégration des collisions pour la balle contre les murs / contre la raquette
=> Si la balle passe derriere la raquette le jeux s'arrete avec un texte affiché "Game Over"
```
```
Jeux PongV2 2 joueurs ( 1 joueur vs IA )
=> Création deuxieme raquette
=> Déplacement de la raquette ( suis la balle )
=> Ajout des collisions sur la deuxieme raquette
```
```
Améliorations PongV2.1
=> Vitesse de la balle aleatoire
=> Ajout du Game Over lorsque la balle passe derriere la raquette du joueur.
=> Interface selection 1 joueur ou 2 joueurs ( not added )
=> La balle disparait à intervale régulier ( not added )
```
## III Technologies / Dépendances
```
	=> Librairie ( KeyListener, Applet, Runnable )
```
## IV Documentation
```
  => Lire commentaire en debut de class
```
