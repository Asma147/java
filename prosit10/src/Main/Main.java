package Main;

import entities.Departement;
import entities.Employe;
import services.AffectationHashMap;

public class Main {
    public static void main(String[] args) {
        AffectationHashMap ahm = new AffectationHashMap();

        Employe e1 = new Employe(1, "nom1","prenom1","info",15);
        Employe e2 = new Employe(2, "nom2","prenom2","math",16);
        Employe e3 = new Employe(3, "nom3","prenom3","phy",17);

        Departement d1 = new Departement(10, "Informatique", 30);
        Departement d2 = new Departement(20, "Finance", 15);

        ahm.ajouterEmployeDepartement(e1, d1);
        ahm.ajouterEmployeDepartement(e2, d1);
        ahm.ajouterEmployeDepartement(e3, d2);

        System.out.println(" Affectations ");
        ahm.afficherEmployesEtDepartements();


        System.out.println("Ajout du même employé dans un autre département");
        ahm.ajouterEmployeDepartement(e1, d2);

        ahm.afficherEmployesEtDepartements();


        System.out.println("Map triée par id ");
        System.out.println(ahm.trierMap());
    }
}