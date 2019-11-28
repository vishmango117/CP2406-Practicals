public class InchesToFeet {
    private static final int INCHES_TO_FEET = 12;
    private int no_of_inches;

    public InchesToFeet(int no_of_inches) {
        this.no_of_inches = no_of_inches;
    }

    public static void main(String[] args) {
        InchesToFeet myobject = new InchesToFeet(86);
        System.out.println(myobject.no_of_inches+
                " Inches is "+myobject.no_of_inches/INCHES_TO_FEET+
                " Feet plus "+
                myobject.no_of_inches % myobject.INCHES_TO_FEET +
                " Inches");
    }
}
