package stage8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "MyCallable is running";
    }

    public static void main(String[] args) {
        // Первый вариант
        FutureTask<String> futureTask = new FutureTask<>(new MyCallable());

        // Второй вариант
        FutureTask<String> futureTask2 = new FutureTask<>(() -> {
            return Thread.currentThread().getName();
        });

        new Thread(futureTask).start();
        new Thread(futureTask2).start();
        try {
            System.out.println(futureTask.get());
            System.out.println(futureTask2.get());
        }
        catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
