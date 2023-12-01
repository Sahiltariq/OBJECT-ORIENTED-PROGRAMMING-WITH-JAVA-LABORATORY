package jit.cse.oops.lab;

public class Square implements Runnable{
    public int x;
    public Square(int x){
        this.x=x;
    }
    public void run(){
        System.out.println("second Thread:square of "+x+"is "+(x*x));
    }
}
