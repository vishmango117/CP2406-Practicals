package Task4;

import java.util.ArrayList;

public class TwelveInts {

    public static void main(String[] args) {
        int newarray[] = {5,3,5,2,7,2,7,2,7,2,7,2};
        System.out.println("Right Order");
        for (int i = 0; i < newarray.length;i++) {
            System.out.println(newarray[i]);
        }
        System.out.println("Reverse Order");
        for(int i=0;i<newarray.length;i++) {
            System.out.println(newarray[newarray.length-1-i]);
        }
    }
}
