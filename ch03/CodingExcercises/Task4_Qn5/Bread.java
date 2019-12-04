package Task4_Qn5;

public class Bread {

    //Constants
    public static final String MOTTO = "The Staff of Life";

    //Variables
    private String bread_type;
    private double calories_per_slice;

    //Default Constructor
    public Bread(String bread_type, double calories_per_slice) {
        this.bread_type = bread_type;
        this.calories_per_slice = calories_per_slice;
    }

    //Getters
    public String getBread_type() {
        return bread_type;
    }
    public double getCalories_per_slice() {
        return calories_per_slice;
    }
}
