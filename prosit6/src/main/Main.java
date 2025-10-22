package main;

import entities.*;

import java.util.Scanner;
class ZooManagement{

    String zooName ;

}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // System.out.printf("Hello and welcome!");
        System.out.println("my zoo comporte 20 cages");

        ZooManagement zooInput = new ZooManagement();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Saisir le nom du zoo : ");
            zooInput.zooName = sc.nextLine();
            if (zooInput.zooName.isEmpty()) {
                System.out.println("Le nom du zoo ne doit pas être vide !");
            }
        } while (zooInput.zooName.isEmpty());

        Zoo myZoo = new Zoo(zooInput.zooName, "Africa");
        myZoo.displayZoo();

        Animal lion = new Animal("Félins", "Simba", 4, true);
        Animal tiger = new Animal("Félins", "Tigrou", 3, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.displayAnimals();
        Dauphin d1 = new Dauphin("Cétacé", "animalaquatic1", 5, true, "Océan", 25.5f);
        Dauphin d2 = new Dauphin("Cétacé", "animalaquatic2", 4, true, "Bassin", 20.2f);
        myZoo.addAquaticAnimal(d1);
        myZoo.addAquaticAnimal(d2);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.




        System.out.println("\nSuppression de Tigrou : " + myZoo.removeAnimal(tiger));
        myZoo.displayAnimals();
       // Aquatic aquatic = new Aquatic("Poisson", "Nemo", 2, false, "océan");
        Terrestrial terrestrial = new Terrestrial("Félin", "Lion", 5, true, 4);
        Dauphin dolphin = new Dauphin("Cétacé", "Flipper", 6, true, "océan", 30.5f);
        Pingouin penguin = new Pingouin("Oiseau", "Pingou", 3, false, "bassin", 12.4f);


        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);


        dolphin.swim();
        Terrestrial t1 = new Terrestrial();
        Dauphin d0 = new Dauphin();
        Pingouin p1 = new Pingouin();

        // System.out.println(a1);
        System.out.println(t1);
        System.out.println(d0);
        System.out.println(p1);


        System.out.println("\n=== Constructeurs paramétrés ===");
        //Aquatic a2 = new Aquatic("Fish", "Shark", 8, false, "Ocean");
        Terrestrial t2 = new Terrestrial("Felidae", "Lion", 5, true, 4);
        Dauphin d02 = new Dauphin("Delphinidae", "Flipper", 6, true, "Sea", 25.5f);
        Pingouin p2 = new Pingouin("Spheniscidae", "Pingo", 3, false, "Iceberg", 15.0f);

        // System.out.println(a2);
        System.out.println(t2);
        System.out.println(d02);
        System.out.println(p2);


        System.out.println("méthodes swim");

        d2.swim();
        p2.swim();
        myZoo.addAquaticAnimal(d1);
        myZoo.addAquaticAnimal(p1);


        myZoo.swimAll();
        System.out.println("Max Penguin Swimming Depth: " + myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();

        // Vérifier equals
        Dauphin dolphin2 = new Dauphin("Flipper","Ocean",5,true,"Sea",30);
        System.out.println("d1 equals dolphin2? " + d1.equals(dolphin2));

        sc.close();
    }
}

