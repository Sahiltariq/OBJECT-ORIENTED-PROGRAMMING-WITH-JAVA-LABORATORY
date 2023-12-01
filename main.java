package jit.cse.oops.lab;

import java.util.Scanner;

public class main {
    static final int MAX = 10;
    static int[] s = new int[MAX];
    static int top = -1;

    public static boolean isUnderflow() {
        return top == -1;
    }

    public static boolean isOverflow() {
        return top == MAX - 1;
    }

    public static void push() {
        if (isOverflow()) {
            System.out.println("Stack is full");
        } else {
            System.out.print("Enter the element to be inserted: ");
            Scanner sc = new Scanner(System.in);
            s[++top] = sc.nextInt();
        }
    }

    public static void pop() {
        if (isUnderflow()) {
            System.out.println("Stack underflow");
        } else {
            System.out.print("Enter the element to be popped: ");
            System.out.println("The popped element is " + s[top--]);
        }
    }

    public static void display() {
        int t = top;
        if (t == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements are:");
            for (int i = 0; i <= t; i++) {
                System.out.print(s[i] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("---Menu---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        } while (ch != 4);
    }
}
