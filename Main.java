import java.util.Scanner; // 1. Import library for user input

public class TinhChiSoBMI {

    // 2. Main method - The starting point of the program
    public static void main(String[] args) {

        // Create a Scanner object to read input from keyboard
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== BASIC BMI CALCULATOR PROGRAM ===");

        // --- STEP 1: INPUT ---
        System.out.print("Please enter your full name: ");
        String hoTen = scanner.nextLine(); // Read text (string)

        System.out.print("Please enter your weight (kg): ");
        double canNang = scanner.nextDouble(); // Read decimal number

        System.out.print("Please enter your height (m): ");
        double chieuCao = scanner.nextDouble(); // Read decimal number

        // --- STEP 2: CALCULATION ---
        // BMI formula = weight / (height * height)
        double bmi = canNang / (chieuCao * chieuCao);

        // --- STEP 3: OUTPUT RESULT ---
        System.out.println("\n---------------------------------");
        System.out.println("Hello: " + hoTen);
        // %.2f is used to round to 2 decimal places
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // --- STEP 4: CONDITIONS (If-else structure) ---
        if (bmi < 18.5) {
            System.out.println("Evaluation: You are underweight.");
        } else if (bmi < 25) {
            System.out.println("Evaluation: You have a normal body weight.");
        } else {
            System.out.println("Evaluation: You are overweight.");
        }

        // Close the scanner to free resources
        scanner.close();
    }
}
