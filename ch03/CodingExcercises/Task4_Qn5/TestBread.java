package Task4_Qn5;

public class TestBread {

    public void printGenerate(Bread myobject) {
        System.out.println("Bread Information ("+myobject.getBread_type()+")");
        System.out.println("Motto: "+myobject.MOTTO);
        System.out.println("Bread Name: "+myobject.getBread_type());
        System.out.println("No of Calories"+myobject.getCalories_per_slice());
        System.out.println(); // Add Spacer
    }

    public static void main(String[] args) {
        TestBread myprinter = new TestBread();
        Bread my_bread = new Bread("Rye", 70);
        myprinter.printGenerate(my_bread);
        my_bread = new Bread("White Bread", 110);
        myprinter.printGenerate(my_bread);
        my_bread = new Bread("Wholemeal",105);
        myprinter.printGenerate(my_bread);

    }
}
