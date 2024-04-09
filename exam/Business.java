package exam;

public class Business implements Payable{
    private String name;
    private int productQtySupplied;
    private double productPrice;
    public Business(String name, int productQtySupplied, double productPrice){
        setProductPrice(productPrice);
        setProductQtySupplied(productQtySupplied);
        setName(name);
    }

    public int getProductQtySupplied() {
        return productQtySupplied;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductQtySupplied(int productQtySupplied) {
        if (productQtySupplied >= 0){
            this.productQtySupplied = productQtySupplied;
        }
        else{
            System.out.println("product quantity cannot be negative");
        }

    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        if (productPrice >= 0){
            this.productPrice = productPrice;
        }
        else{
            System.out.println("product price cannot be negative.");
        }

    }

    public double calculatePay() {
        return productPrice * productQtySupplied;
    }
}
