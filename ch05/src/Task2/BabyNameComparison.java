package Task2;

import javax.swing.*;
import java.util.ArrayList;

public class BabyNameComparison {

    private static ArrayList<String> babyfirstname = new ArrayList<>();
    private static ArrayList<String> possible_names= new ArrayList<>();

    public static void main(String[] args) {
        for(int i=0;i<3;i++) {
            babyfirstname.add(JOptionPane.showInputDialog("Enter Name"+i));
        }
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(babyfirstname.get(i)==babyfirstname.get(j)) {
                    continue;
                }
                else {
                    possible_names.add("Possible Name: "+babyfirstname.get(i)+" "+babyfirstname.get(j)+"\n");
                }
            }
        }
        JOptionPane.showMessageDialog(null,possible_names.toString());
    }
}
