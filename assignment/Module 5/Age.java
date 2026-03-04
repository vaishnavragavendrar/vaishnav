public class Age {
    static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        validateAge(16);
    }
}
