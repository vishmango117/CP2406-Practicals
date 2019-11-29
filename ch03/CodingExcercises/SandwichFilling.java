public class SandwichFilling {
    private String filling_type;
    private int no_of_calories;

    public SandwichFilling(String filling_type, int no_of_calories) {
        this.filling_type = filling_type;
        this.no_of_calories = no_of_calories;
    }

    public String getFilling_type() {
        return filling_type;
    }

    public int getNo_of_calories() {
        return no_of_calories;
    }
}
