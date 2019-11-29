import java.util.Scanner;

public class MetricConversion {
    //My Constants
    private static final double INCH_TO_CM = 2.54;
    private static final double GALLON_TO_LITRES = 3.7854;

    //Blank Constructor to initialise the class
    public MetricConversion() {
    }

    // Conversion method to convert the values using the constant
    public double conversion(double myvalue, double myconstant) {
        return myvalue*myconstant;
    }

    //Main Function
    public static void main(String[] args) {
        Scanner readata = new Scanner(System.in);
        MetricConversion myobject = new MetricConversion();
        System.out.println("Enter Distance in inches");
        int inches = readata.nextInt();
        System.out.println("Enter Number of Gallons");
        int gallons = readata.nextInt();
        System.out.println("Metric Values are:");
        System.out.println(inches+" inches gives "+myobject.conversion(inches,myobject.INCH_TO_CM)+" centimeters(1 inch = 2.54 cm)");
        System.out.println(gallons+" gallons gives "+myobject.conversion(inches,myobject.GALLON_TO_LITRES)+" litres(1 gallon = 3.7854 litres)");
    }
}
