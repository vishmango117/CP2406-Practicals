public class NauticalMiles {
    private static final double NAUTICAL_MILES_TO_KM  = 1.852;
    private static final double NAUTICAL_MILES_TO_MILES  = 1.150779;
    private double nautical_miles;

    public NauticalMiles(int nautical_miles) {
        this.nautical_miles = nautical_miles;
    }

    public static void main(String[] args) {
        NauticalMiles myobject= new NauticalMiles(2);
        System.out.println(myobject.nautical_miles+
                "Nautical Miles is "+myobject.nautical_miles*NAUTICAL_MILES_TO_KM+
                " Kilometres and "+
                myobject.nautical_miles*NAUTICAL_MILES_TO_MILES +
                " Miles");
    }
}
