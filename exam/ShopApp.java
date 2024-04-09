package exam;

public class ShopApp {
    public static boolean isAFit(Customer customer, Cloth cloth){
        if(customer.getSize() == cloth.getSize()){
            return true;
        }
        else{
            return false;
        }
    }
    public static double calculateSubTotal(Cloth[] clothes){
        double total = 0;
        for(int i = 0; i < clothes.length; i++){
            total += clothes[i].getPrice();
        }
        return total;
    }
    public static void printClassNamesOfPayableEntities(Payable[] items){

    }
}
