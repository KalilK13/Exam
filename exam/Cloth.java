package exam;

public class Cloth {
    private String name;
    private double price;
    private Size size;

    public Cloth(String name, double price, Size size) {
        this.name = name;
        setPrice(price);
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0){
            this.price = price;
        }
        else{
            System.out.println("price cannot be negative.");
        }
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }


}
