import javax.swing.*;
import java.awt.*;

public class JBookQuote{
    public static void main(String[] args) {
        Font headlineFont = new Font("Times New Roman", Font.ITALIC, 24);
        JFrame myframe = new JFrame("JBookQuote");
        myframe.setLayout(new FlowLayout());
        myframe.setSize(500,400);
        myframe.setVisible(true);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel greeting1 = new JLabel("Forrest Gump: Life is a box of chocolates..!!");
        JLabel greeting2 = new JLabel("Rick and Morty: Welcome to your Reckoning Baby..!!");
        greeting1.setFont(headlineFont);
        greeting2.setFont(headlineFont);
        myframe.add(greeting1);
        myframe.add(greeting2);
    }
}
