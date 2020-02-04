import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote2 extends JFrame implements ActionListener {
    JButton pressMe = new JButton("Press me");
    JLabel response = new JLabel(" ");
    public JBookQuote2 () {
        super("Hello Frame");
        setSize(500,500);
        setLayout(new FlowLayout());
        add(pressMe);
        add(response);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pressMe.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        response.setText("Forrest Gump: Life is a box of chocolates..!!" +
                "Rick and Morty: Wubba Lubba Dub Dub");
    }

    public static void main(String[] args) {
        JBookQuote2 mybook = new JBookQuote2();
    }
}
