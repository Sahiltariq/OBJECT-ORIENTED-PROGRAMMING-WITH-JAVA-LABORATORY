package jit.cse.distance.conveter;
import java.util.*;
public class DistanceConveter {
    private double km,m,mil;
    Scanner input=new Scanner(System.in);
    public void kmToMeter(){
        System.out.println("enter km for conversion");
        km=input.nextDouble();
        m=km*1000;
        System.out.println("kilometer="+km+" equalivalent to meter="+m);
    }
    public void meterToKm(){
        System.out.println("enter m for conversion");
        m=input.nextDouble();
        km=km/1000;
        System.out.println("meter="+m+" equalivalent to kilometer="+km);
    }
    public void kmToMiles(){
        System.out.println("enter km for conversion");
        km=input.nextDouble();
        mil=km/1.6;
        System.out.println("kilometer="+km+" equalivalent to miles="+mil);
    }
    public void milesToKm(){
        System.out.println("enter miles for conversion");
        mil=input.nextDouble();
        km=km*1.6;
        System.out.println("miles="+mil+" equalivalent to kilometer="+km);
    }

}
