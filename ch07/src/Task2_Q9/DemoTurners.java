package Task2_Q9;

/*CP2406-Programming-III
Task 2 Q9 */
public class DemoTurners {
    public static void main(String[] args) {
        //Instanitating the Objects of the 3 classes
        Leaf myleaf = new Leaf();
        Page mybook = new Page();
        Pancake mypancakes = new Pancake();

        //Printing their turn for each object
        System.out.println("When a Task2_Q9.Leaf turns: "+myleaf.turn());
        System.out.println("When a Task2_Q9.Page turns: "+mybook.turn());
        System.out.println("When a Task2_Q9.Pancake turns: "+mypancakes.turn());
    }
}
