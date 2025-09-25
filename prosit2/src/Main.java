import java.util.Scanner;
class ZooManagement{
    int nbrCages=20;
    String zooName="my zoo" ;

}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
           //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       // System.out.printf("Hello and welcome!");
        System.out.println("my zoo comporte 20 cages");
        ZooManagement zoo = new ZooManagement();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" saisir le nom du zoo : ");
            zoo.zooName = sc.nextLine();
            if (zoo.zooName.isEmpty()) {
                System.out.println("Le nom du zoo ne soit pas être vide ");
            }
        } while (zoo.zooName.isEmpty());
        do {
            System.out.println("saisir le nombre de cages : ");
            zoo.nbrCages = sc.nextInt();
            if (zoo.nbrCages <= 0) {
                System.out.println("Le nombre de cages doit être positif ");
            }
        } while (zoo.nbrCages <= 0);

        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");


        Animal lion = new Animal("Félins", "Simba", 4, true);
        Zoo myZoo = new Zoo("safari", "africa", 24);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Zoo créé : " + myZoo.name + " situé à " + myZoo.city);
        System.out.println("Animal créé : "  + lion.name + " famille de " + lion.family );
        myZoo.displayZoo();
        System.out.println(myZoo);
        lion.displayAnimal();
        System.out.println(lion);
        sc.close();
    }
}

