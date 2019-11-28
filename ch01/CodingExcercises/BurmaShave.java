import javax.swing.JOptionPane;

public class BurmaShave {
    private String Poem;

    public BurmaShave(String poem) {
        Poem = poem;
    }

    public String getPoem() {
        return Poem;
    }

    public static void main(String[] args) {
        BurmaShave mypoem = new BurmaShave(
                "Shaving Brushes\n" +
                "You'll soon see 'em\n" +
                "On a shelf\n" +
                "In some museum\n" +
                "Burma Shave");
        JOptionPane.showMessageDialog(null,mypoem.getPoem());
    }
}
