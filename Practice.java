package jit.cse.oops.lab;
public class Practice {
    double length,width,height;
    public Practice(){
        length=width=height=0;
    }
    public Practice( double value)
    {
        length=width=height=value;
    }
    public Practice(double length,double width,double height)
    {
        this.length=length;
        this.width=width;
        this.height=height;

    }
}