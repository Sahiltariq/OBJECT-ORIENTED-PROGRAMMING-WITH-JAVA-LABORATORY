package Jit.ces.over.loading;

public class Box {
    double length,height,width;
    public Box(){
        height=width=length=0.0;
    }
    public Box(double value){
        length=width=height=value;
    }
    public Box(double length,double height,double width){
        this.length=length;
        this.width=width;
        this.height=height;
    }
}
