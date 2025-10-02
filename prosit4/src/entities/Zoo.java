package entities;

public class Zoo {
    public static final int NB_CAGES = 25;
    private Animal[] animals = new Animal[NB_CAGES];
    private String name;
    private String city;
    private int animalCount = 0;

    public Zoo() {
    }

    // Constructeur paramétré
    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Le nom du zoo ne doit pas être vide ");
        } else {
            this.name = name;
        }
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public int getAnimalCount() {
        return animalCount;
    }


    public void displayZoo() {
        System.out.println("entities.Zoo : " + name + ", Ville : " + city);
    }

    public String toString() {
        return "name: " + name + ", city: " + city + ", nombre de cages : " + NB_CAGES;
    }
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("impossible d’ajouter " + animal.getName());
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println( animal.getName() + " existe dans le zoo.");
            return false;
        }

        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }
    public boolean isZooFull() {
        return animalCount >= NB_CAGES;
    }
    public void displayAnimals() {
        System.out.println("Liste des animaux dans le zoo " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("entities.Animal introuvable");
            return false;
        }
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;

    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) return z1;
        else if (z2.animalCount > z1.animalCount) return z2;
        else {
            return null;
        }
    }


}



