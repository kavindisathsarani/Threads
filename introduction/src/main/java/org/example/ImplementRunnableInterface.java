package org.example;


    class MyThreadR implements Runnable{

        @Override
        public void run() {
            System.out.println("thread is running");
        }
    }
public class ImplementRunnableInterface {

    public static void main(String[] args) {
        MyThreadR myThreadR=new MyThreadR();
        Thread thread=new Thread(myThreadR);
        thread.start();
      }
}
