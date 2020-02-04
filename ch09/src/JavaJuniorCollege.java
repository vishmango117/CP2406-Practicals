import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaJuniorCollege implements ActionListener{

    static GraphicsConfiguration graphicsConfiguration;

    JFrame frame;
    JLabel text;
    JMenuItem it;
    JMenuItem science;
    JMenuItem computer_science;
    JMenuItem data_science;
    JMenuItem biology;
    JMenuItem chemistry;
    JMenuItem cooking;
    JMenuItem music;

    public static void main(String[] args) {
        JavaJuniorCollege javaJuniorCollege = new JavaJuniorCollege();
        javaJuniorCollege.mainCode();
    }

    private void mainCode() {
        // Initialise
        final int FRAME_WIDTH = 1000;
        final int FRAME_HEIGHT = 570;

        // Settings
        frame = new JFrame(graphicsConfiguration);
        frame.setTitle("Menu Bar example");
        frame.setVisible(true);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLayout(null);

        // Menubar
        JMenuBar jMenuBar = new JMenuBar();
        frame.setJMenuBar(jMenuBar);

        // Campuses
        JMenu campuses = new JMenu("Campuses");
        it = new JMenuItem("Information Technology");
        science = new JMenuItem("Science");
        it.addActionListener(this);
        science.addActionListener(this);
        campuses.add(it);
        campuses.add(science);
        jMenuBar.add(campuses);

        // Fields of Study
        JMenu field_of_study = new JMenu("Field of Studies");
        computer_science = new JMenuItem("Computer Science");
        data_science = new JMenuItem("Data Science");
        biology = new JMenuItem("Biology");
        chemistry = new JMenuItem("Chemistry");
        computer_science.addActionListener(this);
        data_science.addActionListener(this);
        biology.addActionListener(this);
        chemistry.addActionListener(this);
        field_of_study.add(computer_science);
        field_of_study.add(data_science);
        field_of_study.add(biology);
        field_of_study.add(chemistry);
        jMenuBar.add(field_of_study);

        // Activities
        JMenu campuses_activities = new JMenu("Campus Activities");
        cooking = new JMenuItem("Cooking");
        music = new JMenuItem("Music");
        cooking.addActionListener(this);
        music.addActionListener(this);
        campuses_activities.add(cooking);
        campuses_activities.add(music);
        jMenuBar.add(campuses_activities);

        // Main View
        text = new JLabel();
        text.setText("Click the menus");
        text.setBounds(0,0,FRAME_WIDTH, FRAME_HEIGHT);
        frame.add(text);

        // Invalidate
        frame.revalidate();
        frame.repaint();

        // Exit condition
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == it) {
            text.setText("Also known as the self-learning department. Only have 2-3 full time staffs");
        } else if (actionEvent.getSource() == science) {
            text.setText("The non-existent department, it's never talked nor spoken about.");
        } else if (actionEvent.getSource() == computer_science) {
            text.setText("It's more like stackoverflow and googling course. You get very good at those by the end of the course");
        } else if (actionEvent.getSource() == data_science) {
            text.setText("The only interesting ones. The only one where it is challenging.");
        } else if (actionEvent.getSource() == biology) {
            text.setText("This is a filler");
        } else if (actionEvent.getSource() == chemistry) {
            text.setText("The other filler");
        } else if (actionEvent.getSource() == cooking) {
            text.setText("<html>"+"Every student is a part of this, they just don't know it. Everyday, your lecturer will salt you, your tutor will salt you, your teammates will salt you, your colleague will salt you. By the end of the day, you wonder why you are still here"+"</html>");
        } else if (actionEvent.getSource() == music) {
            text.setText("The melodies of your lecturer talking big. You know it, but you can't escape it. It haunts you, you hear it when you are sleeping");
        }
    }
}
