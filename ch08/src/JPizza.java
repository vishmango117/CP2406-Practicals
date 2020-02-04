import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPizza extends JFrame implements ActionListener {
    JButton[] pizza_buttons = new JButton[] { new JButton("Small"), new JButton("Medium"), new JButton("Large"), new JButton("Xtra Large")};
    JButton[] toppings = new JButton[] { new JButton("Cheese"), new JButton("Mayo"), new JButton("Sirracha"), new JButton("Lettuce"), new JButton("BBQ")};
    JButton calculate = new JButton("Calculate");
    JTextArea mylabel = new JTextArea("Topping");
    JTextArea response = new JTextArea(" ");
    int rows = 1;
    int sum =0;
    public JPizza() {
        super("Hello Frame");
        setSize(400,400);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(pizza_buttons);
        rows++;
        add(toppings);
        GridBagConstraints d = new GridBagConstraints();
        d.fill = GridBagConstraints.HORIZONTAL;
        d.gridx = 0;
        d.gridy = 0;
        d.gridwidth = 3;
        add(calculate, d);
        add(response);
        calculate.addActionListener(this);
        setVisible(true);
        // Put constraints on different buttons
    }

    private void add(JButton[] buttons_array) {
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        for(int i=0; i<buttons_array.length;i++) {
            c.gridx = i;
            c.gridy = rows;
            buttons_array[i].addActionListener(this);
            add(buttons_array[i], c);
        }
        rows++;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource()== calculate) {
            response.setText("Sum is "+sum);
        }
        else if(actionEvent.getSource() == pizza_buttons[0]) {
            sum +=7;
        }
        else if(actionEvent.getSource() == pizza_buttons[1]) {
            sum +=9;
        }
        else if(actionEvent.getSource() == pizza_buttons[2]) {
            sum +=11;
        }
        else if(actionEvent.getSource() == pizza_buttons[3]) {
            sum +=14;
        }
        else if(actionEvent.getSource() == toppings[0]) {
            sum +=0;
        }
        else {
            sum +=1;
        }
    }

    public static void main(String[] args) {
        JPizza mypizzeria = new JPizza();
    }
}
