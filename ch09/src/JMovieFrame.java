import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovieFrame {

    static GraphicsConfiguration graphicsConfiguration;

    public static void main(String[] args) {
        // Initialise
        final int FRAME_WIDTH = 1000;
        final int FRAME_HEIGHT = 570;

        // Settings
        JFrame frame = new JFrame(graphicsConfiguration);
        frame.setTitle("Movie");
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
        JLabel label = new JLabel("Click any of the buttons");
        mainPanel.add(label,BorderLayout.CENTER, SwingConstants.CENTER);

        // East
        JButton east = new JButton("Interstellar");
        mainPanel.add(east, BorderLayout.EAST);
        east.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                label.setText("<html><h1>Interstellar</h1><p>Year produced: 1973<br />Written by: Christopher Nolan</p></html>\"");
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });

        // West
        JButton west = new JButton("Westworld");
        mainPanel.add(west,BorderLayout.WEST);
        west.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                label.setText("<html><h1>Westworld</h1><p>Year produced: 1973<br />Written by: Michael Crichton</p></html>");
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });

        // North
        JButton north = new JButton("The Expanse");
        mainPanel.add(north,BorderLayout.NORTH);
        north.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                label.setText("<html><h1>The Expanse</h1><p>Year produced: 2013<br />Written by: James S.A Corey</p></html>");
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });

        // South
        JButton south = new JButton("South Park");
        mainPanel.add(south,BorderLayout.SOUTH);
        south.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                label.setText("<html><h1>South Park</h1><p>Year produced: 1997<br />Created by: Trey Parker and Matt Stone</p></html>");
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });


        // Invalidate
        frame.revalidate();
        frame.repaint();
        mainPanel.revalidate();
        mainPanel.repaint();

        // Exit condition
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
