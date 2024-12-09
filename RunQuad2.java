import java.util.Scanner;
 
class Quadrilateral {

    public void showDescription() {

        System.out.println("- is quadrilateral");

    }

}
 
class Parallelogram extends Quadrilateral {

    @Override

    public void showDescription() {

        super.showDescription();

        System.out.println("- has 2 pairs of parallel sides");

    }

}
 
class Rectangle extends Parallelogram {

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
 
class Rhombus extends Parallelogram {

    @Override

    public void showDescription() {

        super.showDescription();

        System.out.println("- has 4 congruent sides");

    }

}
 
class Trapezoid extends Quadrilateral {

    @Override

    public void showDescription() {

        super.showDescription();

        System.out.println("- has 1 pair of parallel sides");

    }

}
 
public class RunQuad2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userChoice;
 
        System.out.println("Press R for Rectangle, S for Square, P for Parallelogram, H for Rhombus, or T for Trapezoid:");
 

        while (true) {

            userChoice = scanner.nextLine();
 
            if (userChoice.equalsIgnoreCase("R")) {

                Rectangle rectangle = new Rectangle();

                rectangle.showDescription();

                break;

            } else if (userChoice.equalsIgnoreCase("S")) {

                Square square = new Square();

                square.showDescription();

                break;

            } else if (userChoice.equalsIgnoreCase("P")) {

                Parallelogram parallelogram = new Parallelogram();

                parallelogram.showDescription();

                break;

            } else if (userChoice.equalsIgnoreCase("H")) {

                Rhombus rhombus = new Rhombus();

                rhombus.showDescription();

                break;

            } else if (userChoice.equalsIgnoreCase("T")) {

                Trapezoid trapezoid = new Trapezoid();

                trapezoid.showDescription();

                break;

            } else {

                System.out.println("Oops! Invalid input. Please press R, S, P, H, or T.");

            }

        }
 
        scanner.close();

    }

}

 