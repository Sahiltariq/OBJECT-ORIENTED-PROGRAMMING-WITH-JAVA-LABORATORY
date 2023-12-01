import java.util.Scanner;
public class StaffDemo {
    public static void main(String[] args) {
        String StaffId,name,domain,publication,skill,period;
        long salary,phNum;
        int Teachingcount=0; int Technicalcount=0; int Contractcount=0;
        int i=0;
        Teaching[] TeachingStaff=new Teaching[10];
        Technical[] TechnicalStaff=new Technical[10];
        Contract[] ContractStaff=new Contract[10];
        Scanner in=new Scanner(System.in);
        while(true)
        {
            System.out.println("enter your choice");
            System.out.println("1 Teaching staff entry");
            System.out.println("2 technical staff entry");
            System.out.println("3 contract staff entry ");
            System.out.println("4 teaching staff details");
            System.out.println("5 technical staff details");
            System.out.println("6 contract staff details");
            System.out.println("7 exit");
            int choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("enter teaching staff details(staffId,name,salary,phone number,domain,publication)");
                    StaffId=in.next();
                    name=in.next();
                    salary=in.nextLong();
                    phNum=in.nextLong();
                    domain=in.next();
                    publication=in.next();
                    TeachingStaff[Teachingcount] =new Teaching(StaffId,name,phNum,salary,domain,publication);
                    Teachingcount++;
                    break;
                case 2:
                    System.out.println("enter technical staff details(staffId,name,salary,phone number,skill)");
                    StaffId=in.next();
                    name=in.next();
                    salary=in.nextLong();
                    phNum=in.nextLong();
                    skill=in.next();
                    TechnicalStaff[Teachingcount]=new Technical(StaffId,name,phNum,salary,skill);
                    Technicalcount++;
                    break;
                case 3:
                    System.out.println("enter contract details(StaffId,name,phNum,salary,period)");
                    StaffId=in.next();
                    name=in.next();
                    salary=in.nextLong();
                    phNum=in.nextLong();
                    period=in.next();
                    ContractStaff[Contractcount]=new Contract(StaffId,name,phNum,salary,period);
                    Contractcount++;
                    break;
                case 4:
                    System.out.println("Teaching Staff details");
                    for (i=0; i<Teachingcount; i++)
                        System.out.println(TeachingStaff[i]);
                    break;
                case 5:
                    System.out.println("technical staff details");
                    for (i=0;i<Technicalcount;i++)
                        System.out.println(TechnicalStaff[i]);
                    break;
                case 6:
                    System.out.println("contract staff details");
                    for(i=0;i<Contractcount;i++)
                        System.out.println(ContractStaff[i]);
                    break;
                case 7:System.exit(0);


            }
        }
    }
}
