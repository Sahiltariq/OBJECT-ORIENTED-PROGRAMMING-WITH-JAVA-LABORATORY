package jit.cse.oops.lab;
public class p2 {
    public static void main(String[] args) {
        Practice ob1=new Practice();
        System.out.println("values of box from default constructor");
        System.out.println("length="+ob1.length);
        System.out.println("width="+ob1.width);
        System.out.println("height="+ob1.height);
        Practice ob2=new Practice(11.56);
        System.out.println("values of box from single ");
        System.out.println("values of box from default constructor");
        System.out.println("length="+ob2.length);
        System.out.println("width="+ob2.width);
        System.out.println("height="+ob2.height);
        Practice ob3=new Practice(1.1,2.2,3.3);
        System.out.println("values of box from default constructor");
        System.out.println("length="+ob3.length);
        System.out.println("width="+ob3.width);
        System.out.println("height="+ob3.height);
    }
}