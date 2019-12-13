package Task2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ThreeLetterAcronym {
    private static ArrayList<String> tla = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<String> myacronym = new ArrayList<>();
        String mytext = JOptionPane.showInputDialog("Enter a Three Letter Acronym in full form");
        tla = new ArrayList<String>(Arrays.asList(mytext.split("[ ]+")));
        for(int i=0;i<tla.size();i++) {
            myacronym.add(tla.get(i).substring(0,1));
        }
        System.out.println(String.format("Acronym: %s%s%s",
                myacronym.get(0).toUpperCase(),
                myacronym.get(1).toUpperCase(),
                myacronym.get(2).toUpperCase()));
        }
    }
