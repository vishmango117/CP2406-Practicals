package Task2;

public class Rock {
    private int no_of_samples;
    private String description;
    private double weight;

    public Rock(int no_of_samples, double weight) {
        this.no_of_samples = no_of_samples;
        this.weight = weight;
        this.setDescription("Unclassified");
    }

    public int getNo_of_samples() {
        return no_of_samples;
    }

    public void setNo_of_samples(int no_of_samples) {
        this.no_of_samples = no_of_samples;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
