package Jit.cse.oops.lab;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter value of a and b");
        int a=input.nextInt();
        int b= input.nextInt();
        System.out.println("enter the operation");
        String op= input.next();
        switch (op)
        {
            case "+": System.out.println("additon="+(a+b));
            break;
            case "-": System.out.println("subtraction="+(a-b));
            break;
            case "/": System.out.println("divsion="+(a+b));
            break;
            case "*": System.out.println("multipilication="+(a+b));
            break;
            case "%": System.out.println("reminder="+(a%b));
            break;
            default:
                System.out.println("invalid operation");
        }
    }
}
