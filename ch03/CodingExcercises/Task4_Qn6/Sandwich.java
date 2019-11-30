package Task4_Qn6;

public class Sandwich {
    private Bread bread_filling;
    private SandwichFilling sandwich_filling;

    public Sandwich(Bread bread_filling, SandwichFilling sandwich_filling) {
        this.bread_filling = bread_filling;
        this.sandwich_filling = sandwich_filling;
    }

    public Bread getBread_filling() {
        return bread_filling;
    }

    public SandwichFilling getSandwich_filling() {
        return sandwich_filling;
    }

    public double compute_calories() {
        return (this.getBread_filling().getCalories_per_slice()*2 + this.getSandwich_filling().getNo_of_calories());
    }
}
