package Task2;

public class ScentedCandle extends Candle {
    private String scent;

    public ScentedCandle(Candle mycandle, String scent) {
        super(mycandle.getColor(), mycandle.getHeight(), mycandle.getPrice());
        this.scent = scent;
    }

    public ScentedCandle(String color, float height, float price, String scent) {
        super(color, height, price);
        this.scent = scent;
    }

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }
}
