package Task4_Qn6;

public class TestSandwichFilling {
    public static void main(String[] args) {
        SandwichFilling egg_salad = new SandwichFilling("Egg Salad", 250);
        SandwichFilling falafel_with_hummus = new SandwichFilling("Falafel with Hummus", 300);
        SandwichFilling angus_beef = new SandwichFilling("Angus Beef",450);

        System.out.println("Qn6.Sandwich Filling Information");
        System.out.println("Filling Name: "+egg_salad.getFilling_type());
        System.out.println("No of Calories"+egg_salad.getNo_of_calories());

        System.out.println("Qn6.Sandwich Filling Information");
        System.out.println("Filling Name: "+falafel_with_hummus.getFilling_type());
        System.out.println("No of Calories"+falafel_with_hummus.getNo_of_calories());

        System.out.println("Qn6.Sandwich Filling Information");
        System.out.println("Filling Name: "+angus_beef.getFilling_type());
        System.out.println("No of Calories"+angus_beef.getNo_of_calories());

    }
}
