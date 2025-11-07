import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args) {

        System.out.println("Hi! Welcome to Zoo Animal Simulator!");
        System.out.println("What's your name?: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + "!");

        Zoo zoo = new Zoo();

        while(true) {
            System.out.println("\n*******************************");
            System.out.println("What would you like to do?: ");
            System.out.println("1) See all animals");
            System.out.println("2) Add an animal");
            System.out.println("3) Make an animal sound");
            System.out.println("(type 'q' to quit)");

            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("q")) {
                System.out.println("Thanks for playing " + name + "!");
                break;
            }

            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid! Please select either 1, 2 or 3");
                continue;
            }

            switch(choice) {
                case 1 -> zoo.listAnimals();
                case 2 -> zoo.addAnimal();
                case 3 -> zoo.makeAnimalSound();
                default -> {
                    System.out.println("Invalid! Select either 1) See all animals");
                    System.out.println("2) Add an animal");
                    System.out.println("(type 'q' to quit)");
                }
            };
        }
        scanner.close();
    }
}


