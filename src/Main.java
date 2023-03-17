public class Main {
    public static void main(String[] args) throws InterruptedException {
        //        Inizio Commento
        //        MyThread t1 = new MyThread();
        //        t1.start();
        //        MyThinThread mt1 = new MyThinThread();
        //        Thread t2 = new Thread(mt1);
        //        t2.start();
        //        new Thread(new Runnable() {
        //            @Override
        //            public void run() {
        //                System.out.print("\nCiao sono sottile a runnable e sono: " + Thread.currentThread().getName());
        //            }
        //        }).start();
        //
        //        ContoCorrente cc = new ContoCorrente(1000);
        //        Thread gen1 = new Thread(new Runnable() {
        //            @Override
        //            public void run() {
        //                cc.versa(1000);
        //                cc.stampaSaldo();
        //            }
        //        });
        //        Thread gen2 = new Thread(new Runnable() {
        //            @Override
        //            public void run() {
        //                cc.versa(500);
        //                cc.stampaSaldo();
        //            }
        //        });
        //        gen1.start();
        //        gen2.start();
        //        Fine Commento

        Incrementatore incrementatore = new Incrementatore();
        Thread t1 = new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i < 10000; i++) {
                   incrementatore.incrementa();
               }
           }
       });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    incrementatore.incrementa();
                }
            }
        });

       t1.start();
       t2.start();
       t1.join();
       t2.join();
       System.out.print("Incrementatore: " + incrementatore.incrementometro);
    }

}