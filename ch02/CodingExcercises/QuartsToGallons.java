public class QuartsToGallons {
    // Variable Instances and Class Variable
    private static final int QUARTS_TO_GALLONS  = 4;
    private int no_of_quarts;

    //Constructor
    public QuartsToGallons(int no_of_quarts) {
        this.no_of_quarts = no_of_quarts;
    }

    // Main Function
    public static void main(String[] args) {
        QuartsToGallons myobject= new QuartsToGallons(18);
        System.out.println(myobject.no_of_quarts+
                " quarts is "+myobject.no_of_quarts/4+
                " gallons plus "+
                myobject.no_of_quarts % 4 +
                " quarts");
    }
}
