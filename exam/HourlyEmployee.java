package exam;

public class HourlyEmployee extends Employee{
    private float hoursWorked;
    private double hourlyWage;

    public HourlyEmployee(String name, Size size, float hoursWorked, double hourlyWage) {
        super(name, size);
        setHoursWorked(hoursWorked);
        setHourlyWage(hourlyWage);
    }


    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public void printInfo() {

    }

    public double calculatePay() {
        return hourlyWage * hoursWorked;
    }

    @Override
    public void printPriceAfterDiscount(Cloth cloth) {
        System.out.println(cloth.getPrice() - (cloth.getPrice() * DISCOUNT));
    }
}
