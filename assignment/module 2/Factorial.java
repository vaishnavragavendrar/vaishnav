class Factorial {
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;  
        } else {
            return n * fact(n - 1); 
        }
    }

    // Main method
    public static void main(String[] args) {
        int num = 5;  // you can change this value
        System.out.println("Factorial of " + num + " is: " + fact(num));
    }
}
