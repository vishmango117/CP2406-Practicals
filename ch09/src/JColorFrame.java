import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JColorFrame {

    static GraphicsConfiguration graphicsConfiguration;

    public static void main(String[] args) {
        // Initialise
        final int FRAME_WIDTH = 1000;
        final int FRAME_HEIGHT = 570;

        // Initialise variable
        JPanel regions[] = new JPanel[4];

        // Settings
        JFrame frame = new JFrame(graphicsConfiguration);
        frame.setTitle("Colour");
        frame.setVisible(true);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLayout(null);

        // Main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setSize(800,500);
        mainPanel.setVisible(true);
        frame.add(mainPanel);
        mainPanel.setLayout(new BorderLayout());

        // Center display
        JButton center_colour = new JButton("Click to change colours");
        mainPanel.add(center_colour,BorderLayout.CENTER, SwingConstants.CENTER);
        center_colour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Random random = new Random();
                int rng = random.nextInt(4);
                regions[rng].setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });

        // Other region
        regions[0] = new JPanel();
        mainPanel.add(regions[0], BorderLayout.EAST);
        regions[1] = new JPanel();
        mainPanel.add(regions[1], BorderLayout.SOUTH);
        regions[2] = new JPanel();
        mainPanel.add(regions[2], BorderLayout.WEST);
        regions[3] = new JPanel();
        mainPanel.add(regions[3], BorderLayout.NORTH);


        // Invalidate
        frame.revalidate();
        frame.repaint();
        mainPanel.revalidate();
        mainPanel.repaint();

        // Exit condition
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
