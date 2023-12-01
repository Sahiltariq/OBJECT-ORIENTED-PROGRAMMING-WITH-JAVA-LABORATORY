package jit.cse.oops.lab;
import java.io.File;
import java.io.*;
import java.util.*;
public class FileDemo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the file name");
        String filename = s.next();
        File f1=new File("C:\\Users\\HP\\java\\ONE\\out\\production\\ONE\\jit\\cse\\oops\\lab"+filename);
        System.out.println("FILE INFORMATION");
        System.out.println("***");
        System.out.println("name of file is "+f1.getName());
        System.out.println("path of file is"+f1.getPath());
        System.out.println("parent of file"+f1.getParent());
        if(f1.exists())
            System.out.println("file exists");
        else
            System.out.println("not exists");
        if(f1.canRead())
            System.out.println("readable");
        else
        System.out.println("not readable");
        if(f1.canWrite())
            System.out.println("operation perited");
        else
            System.out.println("not permited");
        if(f1.isDirectory())
            System.out.println("is a directory");
        else
            System.out.println("not directory");
        if(f1.isFile())
            System.out.println(" is file");
        else
            System.out.println("not a file");
        System.out.println("last modified"+f1.lastModified());
        System.out.println("length of file"+f1.length());
        System.out.println("file deleted"+f1.delete());
    }
}
