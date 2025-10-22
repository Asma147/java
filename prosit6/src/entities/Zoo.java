package entities;

public class Zoo {
    final int NBR_CAGES = 25;
    Animal[] animals;
    private String name;
    String city;
    int animalCount;
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int count;
    public Zoo(){}

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
    }
    public void displayZoo() {
        System.out.println("tn.esprit.gestionzoo.entities.Zoo : " + name + ", Ville : " + city + ", Cages : " + NBR_CAGES);
    }
    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo [Nom=" + name + ", Ville=" + city + ", Cages=" + NBR_CAGES + "]";
    }

    public boolean addAnimal(Animal animal) {
        if (animalCount >= NBR_CAGES) {
            System.out.println("Le zoo est plein, impossible d'ajouter l'animal");
            return false;
        }

        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal existe déjà");
            return false;
        }
        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    public void displayAnimals() {
        System.out.println("Liste des animaux dans le zoo " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }


    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("Animal introuvable");
            return false;
        }
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }

    public boolean isZooFull() {
        return animalCount >= NBR_CAGES;
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) return z1;
        else if (z2.animalCount > z1.animalCount) return z2;
        else {
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null ) {
            this.name = name;
        } else {
            System.out.println("Erreur : le nom du zoo ne peut pas être vide.");
        }
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (count < aquaticAnimals.length) {
            aquaticAnimals[count++] = aquatic;
        } else {
            System.out.println("Zoo is full! Cannot add more aquatic animals.");
        }
    }

    public void swimAll() {
        for (int i = 0; i < count; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < count; i++) {
            if (aquaticAnimals[i] instanceof Pingouin) {
                Pingouin p = (Pingouin) aquaticAnimals[i];
                if (p.getSwimmingDepth() > maxDepth) {
                    maxDepth = p.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphins = 0, penguins = 0;
        for (int i = 0; i < count; i++) {
            if (aquaticAnimals[i] instanceof Dauphin) dolphins++;
            if (aquaticAnimals[i] instanceof Pingouin) penguins++;
        }
        System.out.println("Number of Dolphins: " + dolphins);
        System.out.println("Number of Penguins: " + penguins);
    }

}