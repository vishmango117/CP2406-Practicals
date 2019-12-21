package Task2;

//Class to Test the Candles and ScentedCandles Classes
public class DemoCandles {
    // Main function
    public static void main(String[] args) {
        // Candle and ScentedCandle objects creation
        Candle generic_candle = new Candle();
        generic_candle.
        ScentedCandle custom_candle = new ScentedCandle(generic_candle, "Lavender");

        //Object of Base Class
        System.out.println("Candle Information:");
        System.out.println("Candle ("+generic_candle.getColor() + ")");
        System.out.println("Candle Height: "+generic_candle.getHeight());
        System.out.println("Candle Price: "+generic_candle.getPrice());

        //Spacer
        System.out.println();

        //Object of Inherited Class
        System.out.println("Candle Information:");
        System.out.println("Candle (" + custom_candle.getColor() + ")");
        System.out.println("Candle Height: " + custom_candle.getHeight());
        System.out.println("Candle Price: " + custom_candle.getPrice());
        System.out.println("Candle Scent: " + custom_candle.getScent());
    }
}
