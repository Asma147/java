package services;

import entities.Employe;
import interfaces.IGestion;
import interfaces.IRechercheAvancee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {

    private List<Employe> listEmployes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe t) {
        listEmployes.add(t);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : listEmployes) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe t) {
        return listEmployes.contains(t);
    }

    @Override
    public void supprimerEmploye(Employe t) {
        listEmployes.remove(t);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : listEmployes) {
            System.out.println(e);
        }
    }



    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> resultat = new ArrayList<>();
        for (Employe e : listEmployes) {
            if (e.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                resultat.add(e);
            }
        }
        return resultat;
    }
}