package jit.cse.time.conveter;
import java.util.*;
public class TimeConveter {
    Scanner input=new Scanner(System.in);
    private int hour,mint,sec;
    int value;
    public void hourToSeconds(){
        System.out.println("enter hour for conversion");
        hour=input.nextInt();
        sec=hour*3600;
        System.out.println("hour="+hour+" equalivalent to seconds="+sec);
    }
    public void secondToHour()
    {
        System.out.println("enter sec for conversion");
        value=input.nextInt();
        hour=sec/3600;
        mint=  ((value%3600)%60);
        System.out.println("seconds="+value+" equalivalent to hour="+hour+":"+mint+":"+sec);
    }
    public void hourToMint()
    {
        System.out.println("enter hour for conversion");
        hour=input.nextInt();
        mint=hour*60;
        System.out.println("hour="+hour+" equalivalent to mintue="+mint);
    }
    public void mintToHour()
    {
        System.out.println("enter mint for conversion");
        value=input.nextInt();
        hour=mint/60;
        mint=  value%60 ;
        System.out.println("mint="+mint+" equalivalent to hour="+hour+":"+mint);
    }

}
