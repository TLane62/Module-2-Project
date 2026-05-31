import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your first number: ");
        double x = input.nextDouble();

        System.out.println("Enter your second number: ");
        double y = input.nextDouble();


        double addition = x + y;
        double subtraction = x - y;
        double multiplication = x * y;
        double division = x / y;


        System.out.println("\nResults: ");
        System.out.println("Addition (X + Y): " + addition);
        System.out.println("Subtraction (x - y): " + subtraction);
        System.out.println("Multiplication (x * y): " + multiplication);
        System.out.println("Division (x / y): " + division);

        input.close();

        }
    }

