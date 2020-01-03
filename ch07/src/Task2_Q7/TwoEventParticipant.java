package Task2_Q7;/*CP2406-Programming-III
Task 2 Q7 */
import java.util.ArrayList;
import java.util.Scanner;

public class TwoEventParticipant {
    // Main Method
    public static void main(String[] args) {
        //Create Objects for scanning input and Array Lists.
        Scanner readata = new Scanner(System.in);
        ArrayList<Participant> mini_marathon = new ArrayList<>();
        ArrayList<Participant> diving_comp = new ArrayList<>();

        //User Prompt for Mini Marathon
        for(int i=0;i<8; i++) {
            System.out.println("Enter Name: ");
            String name = readata.next();
            System.out.println("Enter Age: ");
            int age = readata.nextInt();
            System.out.println("Enter Address: ");
            String street_address = readata.next();
            Participant user_input = new Participant(name, age, street_address);
            mini_marathon.add(user_input);
        }
        //User Prompt for Diving Competition
        for(int i=0;i<8; i++) {
            System.out.println("Enter Name: ");
            String name = readata.next();
            System.out.println("Enter Age: ");
            int age = readata.nextInt();
            System.out.println("Enter Address: ");
            String street_address = readata.next();
            Participant user_input = new Participant(name, age, street_address);
            diving_comp.add(user_input);
        }
        //Checking for input.
        for(Participant current_marathoner: mini_marathon) {
            for(Participant current_diver: diving_comp) {
                if(current_marathoner.equals(current_diver)) {
                    System.out.println(current_marathoner.toString());
                }
            }
        }
    }
}
