public class DeadlockDemo {
    public static void main(String[] args) {
        final String resource1 = "Resource1";
        final String resource2 = "Resource2";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1 locked Resource1");
                    try { Thread.sleep(100); } catch (Exception e) {}
                    synchronized (resource2) {
                        System.out.println("Thread 1 locked Resource2");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2 locked Resource2");
                    try { Thread.sleep(100); } catch (Exception e) {}
                    synchronized (resource1) {
                        System.out.println("Thread 2 locked Resource1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
