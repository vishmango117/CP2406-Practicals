package Task2;

public class DemoHorses {
    public static void main(String[] args) {
        //Instantiating Objects
        Horse myhorse = new Horse("Ol Reliable", "Brown", 2005);
        RaceHorse myracehorse = new RaceHorse("New Reliable","White",2015,10);

        //Object of Base Class
        System.out.println("Horse Information:");
        System.out.println("Horse ("+myhorse.getName()+")");
        System.out.println("Horse Color: "+myhorse.getColor());
        System.out.println("Horse Birthyear: "+myhorse.getBirthyear());

        //Spacer
        System.out.println();

        //Object of Inherited Class
        System.out.println("Horse Information:");
        System.out.println("Horse ("+myracehorse.getName()+")");
        System.out.println("Horse Color: "+myracehorse.getColor());
        System.out.println("Horse Birthyear: "+myracehorse.getBirthyear());
        System.out.println("No of Races Completed: "+myracehorse.getCompleted_races());


    }
}
