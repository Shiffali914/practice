package inheritance;

public class parttime extends Employee{
    public parttime(int id, String name,int age, String designation) {
        super(id, name, age,designation);
    }


    double basicpay;
    public void calculate() {
       basicpay=numbersofhours*payrate;
        System.out.println("Netsalary is"+basicpay);
    }
}
