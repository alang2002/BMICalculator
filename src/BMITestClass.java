public class BMITestClass {
    // Test class used to hardcode in values and ensure the main BMI class functions properly

    public static void main(String[] args) {
        // Testing constructors
        BMI a = new BMI();
        BMI b = new BMI(230, 71, 2);

        // Testing setters
        a.setHeight(180);
        a.setWeight(104);
        a.setOption(1);
        // Testing getters
        System.out.println("a Height: " + a.getHeight());
        System.out.println("a Weight: " + a.getWeight());
        System.out.println("a Option: " + a.getOption());
        System.out.println("b Height: " + b.getHeight());
        System.out.println("b Weight: " + b.getWeight());
        System.out.println("b Option: " + b.getOption());
        // Testing final two methods
        a.toString(a.calcBMI(a.getWeight(), a.getHeight(), a.getOption()));
        b.toString(b.calcBMI(b.getWeight(), b.getHeight(), b.getOption()));
    }
}
