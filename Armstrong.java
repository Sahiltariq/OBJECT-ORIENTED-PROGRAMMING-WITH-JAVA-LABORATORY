package jit.cse.oops.lab;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        int digit=0;
        int sum=0;
        int last=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int n=input.nextInt();
        int temp=n;
        while(temp>0)
        {
            temp=temp/10;
            digit++;
        }
        temp=n;
        while(temp!=0){
            last=temp%10;
            sum= (int) (sum+Math.pow(last,digit));
            temp=temp/10;
        }
        if(n==sum)
        {
            System.out.println("asrmstromg number");
        }
        else
        {
            System.out.println("not a armstrong number");
        }
    }
}
