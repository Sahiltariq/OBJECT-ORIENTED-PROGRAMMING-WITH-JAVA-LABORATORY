package Jit.ces.over.loading;

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        MethodOverloadind ob=new MethodOverloadind();
        ob.display();
        ob.display(10);
        ob.display(1.1f);
        ob.display(10,1.1f);
        ob.display( 1.1f,10);

    }
}
