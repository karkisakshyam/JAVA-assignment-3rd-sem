// WAP showing different methods for synchronization.
class SyncDemo {
    public synchronized void syncMethod() {
        System.out.println("Synchronized Method");
    }

    public void syncBlock() {
        synchronized(this) {
            System.out.println("Synchronized Block");
        }
    }
}

public class SyncMethods {
    public static void main(String[] args) {
        SyncDemo obj = new SyncDemo();
        new Thread(() -> obj.syncMethod()).start();
        new Thread(() -> obj.syncBlock()).start();
    }
}