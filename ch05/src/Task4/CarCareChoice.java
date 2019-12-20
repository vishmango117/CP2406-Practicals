package Task4;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class CarCareChoice {
    private static ArrayList<String> Services = new ArrayList<>();

    public static void main(String[] args) {
        String Services[] = {"Oil Change", "Tire Rotation", "Battery Check", "Brake inspection"};
        int prices[] = {25,22,15,5};
        boolean flag=true;
        while(flag) {
            String user_option = JOptionPane.showInputDialog("Enter Option\n" +
                    "1.Oil Change\n" +
                    "2. Tire Rotation\n" +
                    "3. Battery Check\n" +
                    "4. Brake Inspection");

            switch (user_option.toLowerCase()) {
                case "oil change": {
                    JOptionPane.showMessageDialog(null,"You have chosen" + Services[0] + "with price" + prices[0]);
                    flag=false;
                    break;
                }
                case "tire rotation": {
                    JOptionPane.showMessageDialog(null,"You have chosen" + Services[1] + "with price" + prices[1]);
                    flag=false;
                    break;
                }
                case "battery check": {
                    JOptionPane.showMessageDialog(null,"You have chosen" + Services[2] + "with price" + prices[2]);
                    flag=false;
                    break;
                }
                case "brake inspection": {
                    JOptionPane.showMessageDialog(null,"You have chosen" + Services[3] + "with price" + prices[3]);
                    flag=false;
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Error:");
                    break;
                }
            }
        }
    }
}
