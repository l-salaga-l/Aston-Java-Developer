package stage8;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable is running");
    }

    public static void main(String[] args) {
        // Первый вариант
        Thread thread = new Thread(new MyRunnable());

        // Второй вариант
        Thread thread1 = new Thread(() -> {
            System.out.println("MyRunnable is running");
        });
    }
}
