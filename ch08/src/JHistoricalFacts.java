import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JHistoricalFacts extends JFrame implements ActionListener {
    JButton pressMe = new JButton("Press me");
    String mylist[] = new String[] {"WW2 happened in 1941", "WW1 happened in 1918", "Ardennes Jungle\n",
            "Chernobyl happened in 1985", "Caesar said Et tu Brute\n",
            "Persian Empire was the biggest empire in land space\n","LOL 15\n", "LOL was invented by William Shakespeare\n",
            "Coulomb discovered the Coulomb's Law"};
    JLabel output = new JLabel("");
    String myoutput="";
    int startpoint=0;
    public JHistoricalFacts () {
        super("Hello Frame");
        setSize(720, 720);
        setLayout(new FlowLayout());
        for(int i=startpoint;i<startpoint+5;i++) {
            myoutput+=mylist[i]+"\n";
        }
        output.setText(myoutput);
        add(output);
        add(pressMe);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pressMe.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        startpoint+=1;
        int incrementor=0;
        String mysecondoutput = "";
        mysecondoutput = myoutput.substring(mylist[startpoint-1].length());
        mysecondoutput += mylist[startpoint+5];
        output.setText(mysecondoutput);
        }

    public static void main(String[] args) {
        JHistoricalFacts mybook = new JHistoricalFacts();
    }
}
