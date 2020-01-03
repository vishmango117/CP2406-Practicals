package Task2_Q9;

/*CP2406-Programming-III
Task 2 Q9 */
public class DemoTurners2 {
    //Main Functions
    public static void main(String[] args) {
        //From Task2_Q9.DemoTurners 1
        Leaf myleaf = new Leaf();
        Page mybook = new Page();
        Pancake mypancakes = new Pancake();

        // New Classes created for Task2_Q9.DemoTurners 2
        SteeringWheel mycar_steering = new SteeringWheel();
        Screwdriver myscrewdriver = new Screwdriver();

        //Print Outputs from Task2_Q9.DemoTurners 1
        System.out.println("When a Task2_Q9.Leaf turns: "+myleaf.turn());
        System.out.println("When a Task2_Q9.Page turns: "+mybook.turn());
        System.out.println("When a Task2_Q9.Pancake turns: "+mypancakes.turn());
        System.out.println();
        //Print Outputs from Task2_Q9.DemoTurners 2
        System.out.println("When a Steering Wheel turns: "+mycar_steering.turn());
        System.out.println("When a Task2_Q9.Screwdriver turns: "+myscrewdriver.turn());
    }
}
