package Task2;

public class Candle {
    private String color;
    private float height;
    private float price;

    public Candle(String color, float height, float price) {
        this.color = color;
        this.height = height;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
