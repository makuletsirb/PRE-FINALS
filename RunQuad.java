import java.util.Scanner;
 
class Quadrilateral {

    public void showDescription() {

        System.out.println("- is quadrilateral");

    }

}
 
class Rectangle extends Quadrilateral {

    @Override

    public void showDescription() {

        super.showDescription();

        System.out.println("- has 4 right angles");

    }

}
 
class Square extends Rectangle {

    @Override

    public void showDescription() {

        super.showDescription();

        System.out.println("- has 4 equal sides");

    }

}
 
public class RunQuad {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 
        String userChoice;
 
        while (true) {

            System.out.println("Press R for Rectangle or S for Square:");

            userChoice = scanner.nextLine();
 
            if (userChoice.equalsIgnoreCase("R")) {

                Rectangle rectangle = new Rectangle();

                rectangle.showDescription();

                break;

            } else if (userChoice.equalsIgnoreCase("S")) {

                Square square = new Square();

                square.showDescription();

                break;

            } else {

                System.out.println("Invalid input! Please press R or S.");

            }

        }
 
        scanner.close();

    }

}

 