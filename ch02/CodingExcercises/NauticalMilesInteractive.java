import java.util.Scanner;

public class NauticalMilesInteractive {
    private static final double NAUTICAL_MILES_TO_KM  = 1.852;
    private static final double NAUTICAL_MILES_TO_MILES  = 1.150779;
    private double nautical_miles;

    public NauticalMilesInteractive(int nautical_miles) {
        this.nautical_miles = nautical_miles;
    }

    public static void main(String[] args) {
        Scanner readdata = new Scanner(System.in);
        System.out.println("Enter Number of Nautical Miles");
        NauticalMilesInteractive myobject= new NauticalMilesInteractive(readdata.nextInt());
        System.out.println(myobject.nautical_miles+
                " quarts is "+myobject.nautical_miles*NAUTICAL_MILES_TO_KM+
                " Kilometres and "+
                myobject.nautical_miles*NAUTICAL_MILES_TO_MILES +
                " Miles");
    }
}
