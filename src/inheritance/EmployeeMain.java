package inheritance;

import java.util.Scanner;

import static java.lang.System.exit;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the choice to check the salary of fulltime or parttime employee press 1 for fulltime or press 2 for parttime ");
        int choice=sc.nextInt();
        System.out.println("enter the id");
        int id=sc.nextInt();
        System.out.println("enter the name");
        String name=sc.next();
        System.out.println("enter the age");
        int age= sc.nextInt();
        System.out.println("enter the designation");
        String designation=sc.next();
       //Employee emp=new Employee(id,name,age,designation);
        Fulltime full=new Fulltime(id,name,age,designation);
        parttime part=new parttime(id,name,age,designation);
        System.out.println("enter the number of hours and payrate");
        int hour=sc.nextInt();
        double payrate1=sc.nextDouble();
        switch (choice){
            case 1:
                full.setNumbersofhours(hour);
                full.setPayrate(hour);
                full.showdetails();
                full.calculate();
                break;
            case 2:
                part.setNumbersofhours(hour);
                part.setPayrate(payrate1);
                part.showdetails();
                part.calculate();
                break;
            default:
                System.out.println("wrong input");
        }
        exit(0);

    }
}
