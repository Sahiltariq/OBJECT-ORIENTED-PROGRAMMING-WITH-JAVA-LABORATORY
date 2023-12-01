package jit.cse.oops.lab;
import java.util.Scanner;
public class sts  implements Resume{
    public String name,usn,branch;
    public float result;
    Scanner input=new Scanner(System.in);

    @Override
    public void bioData() {
        System.out.println("---student---");
        System.out.println("enter name,usn,branch,result");
        name=input.next();
        usn=input.next();
        branch=input.next();
        result=input.nextFloat();
        System.out.println("name="+name);
        System.out.println("usn="+usn);
        System.out.println("branch="+branch);
        System.out.println("result="+result);
    }
}
