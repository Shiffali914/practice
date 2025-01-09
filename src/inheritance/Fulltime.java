package inheritance;

public class Fulltime extends Employee{

    public Fulltime(int id, String name, int age,String designation) {
        super(id, name, age,designation);
    }

    @Override
    public void showdetails() {
        super.showdetails();
    }

   /* @Override
    public int getNumbersofhours() {
        return super.getNumbersofhours();
    }

    @Override
    public void setNumbersofhours(int numbersofhours) {
        super.setNumbersofhours(numbersofhours);
    }

    @Override
    public double getPayrate() {
        return super.getPayrate();
    }

    @Override
    public void setPayrate(double payrate) {
        super.setPayrate(payrate);
    }*/

    double basicpay;
    public void calculate(){
        if (numbersofhours >= 40) {
            basicpay=40*payrate;
            int overtime=numbersofhours-40;
            double overtimerate=payrate*1.5;
            double overtimepay=overtimerate*overtime;
            double netsalary=basicpay+overtimepay;
            System.out.println("Netsalary is"+netsalary);

        }
        else{
            basicpay = numbersofhours * payrate;
            System.out.println("Netsalary is" + basicpay);
        }

    }}

