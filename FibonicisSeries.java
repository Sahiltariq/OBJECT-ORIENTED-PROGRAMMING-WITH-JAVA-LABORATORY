package jit.cse.oops.lab;
import java.util.Scanner;
public class FibonicisSeries {
    public static void main(String[] args) {
        int n1=0,n2=1,n3,i;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of terms");
        int count=input.nextInt();
        for(i=2;i<count;++i)
        {
            n3=n2+n1;
            System.out.print("  "+n3);
            n1=n2;
            n2=n3;
        }
    }

}
