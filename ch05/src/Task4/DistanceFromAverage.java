package Task4;

import javax.swing.*;
import java.util.ArrayList;

public class DistanceFromAverage {
    public static void main(String[] args) {
        boolean flag = true;
        double sum=0;
        ArrayList<Double> myvalues = new ArrayList<>();
        while(flag) {
            try {
                Double current_value = Double.parseDouble(JOptionPane.showInputDialog("Enter Number"));
                if (current_value != 99999 && current_value < 20) {
                    myvalues.add(current_value);
                } else if (current_value == 99999) {
                    flag = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Number");
                }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error Message"
                        +e.getMessage());
            }
        }
        for(int i=0;i<myvalues.size();i++) {
            sum+=myvalues.get(i);
        }
        for(int i=0;i<myvalues.size();i++) {
            System.out.printf("My Value is %.2f and distance from average %.2f \n"
                    ,myvalues.get(i),((sum/myvalues.size())-myvalues.get(i)));
        }
    }
}
