// How to aviod dead lock? WAP showing it.
public class DeadlockAvoidance {
    static final Object Lock1 = new Object();
    static final Object Lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (Lock1) {
                System.out.println("Thread 1: Locked 1");
                synchronized (Lock2) { System.out.println("Thread 1: Locked 2"); }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (Lock1) {
                System.out.println("Thread 2: Locked 1 first to avoid deadlock");
                synchronized (Lock2) { System.out.println("Thread 2: Locked 2"); }
            }
        });

        t1.start();
        t2.start();
    }
}