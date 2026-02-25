public class MethOver{
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        CalculatorDemo obj = new CalculatorDemo();
        System.out.println("Sum of two integers: " + obj.add(10, 20));
        System.out.println("Sum of two decimals: " + obj.add(5.5, 3.2));
        System.out.println("Sum of three integers: " + obj.add(2, 4, 6));
    }
}
