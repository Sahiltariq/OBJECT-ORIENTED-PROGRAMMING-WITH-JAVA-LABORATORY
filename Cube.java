package jit.cse.oops.lab;

public class Cube implements Runnable{
    public int x;
    public Cube(int x){
        this.x=x;
    }
    public void run(){
        System.out.println("Third Thread:cube of"+x+" is"+(x*x*x));
    }
}
