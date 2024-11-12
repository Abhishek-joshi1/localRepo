package Practical;

class myThread extends Thread{
    public void run(){
        int i = 0;
        while (i < 100) {
            System.out.println("My Thread is running.");
            System.out.println("I am Happy");
            i++;
        }
    }
}

class myThread2 extends Thread{
    public void run(){
        int i = 0; 
        while (i < 100) {
            System.out.println("My Thread2 is running.");
            System.out.println("I am okok");
            i++;
        }
    }
}

public class list6 {

    public static void main(String[] args) {
        myThread t1 = new myThread();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}
