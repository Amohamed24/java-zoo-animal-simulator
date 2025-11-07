import java.util.ArrayList;

public class Zoo {
    
    private final ArrayList<Animal> animals;
    
    public Zoo() {
        animals = new ArrayList<>();
        animals.add(new Animal("Zebra", "Mammal", 18, "pfft"));
        animals.add(new Animal("Alligator", "Reptile", 78, "HRRRMM"));
        animals.add(new Animal("Frog", "Amphibian", 5, "ribbit"));
    }
    
    void listAnimals() {
        if(animals.isEmpty()){
            System.out.println("There are no animals in the zoo");
        } else {
            for (Animal animal : animals) {
                System.out.println("-" + animal);
            }
        }
    }

    void addAnimal() {
        System.out.println("What is the animal's name?: ");
        String name = Main.scanner.nextLine();

        System.out.println("What species is this " + name + "?");
        String species = Main.scanner.nextLine();
        
        int age;
        while (true) {
            System.out.println("What age is this animal?");
            String ageInput = Main.scanner.nextLine();
            
            try {
                age = Integer.parseInt(ageInput);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid! Please enter a number");
            }
        }

        System.out.println("What sound does this " + name + " make?");
        String sound = Main.scanner.nextLine();

        animals.add(new Animal(name, species, age, sound));
        System.out.println(name + " was added to the zoo!");
    }
    
    void makeAnimalSound() {
        System.out.println("Which animal's sound do you want to hear?");
        listAnimals();
        System.out.println("Enter the animal's name: ");
        String name = Main.scanner.nextLine();
        
        for (Animal animal : animals){
            if (animal.getName().contains(name)){
                animal.makeSound();
                return;
            }
        }
        
        System.out.println("No animal with the name " + name + " was found");
    }
}
