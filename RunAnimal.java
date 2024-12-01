import java.util.Scanner;

abstract class Animal {
    public abstract void displayInfo();
}

class Bird extends Animal {
    public void displayInfo() {
        System.out.println("Birds loves to eat worms and sleep for 10-12 hours a day. TWEET TWEET");
    }
}

class Cat extends Animal {
    public void displayInfo() {
        System.out.println("Cats loves to eat mouse and sleep for 12-16 hours a day. MEOW MEOW");
    }
}

class Dog extends Animal {
    public void displayInfo() {
        System.out.println("Dogs loves to eat liver and sleep for 12-14 hours a day. WOOF WOOF");
    }
}

public class RunAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an animal (B for Bird, C for Cat, D for Dog): ");
        String animalChoice = scanner.nextLine().toUpperCase();

        Animal animal = null;

        switch (animalChoice) {
            case "B":
                animal = new Bird();
                break;
            case "C":
                animal = new Cat();
                break;
            case "D":
                animal = new Dog();
                break;
            default:
                System.out.println("Invalid animal choice.");
                return;
        }

        animal.displayInfo();
    }
}
