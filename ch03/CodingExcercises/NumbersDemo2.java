import java.util.Scanner;

public class NumbersDemo2 {
    //My Instance Variables
    private int number1;
    private int number2;

    //My Constructor
    public NumbersDemo2(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // My Class methods
    public static int displayTwiceTheNumber(int number) {
        return number*2;
    }
    public static int displayNumberPlusFive(int number) {
        return number+5;
    }
    public static int displayNumberSquared(int number) {
        return number*number;
    }

    //Setters
    public void setNumber1(int number1) {
        this.number1 = number1;
    }
    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    //Main Function
    public static void main(String[] args) {
        // Object Creation
        Scanner readata= new Scanner(System.in);
        System.out.println("Input Number 1 and Number 2");
        NumbersDemo2 myobject = new NumbersDemo2(readata.nextInt(), readata.nextInt());

        //Printing The Numbers
        System.out.println("Print My Numbers "+myobject.number1+","+myobject.number2);

        //Setting and Printing Twice the numbers
        int myresultn1 = myobject.displayTwiceTheNumber(myobject.number1);
        int myresultn2 = myobject.displayTwiceTheNumber(myobject.number2);
        System.out.println("Print My Twice Numbers "+myresultn1+","+myresultn2);

        //Setting and Printing the number plus five
        myresultn1 = myobject.displayNumberPlusFive(myobject.number1);
        myresultn2 = myobject.displayNumberPlusFive(myobject.number2);
        System.out.println("Print Numbers Plus Five "+myresultn1+","+myresultn2);

        //Setting and printing the squares of the numbers
        myresultn1 = myobject.displayNumberSquared(myobject.number1);
        myresultn2 = myobject.displayNumberSquared(myobject.number2);
        System.out.println("Print Numbers Squared "+myresultn1+","+myresultn2);
    }
}
