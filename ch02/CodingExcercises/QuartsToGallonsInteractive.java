import java.util.Scanner;
import javax.swing.JOptionPane;

public class QuartsToGallonsInteractive {
    private static final int QUARTS_TO_GALLONS  = 4;
    private int no_of_quarts;

    public QuartsToGallonsInteractive(int no_of_quarts) {
        this.no_of_quarts = no_of_quarts;
    }

    public static void main(String[] args) {
        Scanner readdata = new Scanner(System.in);
        System.out.println("Enter Number of Quarts");
        QuartsToGallonsInteractive myobject= new QuartsToGallonsInteractive(readdata.nextInt());
        System.out.println(myobject.no_of_quarts+
                " quarts is "+myobject.no_of_quarts/4+
                " gallons plus "+
                myobject.no_of_quarts % 4 +
                " quarts");
    }
}
