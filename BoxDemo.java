package Jit.ces.over.loading;

public class BoxDemo {
    public static void main(String[] args) {
        Box ob1=new Box();
        System.out.println("value of box from default constructor");
        System.out.println("length="+ob1.length);
        System.out.println("width="+ob1.width);
        System.out.println("height="+ob1.height);
         Box ob2=new Box(11.52);
        System.out.println("values of box from single parameterized constructor");
        System.out.println("length="+ob2.length);
        System.out.println("width+"+ob2.width);
        System.out.println("height="+ob2.height);
        Box ob3=new Box(1.1,2.2,3.3);
        System.out.println("values of box from paramaterized constructor");
        System.out.println("length="+ob3.length);
        System.out.println("width="+ob3.width);
        System.out.println("height="+ob3.height);
    }
}
