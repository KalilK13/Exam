package exam;

public abstract class Customer extends Person{

    private Cloth[] clothingItems;
    public Customer(String name, Size size) {
        super(name, size);
    }

    public abstract void printPriceAfterDiscount(Cloth cloth);
}
