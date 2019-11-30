package Task4_Qn6;

public class TestSandwich {
    public static void main(String[] args) {
        Bread my_bread= new Bread("Wholemeal", 150);
        SandwichFilling my_filling = new SandwichFilling("Egg Salad",150);
        Sandwich mysandwich= new Sandwich(my_bread, my_filling);
        System.out.println("My Qn6.Sandwich");
        System.out.println("Qn6.Sandwich Qn6.Bread Nutrition Information:");
        System.out.println("Qn6.Bread Name:"+mysandwich.getBread_filling().getBread_type());
        System.out.println("Calories per Slice: "+mysandwich.getBread_filling().getCalories_per_slice());
        System.out.println("Qn6.Sandwich Filling Nutrition Information");
        System.out.println("Qn6.Sandwich Filling Type: "+mysandwich.getSandwich_filling().getFilling_type());
        System.out.println("Calories in filling: "+mysandwich.getSandwich_filling().getNo_of_calories());
        System.out.println("Total Calories :"+mysandwich.compute_calories());

    }
}
