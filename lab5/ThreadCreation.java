// WAP showing thread by both extending and implementing
class ThreadExt extends Thread {
    public void run() { System.out.println("Thread by extending Thread"); }
}

class ThreadImpl implements Runnable {
    public void run() { System.out.println("Thread by implementing Runnable"); }
}

public class ThreadCreation {
    public static void main(String[] args) {
        new ThreadExt().start();
        new Thread(new ThreadImpl()).start();
    }
}