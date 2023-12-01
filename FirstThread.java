package jit.cse.oops.lab;
import java.util.Random;
public class FirstThread implements Runnable{
    public void run(){
        int num=0;
        Random r=new Random();
        try{
            for(int i=0;i<5;i++){
                num=r.nextInt(100);
                System.out.println("Main Thread and generated number is"+num);
                Thread t2=new Thread(new Square(num));
                t2.start();
                Thread t3=new Thread(new Cube(num));
                t3.start();
                Thread.sleep(1000);
                System.out.println("---");
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
