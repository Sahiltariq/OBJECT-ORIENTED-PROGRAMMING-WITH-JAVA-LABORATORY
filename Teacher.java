package jit.cse.oops.lab;
import java.awt.*;
import java.util.Scanner;
public class Teacher implements Resume {
    public String name,id,domain,qualification,achievement;
      public float experience;
      Scanner input=new Scanner(System.in);


    public void bioData() {
        System.out.println("enter name,id,qualification,domain,achievements,experience");
        name=input.next();
        id=input.next();
        qualification=input.next();
        domain=input.next();
        achievement=input.next();
        experience=input.nextFloat();
        System.out.println("----");
        System.out.println("teacher deatils are");
        System.out.println("name="+name);
        System.out.println("id="+id);
        System.out.println("qualification="+qualification);
        System.out.println("experience="+experience);
        System.out.println("acheivements="+achievement);


    }
}
