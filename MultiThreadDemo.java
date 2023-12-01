package jit.cse.oops.lab;

public class MultiThreadDemo {
    public static void main(String[] args) {
        FirstThread ob=new FirstThread();
        Thread t=new Thread(ob);
        t.start();
    }
}
