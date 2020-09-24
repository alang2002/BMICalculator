import java.text.DecimalFormat;

public class BMI {
    // This class will serve as an instantiable class that can be used to determine someone's BMI by calculating it
    // There is also a test class used to ensure the methods work properly and that they will display the correct info

    // Create private variables to be used in the code
    private int weight, height, option;

    // Default constructor with default values
    // option = 1 for metric
    public BMI() {
        this.weight = 70;
        this.height = 170;
        this.option = 1;
    }

    // overloaded constructor to accept values inputted by program/user
    public BMI(int weight, int height, int option) {
        this.weight = weight;
        this.height = height;
        this.option = option;
    }

    // Getters and setters for all three variables

    public int getWeight() {
        return weight;
    }

    // Validation of weight and height setters to ensure value is not below 0
    // else set to default value
    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
        else {
            this.weight = 70;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }
        else {
            this.height = 170;
        }
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        if (option > 0) {
            this.option = option;
        }
        else {
            this.option = 1;
        }
    }

    // method to actually calculate BMI
    public double calcBMI (double weight, double height, int option) {
        double bmi = 0.0;

        if (option == 1) {
            // Metric
            height = height / 100;
            bmi = weight / (Math.pow(height, 2));
        }
        else if (option == 2) {
            // Imperial
            bmi = 703 * (weight / (Math.pow(height, 2)));
        }

        return bmi;
    }

    //@Override
    public void toString(double bmi) {
        String category = "";

        // decision structure to choose the correct category depending on the BMI amount
        if (bmi < 18.5) {
            category = "Underweight";
        }
        else if (bmi >= 18.5 && bmi < 25) {
            category = "Normal weight";
        }
        else if (bmi >= 25 && bmi < 30) {
            category = "Overweight";
        }
        else {
            category = "Obesity";
        }

        // Printing out the value
        // Formatting the BMI
        DecimalFormat formatter = new DecimalFormat("#0.00");
        System.out.println("BMI is " + formatter.format(bmi) + " and it falls under the category " + category);
    }
}
