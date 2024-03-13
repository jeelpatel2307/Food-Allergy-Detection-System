import java.util.Scanner;

public class FoodAllergyDetectionSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the list of common food allergens
        String[] allergens = {"peanuts", "eggs", "milk", "fish", "shellfish", "soy", "wheat", "tree nuts"};

        // Prompt user to enter the food they ate
        System.out.print("Enter the food you ate: ");
        String food = scanner.nextLine();

        // Check if the food is a common allergen
        boolean isAllergen = false;
        for (String allergen : allergens) {
            if (food.equalsIgnoreCase(allergen)) {
                isAllergen = true;
                break;
            }
        }

        // Display the result
        if (isAllergen) {
            System.out.println("Warning: The food you ate is a common allergen.");
        } else {
            System.out.println("The food you ate is not a common allergen.");
        }

        scanner.close();
    }
}
