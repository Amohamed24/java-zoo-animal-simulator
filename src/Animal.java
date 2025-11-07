public class Animal {

    private final String name;
    private final String species;
    private final int age;
    private final String sound;
    
    public Animal(String name, String species, int age, String sound) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.sound = sound;
    }
    
    public String getName() {
        return name;
    }

    void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    @Override
    public String toString() {
        return name + " (" + species + ", age " + age + ")";
    }
}
