import java.util.Scanner;

public class NumberMenuProgram {

    // Check if the numbers are Prime. 
    public static boolean isPrime(int num){
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num);i++){
            if (num % i == 0)
                return false;
        }
        return true;
    }
    

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int x = 0, y = 0;
        boolean numbersEntered = false;
        int choice;

        do{
            System.out.println("\nMenu");
            System.out.println("1 - Enter two numbers (x and y)");
            System.out.println("2 - Print all numbers between x and y");
            System.out.println("3 - Find the average of all numbers between x and y");
            System.out.println("4 - Find all prime numbers between x and y");
            System.out.println("5 - Exit");
            System.out.print("Enter your choice: ");


            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter x: ");
                    x = scanner.nextInt();
                    System.out.print("Enter y: ");
                    y = scanner.nextInt();
                    numbersEntered = true;
                    break;

                case 2:
                    if (!numbersEntered){
                        System.out.println("Enter numbers first.");
                    } else {
                        System.out.print("Numbers between x and y: ");
                        for (int i = Math.min(x,y); i <= Math.max(x,y); i++){
                            System.out.print(i + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (!numbersEntered){
                        System.out.println("Enter numbers first.");
                    } else {
                        int sum = 0;
                        int count = 0;
                        for (int i = Math.min(x,y); i <= Math.max(x,y); i++) {
                            sum += i;
                            count++;
                        }
                        double average = (double) sum / count;
                        System.out.println("Average: " + average);
                    }
                    break;

                    case 4:
                        if (!numbersEntered) {
                            System.out.println("Enter numbers first.");
                        } else {
                            System.out.println("Prime numbers between x and y: ");
                            for (int i = Math.min(x,y); i <= Math.max(x,y); i++) {
                                if (isPrime(i)){
                                    System.out.println(i + " ");
                                }
                            }
                            System.out.println();
                        }
                        break;

                        case 5:
                            System.out.println("Exiting program...");
                            break;

                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }

        } while (choice != 5);
        scanner.close();
    }
}