package lk.ijse;

public class lambda {
    public static void main(String[] args) {


        Thread thread=new Thread(()->{         //Thread class is implemented by Runnable interface
            for (int i = 1; i <=5; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        );

        Thread thread1=new Thread(()->{
            for (int i = 1; i <=5; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        );

        thread.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread1.start();
    }
}
