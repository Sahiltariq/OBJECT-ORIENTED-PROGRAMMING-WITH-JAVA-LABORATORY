package jit.cse.oops.lab;
import java.util.*;

import jit.cse.currency.conveter.CurrencyConcveter;
import jit.cse.distance.conveter.DistanceConveter;
import jit.cse.time.conveter.TimeConveter;

public class ConveterDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ch;
        DistanceConveter d = new DistanceConveter();
        CurrencyConcveter c = new CurrencyConcveter();
        TimeConveter t = new TimeConveter();
        while (true) {
            System.out.println("1.meter to km \n 2.km to meter");
            System.out.println("2. miles to km \n 4.km to miles ");
            System.out.println("5.dollar to rupee \n 6. rupee to dollar ");
            System.out.println("7.euro to rupee\n 8.rupee to euro");
            System.out.println("9.yen to rupee\n 10.rupee to yen");
            System.out.println("11.mint to hour \n 12.hour to mint");
            System.out.println("13.second to hour \n 14.hour to second");
            System.out.println("15.exit");
            System.out.println("enter your choice");
            ch = input.nextInt();
            switch (ch)
            {
                case 1:d.kmToMeter();
                break;
                case 2:d.meterToKm();
                break;
                case 3:d.kmToMiles();
                break;
                case 4:d.milesToKm();
                break;
                case 5:c.dollerToRupee();
                break;
                case 6:c.rupeeToDoller();
                break;
                case 7:c.euroToRupee();
                break;
                case 8:c.rupeeToEuro();
                break;
                case 9:c.yenToRupee();
                break;
                case 10:c.rupeeToYen();
                break;
                case 11:t.hourToMint();
                break;
                case 12:t.mintToHour();
                break;
                case 13:t.hourToSeconds();
                break;
                case 14:t.secondToHour();
                break;
                case 15:
                    System.out.println("invalid choice");

            }


        }
    }
}