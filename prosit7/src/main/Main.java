package main;

import entities.*;
import exceptions.InvalidAgeException;
import exceptions.ZooFullException;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = sc.nextLine();

        int nbrCages;
        do {
            System.out.print("Entrez le nombre de cages  ");
            nbrCages = sc.nextInt();
        } while (nbrCages <= 0);

        System.out.println(zooName + " comporte " + nbrCages + " cages.");
        //Prosit 2
        Animal lion = new Animal();
        lion.family = "Félidé";
        lion.name = "Lion";
        lion.age = 5;
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Parc Animalier";
        myZoo.city = "Tunis";

        System.out.println("entities.Animal : " + lion.name + " (" + lion.family + ")");

        Animal lion1 = new Animal("Félidé", "Lion", 5, true);


        System.out.println("entities.Animal créé : " + lion1.name);
        myZoo.displayZoo();
        System.out.println(myZoo);
        //Prosit 3
        Zoo zoo1 = new Zoo("entities.Zoo Esprit", "Tunis");
        Zoo zoo2 = new Zoo("entities.Zoo Safari", "Sousse");

        Animal tigre = new Animal("Félidé", "Shere Khan", 7, true);
        Animal lion2 = new Animal("Félidé", "Lion", 5, true);
        // Test Ajout
        zoo1.addAnimal(lion);
        zoo1.addAnimal(tigre);
        zoo1.addAnimal(lion2);


        zoo1.displayAnimals();

        System.out.println("Indice : " + zoo1.searchAnimal(lion));
        System.out.println("Indice : " + zoo1.searchAnimal(tigre));


        zoo1.removeAnimal(tigre);
        zoo1.displayAnimals();
        for (int i = 0; i < 30; i++) {
            zoo1.addAnimal(new Animal("TestFamily", "Animal" + i, 2, false));
        }
        System.out.println("entities.Zoo plein " + zoo1.isZooFull());
        zoo2.addAnimal(new Animal("Canidés", "Wolf", 4, true));
        Zoo plusGrand = Zoo.comparerZoo(zoo1, zoo2);



        Terrestrial t1 = new Terrestrial();
        Dolphin d1 = new Dolphin();
        Penguin p1 = new Penguin();

        // System.out.println(a1);
        System.out.println(t1);
        System.out.println(d1);
        System.out.println(p1);


        Terrestrial t2 = new Terrestrial("Felidae", "Lion", 5, true, 4);
        Dolphin d2 = new Dolphin("Delphinidae", "Flipper", 6, true, "Sea", 25.5f);
        Penguin p2 = new Penguin("Spheniscidae", "Pingo", 3, false, "Iceberg", 15.0f);


        System.out.println(t2);
        System.out.println(d2);
        System.out.println(p2);


        System.out.println("methode swim");

        d2.swim();
        p2.swim();
        myZoo.addAquaticAnimal(d1);
        myZoo.addAquaticAnimal(p1);


        myZoo.swimAll();
        System.out.println("Max Penguin Swimming Depth: " + myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();


        Dolphin dolphin2 = new Dolphin("Flipper","Ocean",5,true,"Sea",30);
        System.out.println("d1 equals dolphin2 " + d1.equals(dolphin2));
        try {
            myZoo.addAnimal(new Animal("Lion", 5));
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre total d’animaux : " + myZoo.getAnimalCount());
        System.out.println();

        try {
            myZoo.addAnimal(new Animal("Serpent", -2));
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre total d’animaux : " + myZoo.getAnimalCount());
        System.out.println();


        try {
            myZoo.addAnimal(new Animal("Tigre", 3));
            myZoo.addAnimal(new Animal("Girafe", 7));
            myZoo.addAnimal(new Animal("Zèbre", 4)); // Dépassement ici
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre total d’animaux : " + myZoo.getAnimalCount());
        myZoo.displayAnimals();
    }
}