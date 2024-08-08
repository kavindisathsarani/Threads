package lk.ijse;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread=new Thread(()->{
            for (int i = 1; i <=5; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread1=new Thread(()->{
            for (int i = 1; i <=5; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();
        System.out.println(thread.isAlive());

       // thread.join();    //this will print first thread output until it ends then print bye then
                            //the 2 nd thread output will be printed.

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread1.start();
        System.out.println(thread.isAlive());


        thread1.join();    //this helps to print bye at the end of the parallel threads execution
        System.out.println(thread.isAlive());


        thread.join();     //this helps to print bye at the end of the parallel threads execution
        System.out.println(thread.isAlive());


        System.out.println("bye");
    }
}
