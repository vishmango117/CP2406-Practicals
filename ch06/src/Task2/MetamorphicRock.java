package Task2;

public class MetamorphicRock extends Rock {
    public MetamorphicRock(int no_of_samples, double weight) {
        super(no_of_samples, weight);
        super.setDescription("Metamorphic rocks arise from the transformation of existing rock types," +
                " in a process called metamorphism, which means \"change in form\".[1] " +
                "The original rock (protolith) is subjected to heat (temperatures greater than 150 to 200 °C) " +
                "and pressure (100 megapascals (1,000 bar) or more), causing profound physical or chemical change." +
                " The protolith may be a sedimentary, igneous, or existing metamorphic rock.");
    }
}
