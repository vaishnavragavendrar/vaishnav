class Test {
    protected void finalize() {
        System.out.println("Object Garbage Collected");
    }
}

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        Test obj1 = new Test();
        Test obj2 = new Test();

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}
