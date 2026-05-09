// How to solve concurrency problem? WAP to show it.
class SharedCounter {
    private int count = 0;
    public synchronized void increment() { count++; }
    public int getCount() { return count; }
}

public class ConcurrencySolution {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter sc = new SharedCounter();
        Thread t1 = new Thread(() -> { for(int i=0; i<1000; i++) sc.increment(); });
        Thread t2 = new Thread(() -> { for(int i=0; i<1000; i++) sc.increment(); });
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Final Count (Synchronized): " + sc.getCount());
    }
}