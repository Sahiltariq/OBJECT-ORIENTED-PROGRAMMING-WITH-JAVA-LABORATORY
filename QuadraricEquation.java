package Jit.cse.oops.lab;
import java.util.Scanner;

public class QuadraricEquation {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a,b,c");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
                float d=(b*b)-(4*a*c);
                double r1,r2;
        if (d == 0)
        {
            System.out.println("roots are real and equal");
            r1=-b/(2*a);
            r2=r1;
            System.out.println("root1="+r1+ "root2="+r2);
        }
        else if(d>0)
        {
            System.out.println("roots are real and distinct");
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("root1="+r1+"root2="+r2);
        }
        else
        {
            System.out.println("roots are complex");
        }

    }
}
