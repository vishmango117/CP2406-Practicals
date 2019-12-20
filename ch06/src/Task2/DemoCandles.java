package Task2;

public class DemoCandles {
    public static void main(String[] args) {
        Candle generic_candle = new Candle("Blue", 4, 8);
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
