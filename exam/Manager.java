package exam;

public class Manager extends Employee{
    private final double EXTRA_DISCOUNT = .05;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0){
            this.salary = salary;
        }
        else{
            System.out.println("Manager salary cannot be negative.");
        }
    }

    public Manager(String name, Size size, double salary) {
        super(name, size);
        setSalary(salary);
    }




    public void printInfo() {

    }


    public double calculatePay() {
        return salary;
    }

    @Override
    public void printPriceAfterDiscount(Cloth cloth) {
        System.out.println(cloth.getPrice() - (cloth.getPrice() * DISCOUNT));
    }
}
