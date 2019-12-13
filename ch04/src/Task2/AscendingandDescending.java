package Task2;
import javax.swing.JOptionPane;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class AscendingandDescending {
    ArrayList<Integer> myarray = new ArrayList<Integer>(3);

    public void sort_ascending() {
        Collections.sort(this.myarray);
    }

    public void sort_descending() {
       Collections.sort(this.myarray, Collections.reverseOrder());
    }

    public static void main(String[] args) {
        AscendingandDescending myobject = new AscendingandDescending();
        for (int i=0;i<3;i++){
            myobject.myarray.add(Integer.parseInt(JOptionPane.showInputDialog("Enter Number"+(i+1))));
        }
        JOptionPane.showMessageDialog(null,"Normal Array: "+myobject.myarray.toString());
        myobject.sort_ascending();
        JOptionPane.showMessageDialog(null,"Ascending Order: "+myobject.myarray.toString());

        myobject.sort_descending();
        JOptionPane.showMessageDialog(null,"Descending Order: "+myobject.myarray.toString());

    }
}
