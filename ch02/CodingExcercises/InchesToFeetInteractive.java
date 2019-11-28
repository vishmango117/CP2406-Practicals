import javax.swing.JOptionPane;

public class InchesToFeetInteractive {

    //Instance Variables and Class Variable
    private static final int INCHES_TO_FEET = 12;
    private int no_of_inches;

    //Constructor
    public InchesToFeetInteractive(int no_of_inches) {
        this.no_of_inches = no_of_inches;
    }

    // Main Method
    public static void main(String[] args) {
        //Object Creation
        InchesToFeetInteractive myobject = new InchesToFeetInteractive(
                Integer.parseInt(
                        JOptionPane.showInputDialog("Enter Number of Inches")));

        //Output in a Message Box
        JOptionPane.showMessageDialog(null,
                myobject.no_of_inches+
                " Inches is "+myobject.no_of_inches/INCHES_TO_FEET+
                " Feet plus "+
                myobject.no_of_inches % myobject.INCHES_TO_FEET +
                " Inches");
    }
}
