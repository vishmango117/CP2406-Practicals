import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JMovingFrame {

    static GraphicsConfiguration graphicsConfiguration;

    public static void main(String[] args) {
        // Initialise
        final int FRAME_WIDTH = 1000;
        final int FRAME_HEIGHT = 570;
        JPanel boxes[] = new JPanel[20];
        Random random = new Random();

        // Settings
        JFrame frame = new JFrame(graphicsConfiguration);
        frame.setTitle("Moving Frame");
        frame.setVisible(true);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLayout(null);

        // JPanel
        int counter = 0;
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 4; y++) {
                boxes[counter] = new JPanel();
                boxes[counter].setBounds(x*(FRAME_WIDTH/5), y*(480/4), FRAME_WIDTH/5, 480/4);
                boxes[counter].setLayout(null);
                boxes[counter].setVisible(true);
                boxes[counter].setOpaque(true);
                frame.add(boxes[counter]);
                counter++;
            }
        }

        // Bottom Button
        JPanel bottom = new JPanel();
        frame.add(bottom);
        bottom.setLayout(null);
        bottom.setVisible(true);
        bottom.setOpaque(true);
        bottom.setBounds(0, 480, FRAME_WIDTH, 54);
        JButton bottom_button = new JButton("Poi ?");
        bottom_button.setBounds(0, 0, FRAME_WIDTH, 54);
        bottom_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int counter = 0;
                for (int x = 0; x < 5; x++) {
                    for (int y = 0; y < 4; y++) {
                        boxes[counter].removeAll();
                        boxes[counter].revalidate();
                        boxes[counter].repaint();
                        counter++;
                    }
                }
                JLabel poi = new JLabel("Hoyjoyr");
                poi.setVisible(true);
                poi.setOpaque(true);
                poi.setFont(new Font("", Font.PLAIN, 24));
                poi.setBounds(0, 0, FRAME_WIDTH/5, 480/4);
                int choosen_box = random.nextInt(20);
                boxes[choosen_box].add(poi);
                boxes[choosen_box].revalidate();
                boxes[choosen_box].repaint();
            }
        });
        bottom.add(bottom_button);
        bottom.revalidate();
        bottom.repaint();

        // Invalidate
        frame.revalidate();
        frame.repaint();


        // Exit condition
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
