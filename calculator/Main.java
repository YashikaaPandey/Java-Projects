import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");
        System.out.println("Choose an operation:");
        System.out.println("1. Basic Operations (Add, Subtract, Multiply, Divide)");
        System.out.println("2. Advanced Operations (Exponent, Square Root, Logarithm)");
        System.out.print("Enter your choice (1/2): ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Basic Operations:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("Enter your choice (1/2/3/4): ");

            int operation = scanner.nextInt();

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (operation) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Exiting...");
                    return;
            }

            System.out.println("Result: " + result);
        } else if (choice == 2) {
            System.out.println("Advanced Operations:");
            System.out.println("1. Exponent");
            System.out.println("2. Square Root");
            System.out.println("3. Logarithm");
            System.out.print("Enter your choice (1/2/3): ");

            int advancedOperation = scanner.nextInt();

            System.out.print("Enter the number: ");
            double num = scanner.nextDouble();

            double result = 0;

            switch (advancedOperation) {
                case 1:
                    System.out.print("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    result = Math.pow(num, exponent);
                    break;
                case 2:
                    result = Math.sqrt(num);
                    break;
                case 3:
                    result = Math.log(num);
                    break;
                default:
                    System.out.println("Invalid choice. Exiting...");
                    return;
            }

            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid choice. Exiting...");
        }
    }
}