package Jit.ces.over.loading;

public class MethodOverloadind {
    public void display(){
        System.out.println("display with no parameter");
    }
    public void display(int a){
        System.out.println("display with integer parameter");
    }
    public void display(float b){
        System.out.println("display with float parameter");
    }
    public void display(int a,float b){
        System.out.println("display with integer and float parameter");
    }
    public void display(float b,int a){
        System.out.println("display with float and integer parameter");
    }
}
