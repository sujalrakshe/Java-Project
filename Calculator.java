

import java.util.Scanner;

class Calculator {


    static double add(double a, double b) {
        return a + b;
    }


    static double subtract(double a, double b) {
        return a - b;
    }


    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Menu
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                try {
                    switch (choice) {
                        case 1:
                            System.out.println("Result = " + add(num1, num2));
                            break;

                        case 2:
                            System.out.println("Result = " + subtract(num1, num2));
                            break;

                        case 3:
                            System.out.println("Result = " + multiply(num1, num2));
                            break;

                        case 4:
                            System.out.println("Result = " + divide(num1, num2));
                            break;
                    }
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            else if (choice != 5) {
                System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        System.out.println("Calculator Closed.");
        sc.close();
    }
}