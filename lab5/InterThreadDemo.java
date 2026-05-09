// WAP shwoing inter thread communication.
class InterThread {
    boolean ready = false;

    public synchronized void produce() {
        ready = true;
        System.out.println("Data Produced");
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (!ready) wait();
        System.out.println("Data Consumed");
    }
}

public class InterThreadDemo {
    public static void main(String[] args) {
        InterThread obj = new InterThread();
        new Thread(() -> { try { obj.consume(); } catch (Exception e) {} }).start();
        new Thread(() -> obj.produce()).start();
    }
}