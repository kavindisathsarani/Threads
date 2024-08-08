package lk.ijse;

class Calculation{
    int num;
    public synchronized void increment(){   //if this didn't include synchronized keyword
                                            // different output will be printed each time you run the code
        num++;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Calculation calculation=new Calculation();

        Thread t1=new Thread(()->{
            for (int i = 1; i <= 1000; i++) {
              calculation.increment();
             }
        });


        Thread t2=new Thread(()->{
            for (int i = 1; i <= 1000; i++) {
                calculation.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("calculation.num = " + calculation.num);
    }
}
