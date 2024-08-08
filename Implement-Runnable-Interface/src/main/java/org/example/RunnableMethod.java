package org.example;

class One implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class Two implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class RunnableMethod {
    public static void main(String[] args) {
        Runnable one=new One();  //can make referece type from Runnable Inteface
                                  // caz the One class is implemented by Runnable interface instead of
                                  //making One one=new One();

        Runnable two=new Two();

        Thread thread=new Thread(one);
        Thread thread1=new Thread(two);

        thread.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread1.start();
    }
}
