package Task2;

// ScentedCandle class inherits from Candle class
public class ScentedCandle extends Candle {
    // additional instance variables
    private String scent;


    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.computePrice(3);
    }

    //Getters and Setters
    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }
}
