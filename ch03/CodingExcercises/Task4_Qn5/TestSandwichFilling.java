package Task4_Qn5;

public class TestSandwichFilling {

    public void printGenerate(SandwichFilling myfilling) {
        System.out.println("Sandwich Filling Information");
        System.out.println("Filling Name: "+myfilling.getFilling_type());
        System.out.println("No of Calories: "+myfilling.getNo_of_calories());
        System.out.println(); // Add Spacer
    }

    public static void main(String[] args) {
        TestSandwichFilling myprinter = new TestSandwichFilling();

        //Printing Egg Salad Object
        SandwichFilling myfilling = new SandwichFilling("Egg Salad", 250);
        myprinter.printGenerate(myfilling);

        //Printing Falafel Object
        myfilling = new SandwichFilling("Falafel with Hummus", 300);
        myprinter.printGenerate(myfilling);

        //Printing Angus Beef Object
        myfilling = new SandwichFilling("Angus Beef",450);
        myprinter.printGenerate(myfilling);

    }
}
