public class TestBread {
    public static void main(String[] args) {
        Bread rye_bread = new Bread("Rye", 70);
        Bread white_bread = new Bread("White Bread", 110);
        Bread wholemeal_bread = new Bread("Wholemeal",105);

        System.out.println("Bread Information");
        System.out.println("Motto: "+rye_bread.MOTTO);
        System.out.println("Bread Name: "+rye_bread.getBread_type());
        System.out.println("No of Calories"+rye_bread.getCalories_per_slice());

        System.out.println("Bread Information");
        System.out.println("Motto: "+white_bread.MOTTO);
        System.out.println("Bread Name: "+white_bread.getBread_type());
        System.out.println("No of Calories"+white_bread.getCalories_per_slice());

        System.out.println("Bread Information");
        System.out.println("Motto: "+wholemeal_bread.MOTTO);
        System.out.println("Bread Name: "+wholemeal_bread.getBread_type());
        System.out.println("No of Calories"+wholemeal_bread.getCalories_per_slice());

    }
}
