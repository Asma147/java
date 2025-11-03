package entities;

public class Animal {
  public   String family;
   public String name;
  public int age;
   public boolean isMammal;


    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }



    @Override
    public String toString() {
        return "Family: " + family + ", Name: " + name + ", Age: " + age + ", Mammal: " + isMammal;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}