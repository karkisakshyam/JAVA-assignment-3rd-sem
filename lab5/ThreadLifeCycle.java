// WAP showing thread life cycle.
public class ThreadLifeCycle {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        });
        System.out.println("State: " + t.getState()); 
        t.start();
        System.out.println("State: " + t.getState());
        Thread.sleep(50);
        System.out.println("State: " + t.getState());
        t.join();
        System.out.println("State: " + t.getState());
    }
}