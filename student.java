package Jit.cse.oops.lab;
public class student{
    private String name,usn,branch;
    private long number;

    public student(String name, String usn, String branch, long number) {
        this.name = name;
        this.usn = usn;
        this.branch = branch;
        this.number = number;
    }

    @Override
    public String toString() {
        return "student{" + "name='" + name + '\'' + ", usn='" + usn + '\'' + ", branch='" + branch + '\'' + ", number=" + number + '}';
    }
}
