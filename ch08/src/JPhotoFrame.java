import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPhotoFrame extends JFrame implements ActionListener {
    String[] myoptions = new String[] {"Person of Interest", "Supergirl", "Arrow", "The Flash", "Halo"};
    JComboBox choice = new JComboBox(myoptions);
    JTextArea mylabel = new JTextArea("Choose TV Show");
    JTextArea response = new JTextArea(" ");
    public JPhotoFrame() {
        super("Hello Frame");
        setSize(300,300);
        setLayout(new FlowLayout());
        response.setLineWrap(true);
        response.setSize(200,200);
        add(mylabel);
        add(choice);
        add(response);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        choice.addActionListener(this);
        choice.setEditable(true);
        mylabel.setEditable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(choice.getSelectedIndex()==0) {
            response.setText("AI");
        }
        else if(choice.getSelectedIndex()==1) {
            response.setText("Kryptonian escapes from Krypton hides on earth and uses her superpowers for good.");
        }
        else if(choice.getSelectedIndex()==2) {
            response.setText("After spending 5 years in a island after a yacht crash Oliver Queen returns home and he grows up to be a crime fighting superhero");
        }
        else if(choice.getSelectedIndex()==3) {
            response.setText("After being struck by lightning from a particle acceleration explosion he gains super speed and uses his powers to fight crime");
        }
        else if(choice.getSelectedIndex()==4) {
            response.setText("The Fight against the covenant an advanced alien race. One spartan against them all");
        }
        else
        {
            response.setText("Error 404 The item you are requesting is not available");
        }
    }
    public static void main(String[] args) {
        JPhotoFrame tvlist = new JPhotoFrame();
    }
}
