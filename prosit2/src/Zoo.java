public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;
    public Zoo(String name, String city, int i) {
        this.name = name;
        this.city = city;

    }
    public void displayZoo() {
        System.out.println("Zoo : " + name + ", Ville : " + city + ", Cages : " + nbrCages);
    }
    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Cages=" + nbrCages + "]";
    }
}
