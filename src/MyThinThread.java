public class MyThinThread implements Runnable {
    @Override
    public void run() {
        System.out.print("\nCiao sono sottile e sono: " + Thread.currentThread().getName());
    }
}
