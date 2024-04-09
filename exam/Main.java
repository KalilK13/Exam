package exam;

public class Main {
    public static void main(String[] args) {

        Cloth jeans = new Cloth("jeans",60.0 ,Size.S);
        Cloth t_shirt = new Cloth("t_shirt",20.0,Size.M);
        Cloth shorts = new Cloth("shorts",15.0,Size.L);

        Cloth[] clothes = {jeans, t_shirt, shorts};
        System.out.println(ShopApp.calculateSubTotal(clothes));

        Student mark = new Student("Mark", Size.XL);
        Student anthony = new Student("Anothony", Size.M);

        mark.printInfo();

        mark.printUniqueStudentID();
        anthony.printUniqueStudentID();
        mark.printUniqueStudentID();

        mark.printInfo();

        System.out.println(ShopApp.isAFit(anthony, t_shirt));

        Manager lee = new Manager("Lee", Size.XL, 50000.0);

        HourlyEmployee sam = new HourlyEmployee("Sam", Size.S, 40, 15.0);

        Business walmart = new Business("Walmart", 20, 30.0);

        Customer[] customers = {mark, anthony, lee};
        for (Customer c: customers){
            c.printPriceAfterDiscount(t_shirt);
        }

        walmart.setProductPrice(-100);

        System.out.println(walmart.calculatePay());

        Payable[] payableEntities = {walmart, lee, sam};

        Employee managerToEmployee = new HourlyEmployee("Bill", Size.L, 30, 20);
        System.out.println(((HourlyEmployee)managerToEmployee).getHourlyWage());





    }
}
