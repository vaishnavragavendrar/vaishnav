public class ThreadLifeCycleDemo {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        });

        System.out.println("State after creation: " + t.getState());

        t.start();
        System.out.println("State after start: " + t.getState());

        try {
            Thread.sleep(100);
            System.out.println("State during sleep: " + t.getState());
            t.join();
        } catch (Exception e) {}

        System.out.println("State after completion: " + t.getState());
    }
}
