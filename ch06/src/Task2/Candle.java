package Task2;

//Class Candle
public class Candle {
    //Instance Variables
    private String color;
    private double height;
    private double price;

    // Getters and Setters for all instance variables

    public void computePrice(int cost) {
        this.price = this.height*cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.computePrice(2);
    }

    public double getPrice() {
        return price;
    }
}
