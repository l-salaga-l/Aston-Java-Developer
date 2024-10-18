package stage8;

public class ExceptionMain extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("end of ExceptionMain");
    }

    public static void main(String[] args) {
        new ExceptionMain().start();
        System.out.println("end of main with exception");
        throw new RuntimeException();
    }
}
