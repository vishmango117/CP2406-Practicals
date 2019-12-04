package Task4_Qn5;

public class TestSandwich {

    public void generateprint(Sandwich mysandwich) {
        System.out.println("My Sandwich("+mysandwich.getName()+")");
        System.out.println("Sandwich Bread Nutrition Information:");
        System.out.println(" Bread Name:"+mysandwich.getBread_filling().getBread_type());
        System.out.println("Calories per Slice: "+mysandwich.getBread_filling().getCalories_per_slice());
        System.out.println("Sandwich Filling Nutrition Information");
        System.out.println("Sandwich Filling Type: "+mysandwich.getSandwich_filling().getFilling_type());
        System.out.println("Calories in filling: "+mysandwich.getSandwich_filling().getNo_of_calories());
        System.out.println("Total Calories :"+mysandwich.compute_calories());
        System.out.println(); // Adding Spacer
    }

    public static void main(String[] args) {
        TestSandwich mycollection = new TestSandwich();
        System.out.println(); // Adding Spacer

        //First Object
        Bread my_bread= new Bread("Wholemeal", 150);
        SandwichFilling my_filling = new SandwichFilling("Egg Salad",150);
        Sandwich mysandwich= new Sandwich("Club Sandwich",my_bread, my_filling);
        mycollection.generateprint(mysandwich);


        //Second Object
        my_bread= new Bread("White Bread", 200);
        my_filling = new SandwichFilling("Angus Beef",250);
        mysandwich= new Sandwich("Cheese Steak Sandwich",my_bread, my_filling);
        mycollection.generateprint(mysandwich);


        //Third Object
        my_bread= new Bread("Pandan Bread", 350);
        my_filling = new SandwichFilling("Milo and Butter",500);
        mysandwich= new Sandwich("Super Sweet Sandwich",my_bread, my_filling);
        mycollection.generateprint(mysandwich);

    }
}
