# Design-Patterns

## PatternStrategy

Avant tout , Pattern stratégie selon la classification GOF appartient à :
             Catégorie : Comportement      Portée : Objet 
• Ses Objectifs:
    Définir une famille d’algorithmes, et encapsuler chacun et les rendre interchangeables tout en assurant que chaque algorithme puisse évoluer indépendamment des clients qui l’utilisent
    
• Raison d’utilisation :
    Un objet doit pouvoir faire varier une partie de son algorithme dynamiquement.

Ce projet est une implementation du pattern Strategy à un jeu d'aventure. 
 Il y a des classes pour les personnages et des classes correspondants aux comportements aux armes que les personnages peuvent utiliser. 
 Le pattern est implémenté de tel façon que chaque personnage ne peut faire usage que d’une seule arme à la fois, mais il peut en changer à tout moment en cours du jeu. 
 
 Diagramme de Classe :
 
 ![image](https://user-images.githubusercontent.com/56320491/138089636-4918aacd-2242-498c-a979-35ac926ca27a.png)
 
 Résultat de l'implementation : 
 
 ![image](https://user-images.githubusercontent.com/56320491/138090520-0be754d8-3c93-4101-b6d1-57e31bd00078.png)

## Pattern_Strategy2

On considère la classe Employe (voir annexe) qui est définie par :
• deux variables d’instance cin et salaireBrutMensuel,
• deux constructeurs, les getters et setters
• et une méthode calculerIGR qui retourne l’impôt général sur les revenus salariaux.
• La méthode getSalaireNetMensuel retourne le salaire net mensuel.
Supposant que la formule de calcul de l’IGR diffère d’un pays à l’autre.
Au Maroc, par exemple le calcul s’effectue selon les cas suivant :
• Si le salaire annuel est inférieur à 40000, le taux de l’IGR est : 5%
• Si le salaire annuel est supérieur à 40000 et inférieur à 120000, le taux de l’IGR est : 20%
• Si le salaire annuel est supérieur à 120000 le taux de l’IGR est : 42%
En Algérie, le calcul s’effectue en utilisant un taux unique de 35%.
Comme cette classe est destinée à être utilisée dans différent type de pays inconnus au moment du développement de
cette classe,
1. Identifier les méthodes qui vont subir des changements chez le client.
2. En appliquant le pattern strategie, essayer de rendre cette classe fermée à la modification et ouverte à l’extension.
3. Créer une application de test.
4. Proposer une solution pour choisir dynamiquement l’implémentation de calcul de l’IGR

 Diagramme de Classe :
 
 ![image](https://user-images.githubusercontent.com/56320491/138094291-2ed192d1-7d5b-4a82-8fe3-c4936aebc910.png)
 
 Résultat de l'implementation : 
 
 ![image](https://user-images.githubusercontent.com/56320491/138092984-b61877f7-4893-4517-b584-de2bf2544234.png)

##StationMeteo Pattern Observer

Pattern Observer selon la classification GOF appartient à :
             Catégorie : Comportement      Portée : Objet 
 Définition :
• Le pattern Observer définit une relation entre les objets de type un à plusieurs, de façon que, lorsqu’un objet change d’état, tous ce qui en dépendent en soient informés et soient mis à jour automatiquement.

Enoncé : 
Construire une station météorologique de dernière génération consultable en ligne!
La station sera basée sur notre objet DonneesMeteo (brevet en cours),qui enregistre les conditions météorologique à un moment donné (température, hygrométrie et pression atmosphérique).
Il faut créer une application qui fournira d’abord trois affichages: conditions actuelles, statistiques et prévisions simples, tous trois mis à jour en temps réel au fur et à mesure que l’objet DonneesMeteo acquiert les données les plus récentes.
De plus cette station météo doit être extensible. MétéoExpress veut commercialiser une API pour que les autres développeurs puissent réaliser leurs propres affichages et les insérer directement. Nous souhaitons que vous nous fournissiez cette API !

 Diagramme de Classe :
 
![image](https://user-images.githubusercontent.com/56320491/138097269-6657ebf0-185d-4228-892e-47c86ca4d12a.png)

 Résultat de l'implementation : 
 
![image](https://user-images.githubusercontent.com/56320491/138098557-ff71f6f0-5dbd-4234-a77b-dfc5fcd1d550.png)

##PatternDecorator
     Catégorie : Structure
     
Définition :
  Le pattern Décorateur attache dynamiquement des responsabilités supplémentaires à un objet. Il fournit une alternative souple à la dérivation, pour étendre les fonctionnalités.
Résultat :
  Le Design Pattern permet d'isoler les responsabilités d'un objet.
 Enoncé :
 Starbuzz Coffee s’est fait un nom en devenant la plus importante chaîne de « salons de café » aux états unis.
 Quand ils ont commencé, ils on conçu leurs classes comme ceci:
 
  ![image](https://user-images.githubusercontent.com/56320491/138099304-0b3b8401-8b69-4990-9b51-eb00ad03d259.png)

  En plus de votre café, vous pouvez également demander plusieurs ingrédients, comme :
• de la mousse de lait,
• du caramel,
• du chocolat,
• du sirop,
• de la vanille ...
Starbuzz Coffee, facturant chacun de ces suppléments, ils ont besoin de les intégrer à leur système de commande.

Solution :

 -Diagramme de classe :
 
 ![image](https://user-images.githubusercontent.com/56320491/138099419-c45be9ec-5286-41eb-84fd-f50137a2919e.png)

 - Résultat de l'implémentation :
 
 ![image](https://user-images.githubusercontent.com/56320491/138099593-61f3915a-7df1-4c7b-9854-7dd732a67221.png)
 
 ##PatternDecorator2
 
  Exercice :
  InputStream du package ja.io est une classe abstraite dont plusieurs implémentations concrètes définissent une méthode read() qui permet de lire un entier à partir d’une entrée quelconque.
La classe Concrète FileInpustream est un InputStream qui permet de lire des entiers à partir d’un fichier :
      Pour créer l’objet:
• InputStream is=new FileInputStream("original.txt");
     Pour lire un entier du fichier:
• int c=is.read();

Nous souhaitons créer un décorateur de InputStream qui nous permet de décrypter un fichier qui contient un texte.
Le décryptage consiste à récupérer du fichier le texte , puis afficher une chaine de caractére du texte décryptée .
1. Créer un diagramme de classes
2. Créer un décorateur abstrait de InpuStream : DecorateurInputStream.java
3. Créer un Décorateur concret de InputStream, qui permet de décrypter un InputStream :
DecrypteInputStream.java
4. Créer un fichier texte « original.txt » qui contient le texte crypté
5. Créer une application qui permet de:
   a. Créer un FileInputStream représentant le fichier « Original.txt »
   b. Décorer l’objet créé par un objet de DecrypteInputStream
   c. Afficher le texte décrypté
   
Solution :

 -Diagramme de classe :
 
 ![image](https://user-images.githubusercontent.com/56320491/138102327-3a8296db-7a4e-4a39-97ab-a0808adfed42.png)

 - Résultat de l'implémentation :
 
 ![image](https://user-images.githubusercontent.com/56320491/138102403-ce44a563-ba5e-4330-94d2-6c044c0f8f2c.png)
 
 ##PatternComposite
      Catégorie : Structure   Portée : Objet
      
Objectifs du pattern  :
• Organiser les objets en structure arborescente afin de représenter une hiérarchie.
• Permettre à la partie cliente de manipuler un objet unique et un objet composé de la même manière.

Résultat :
• Le Design Pattern permet d'isoler l'appartenance à un agrégat.

On s'intérese dans ce projet à implementer une hiérarchie d'un dossier , qui peut contenir à son tour des dossiers ou des fichiers. Les fichiers sont considérés comme des élements final.

Solution :

-Diagramme de classe :

![image](https://user-images.githubusercontent.com/56320491/138102942-bb3d633a-d593-4973-a577-847f4b68b815.png)

-Résultat:

![image](https://user-images.githubusercontent.com/56320491/138103565-8720091f-4d86-4e17-a513-5dd434e4c385.png)





