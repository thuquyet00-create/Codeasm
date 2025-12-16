import java.util.Scanner;

public class PersonalCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true; // Flag to control the loop

        System.out.println("=== MINI CALCULATOR ===");

        // While loop: As long as 'isRunning' is true, repeat the operations inside
        while (isRunning) {
            System.out.println("\n--- FUNCTION MENU ---");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("0. Exit program");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();

            // If the user selects 0, exit without asking for numbers
            if (choice == 0) {
                System.out.println("Program exited. Goodbye!");
                isRunning = false; // Set to false to stop the loop
            } else if (choice >= 1 && choice <= 4) {
                // If user chooses 1–4, then ask for 2 input numbers
                System.out.print("Enter the first number: ");
                double a = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double b = scanner.nextDouble();

                // Switch-case to handle each operation
                switch (choice) {
                    case 1:
                        System.out.println("Result: " + a + " + " + b + " = " + (a + b));
                        break;

                    case 2:
                        System.out.println("Result: " + a + " - " + b + " = " + (a - b));
                        break;

                    case 3:
                        System.out.println("Result: " + a + " * " + b + " = " + (a * b));
                        break;

                    case 4:
                        if (b == 0) {
                            System.out.println("Error: Cannot divide by 0!");
                        } else {
                            System.out.printf("Result: %.2f / %.2f = %.2f\n", a, b, (a / b));
                        }
                        break;
                }

            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}

