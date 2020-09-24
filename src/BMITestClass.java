public class BMITestClass {
    // Test class used to hardcode in values and ensure the main BMI class functions properly

    public static void main(String[] args) {
        // Testing constructors
        BMI a = new BMI();
        BMI b = new BMI(230, 71, 2);
        BMI c = new BMI();

        // Testing setters
        a.setHeight(180);
        a.setWeight(104);
        a.setOption(1);
        // Setting incorrect values to ensure validation works properly
        c.setHeight(-20);
        c.setWeight(-1);
        c.setOption(9);
        // Testing getters
        System.out.println("a Height: " + a.getHeight());
        System.out.println("a Weight: " + a.getWeight());
        System.out.println("a Option: " + a.getOption());
        System.out.println("b Height: " + b.getHeight());
        System.out.println("b Weight: " + b.getWeight());
        System.out.println("b Option: " + b.getOption());
        System.out.println("c Height: " + c.getHeight());
        System.out.println("c Weight: " + c.getWeight());
        System.out.println("c Option: " + c.getOption());
        // Testing final two methods (one is tested inside the other)
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

    }
}
