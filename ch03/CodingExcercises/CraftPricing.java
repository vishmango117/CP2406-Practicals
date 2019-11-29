import java.util.Scanner;

//
public class CraftPricing {
    private static final int PRICE_MULTIPLIER = 12;
    private static final int COST_OF_SHIPPING_HANDLING = 7;

    private String product_name;
    private double no_of_hours;
    private double cost_of_materials;

    public CraftPricing(String product_name, double no_of_hours,double cost_of_materials) {
        this.product_name = product_name;
        this.no_of_hours = no_of_hours;
        this.cost_of_materials = cost_of_materials;
    }

    public double computeRetailPrice() {
        return ((this.cost_of_materials+this.PRICE_MULTIPLIER)*this.no_of_hours)+this.COST_OF_SHIPPING_HANDLING;
    }

    public static void main(String[] args) {
        Scanner readata = new Scanner(System.in);
        System.out.println("Enter Product Name");
        String prod_name = readata.nextLine();
        System.out.println("Enter Number of Hours");
        double no_of_hours= readata.nextInt();
        System.out.println("Enter Cost of Materials");
        double cost_of_materials = readata.nextInt();
        CraftPricing myobject = new CraftPricing(prod_name, no_of_hours, cost_of_materials);
        System.out.println("Total Cost for "+myobject.product_name+" is "+myobject.computeRetailPrice());
    }


}
