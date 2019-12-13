package Task2;

import java.util.Scanner;


public class EvenOdd {

    public boolean isEven_or_Odd(int mynumber) {
        return (mynumber%2==0) ? true : false;
    }

    public static void main(String[] args) {
        Scanner readata = new Scanner(System.in);
        EvenOdd myobject = new EvenOdd();
        System.out.println("Enter Number");
        int mynumber = readata.nextInt();
        if (myobject.isEven_or_Odd(mynumber)) {
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }

}
