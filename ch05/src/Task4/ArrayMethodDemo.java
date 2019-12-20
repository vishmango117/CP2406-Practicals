package Task4;

import java.util.ArrayList;

// Declared Class
public class ArrayMethodDemo {
    //Instance Variable with static so that its accessible within class
    private static int[] myarray = new int[10];

    // Method to Print the array
    private static void printarray() {
        System.out.printf("Array: ");
        for(int i=0;i<myarray.length;i++) {
            System.out.printf("%d ",myarray[i]);
        }
    }

    // Method to print the array in reverse
    private static void printarrayreverse() {
        System.out.printf("Array: ");
        for(int i=myarray.length-1;i>=0;i--) {
            System.out.printf("%d ",myarray[i]);
        }
    }

    // Method to print the sum of all the values from the array
    private static void printsum() {
        int sum =0;
        for(int i=myarray.length-1;i>=0;i--) {
            sum+=myarray[i];
        }
        System.out.printf("Sum: %d",sum);
    }

    //Displays all values in the array upto the limiting value
    public static void display_upto_limiting(int value) {
        System.out.printf("Array: ");
        for(int i=0;i<myarray.length;i++) {
            if(myarray[i]<value) {
                System.out.printf("%d ", myarray[i]);
            }
        }
    }

    //Method to display all values that are higher than average
    public static void display_higher_than_avg() {
        int sum =0;
        double average=0;
        for(int i=myarray.length-1;i>=0;i--) {
            sum+=myarray[i];
        }
        average=sum/myarray.length;
        System.out.println("Average: "+average);
        System.out.printf("Array(Higher than average): ");
        for(int i=0;i<myarray.length;i++) {
            if(myarray[i]>average) {
                System.out.printf("%d ", myarray[i]);
            }
        }
    }

    public static void main(String[] args) {
        myarray = new int[] {1,2,3,4,5,6,7,8,9,10};
        printarray();
        System.out.println();
        printarrayreverse();
        System.out.println();
        printsum();
        System.out.println();
        display_upto_limiting(5);
        display_higher_than_avg();
    }
}
