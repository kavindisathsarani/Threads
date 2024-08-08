package lk.ijse;

class MyThread extends Thread{
   public void run(){
       System.out.println("thread is running");
   }
}

public class ExtendThreadClass {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
    }
}
