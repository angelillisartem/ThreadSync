public class MyThread extends Thread {
    public void run() {
        System.out.print("\nCiao sono spesso e sono: " + currentThread().getName());
    }
}
