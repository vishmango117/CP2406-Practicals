package Task2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CountWords {
    public static ArrayList<String> wordsarray = new ArrayList<>();

    public static void main(String[] args) {
        String mytext = JOptionPane.showInputDialog("Enter Text");
        wordsarray = new ArrayList<String>(Arrays.asList(mytext.split("[ ,-?!<>.]+")));
        JOptionPane.showMessageDialog(null,"Number of Words: "+wordsarray.size());
    }
}
