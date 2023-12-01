package jit.cse.currency.conveter;
import java.util.Scanner;
public class CurrencyConcveter {
    Scanner input=new Scanner(System.in);
    private double inr,euro,yen,usd;
    public void dollerToRupee()
    {
        System.out.println("enter usd for conversion");
        usd=input.nextDouble();
        inr=usd*80.89;
        System.out.println("doller="+usd+" equalivalent to rupee="+inr);
    }
    public void rupeeToDoller()
    {
        System.out.println("enter rupee for conversion");
        inr=input.nextDouble();
        usd=inr/80.89;
        System.out.println("rupee="+inr+" equalivalent to doller="+usd);
    }
    public void euroToRupee(){
        System.out.println("enter euro for conversion");
        euro=input.nextDouble();
        inr=euro*88.89;
        System.out.println("euro="+euro+" equalivalent to rupee="+inr);
    }
    public void rupeeToEuro(){
        System.out.println("enter rupee for conversion");
        inr=input.nextDouble();
        euro=inr*88.89;
        System.out.println("rupee="+inr+" equalivalent to euro="+euro);
    }
    public void yenToRupee(){
        System.out.println("enter yen for conversion");
        yen=input.nextDouble();
        inr=yen*0.26;
        System.out.println("yen="+yen+" equalivalent to rupee="+inr);
    }
    public void rupeeToYen(){
        System.out.println("enter rupee for conversion");
        inr=input.nextDouble();
        yen=inr/0.26;
        System.out.println("rupee="+inr+" equalivalent to yen="+yen);
    }
}
