package jit.cse.oops.lab;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int i;
        int count=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int n=input.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("prime number");
        }
        else
        {
            System.out.println("not a prime number");
        }
    }
}
