package Task4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.regex.Matcher;

public class CarCareChoice2 {
    private static ArrayList<String> Services = new ArrayList<>();

    public static int runtest (String user_option ,String myarray[]) {
        for (int i = 0; i < myarray.length; i++) {
            if (user_option.toLowerCase().equalsIgnoreCase(myarray[i].substring(0, user_option.length()).toLowerCase())) {
                return i;
            }
        }
        System.out.println("False");
        return -1;
    }

    public static void main(String[] args) {
        String Services[] = {"Oil Change", "Tire Rotation", "Battery Check", "Brake inspection"};
        int prices[] = {25, 22, 15, 5};
        boolean flag = true;
        while (flag) {
            String user_option = JOptionPane.showInputDialog("Enter Option\n" +
                    "1. Oil Change\n" +
                    "2. Tire Rotation\n" +
                    "3. Battery Check\n" +
                    "4. Brake Inspection");
            if(runtest(user_option, Services)>=0 && runtest(user_option, Services)<=3) {
                JOptionPane.showMessageDialog(null,"You have chosen"+
                        Services[runtest(user_option,Services)]+"with price"+prices[runtest(user_option,Services)]);
                flag=false;
            }
            else{
                JOptionPane.showMessageDialog(null,"Error");
            }
        }
    }
}
