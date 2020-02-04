import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton extends JFrame implements ActionListener {
    JButton pressMe = new JButton("Press me");
    public JFrameDisableButton () {
        super("Hello Frame");
        setSize(500, 500);
        setLayout(new FlowLayout());
        add(pressMe);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pressMe.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        pressMe.setEnabled(false);
    }

    public static void main(String[] args) {
       JFrameDisableButton mybook = new JFrameDisableButton();
    }
}