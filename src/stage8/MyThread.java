package stage8;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread is running");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
