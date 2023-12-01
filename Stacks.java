package jit.cse.oops.lab;
import java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> numberStack = new Stack<Integer>();
        numberStack.push(10);
        numberStack.push(20);
        numberStack.push(30);
        numberStack.push(40);
        System.out.println("Stack elements: " + numberStack);
        int poppedNumber = numberStack.pop();
        System.out.println("Popped element: " + poppedNumber);
        System.out.println("Stack elements after pop: " + numberStack);
        int topNumber = numberStack.peek();
        System.out.println("Top element: " + topNumber);
        boolean isEmpty = numberStack.empty();
        System.out.println("Is the stack empty? " + isEmpty);
        int size = numberStack.size();
        System.out.println("Size of the stack: " + size);
    }
}