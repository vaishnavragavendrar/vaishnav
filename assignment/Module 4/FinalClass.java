final class FinalClass {
    final int value = 100;

    final void display() {
        System.out.println("Final Method");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        System.out.println(obj.value);
        obj.display();
    }
}
