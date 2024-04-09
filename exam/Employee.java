package exam;

public abstract class Employee extends Customer implements Payable {
    protected final double DISCOUNT = .10;

    public Employee(String name, Size size) {
        super(name, size);
    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
