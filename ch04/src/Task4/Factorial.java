package Task4;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Factorial {

    public static int factorialgenerate(int number) {
        int result=1;
        for(int i=1;i<=number;i++) {
            result*=i;
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> factorial_list= new ArrayList<>();
        for(int i=1;i<=10;i++) {
            factorial_list.add(factorialgenerate(i));
        }
        JOptionPane.showMessageDialog(null,factorial_list.toString());
    }
}
