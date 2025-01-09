package inheritance;

public class Employee {

                int id;
                String name;
                int age;
                String designation;
                int numbersofhours;
                double payrate;

    public Employee(int id, String name,int age, String designation) {
        this.id = id;
        this.name = name;
        this.age=age;
        this.designation = designation;
    }

    public int getNumbersofhours() {
        return numbersofhours;
    }

    public void setNumbersofhours(int numbersofhours) {
        this.numbersofhours = numbersofhours;
    }

    public double getPayrate() {
        return payrate;
    }

    public void setPayrate(double payrate) {
        this.payrate = payrate;
    }

    public void showdetails(){
        System.out.println("..............EMPLOYEE DETAILS............");
        System.out.println("Id employee is "+id);
        System.out.println("Name of employee is "+name);
        System.out.println("Age of employee is "+age);
        System.out.println("Designation of employee is "+designation);
    }
}
