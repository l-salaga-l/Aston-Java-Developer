package stage8;

public class ExceptionThread extends Thread {
    @Override
    public void run() {
        boolean flag = true;
        if (flag) {
            throw new RuntimeException();
        }
        System.out.println("end of ExceptionThread");
    }

    public static void main(String[] args) throws InterruptedException {
        new ExceptionThread().start();
        Thread.sleep(1000);
        System.out.println("end of main");
    }
}
