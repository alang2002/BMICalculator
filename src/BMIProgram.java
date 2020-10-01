import java.util.Scanner;

public class BMIProgram {
    // Class to run main menu and accept user input
    // Aaron Lang

    public static void main(String[] args) {
        // Setting up variables for input
        Scanner userInput = new Scanner(System.in);
        int optionSelected;

        // Menu display
        // Put inside a while loop to loop back to main menu until they choose to exit
        do {
            System.out.println("\n---------BMI Calculator---------");
            System.out.println("Created by Aaron Lang");
            System.out.println("\nSelect an option to continue (1-3):");
            System.out.println("Option 1: Metric");
            System.out.println("Option 2: Standard");
            System.out.println("Option 3: Exit");
            optionSelected = userInput.nextInt();
            if (optionSelected > 3 || optionSelected < 1) {
                System.out.println("Not a valid input, try again.");
                optionSelected = 0;
            }
            else if (optionSelected == 1) {
                calcMetric();
            }
            else if (optionSelected == 2) {
                calcStandard();
            }
        }while (optionSelected != 3);
        System.out.println("Have a nice day! Exiting...");
        userInput.close();
    }

    public static void calcMetric() {
        Scanner userInput = new Scanner(System.in);
        int weight;
        int height;
        int option = 1;

        System.out.println("\n--Option 1 Selected: Metric--");
        // Do whiles to run through prompts at least once, then continuing to prompt until they enter a number
        // bigger than 0
        do {
            System.out.println("Enter weight in kilograms: ");
            weight = userInput.nextInt();
        } while (weight < 0);
        do {
            System.out.println("Enter height in centimeters: ");
            height = userInput.nextInt();
        } while (height < 0);

        // Creating new BMI object and using overloaded constructor to set information
        BMI user = new BMI(weight, height, option);
        // Calculating and printing out info
        System.out.println(user.toString());
    }

    public static void calcStandard() {
        Scanner userInput = new Scanner(System.in);
        int weight;
        int height;
        int option = 2;

        System.out.println("\n--Option 2 Selected: Standard--");
        do {
            System.out.println("Enter weight in pounds: ");
            weight = userInput.nextInt();
        } while (weight < 0);
        do {
            System.out.println("Enter height in inches: ");
            height = userInput.nextInt();
        } while (height < 0);

        BMI user = new BMI(weight, height, option);
        System.out.println(user.toString());
    }
}
