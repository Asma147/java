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
        Animal lion1 = new Animal("Félins", "Simba", 4, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(lion1);
        myZoo.addAnimal(tiger);
        myZoo.displayAnimals();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



        // Supprimer un animal
        System.out.println("\nSuppression de Tigrou : " + myZoo.removeAnimal(tiger));
        myZoo.displayAnimals();
        sc.close();
    }
}

