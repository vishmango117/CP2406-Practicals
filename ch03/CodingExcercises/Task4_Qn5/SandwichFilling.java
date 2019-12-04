package Task4_Qn5;

public class SandwichFilling {
    private String filling_type;
    private double no_of_calories;

    public SandwichFilling(String filling_type, double no_of_calories) {
        this.filling_type = filling_type;
        this.no_of_calories = no_of_calories;
    }

    public String getFilling_type() {
        return filling_type;
    }

    public double getNo_of_calories() {
        return no_of_calories;
    }
}
