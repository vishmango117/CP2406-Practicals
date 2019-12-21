package Task2;

// RaceHorse class inherits from Horse class
public class RaceHorse extends Horse {
    //Instance Variables for RaceHorse
    private int completed_races;

    // Constructor for params Horse and completed_races
    public RaceHorse(Horse myhorse, int completed_races) {
        super(myhorse.getName(),myhorse.getColor(), myhorse.getBirthyear());
        this.completed_races = completed_races;
    }

    //Raw Constructor with params for base and inherited class
    public RaceHorse(String name, String color, int birthyear, int completed_races) {
        super(name, color, birthyear);
        this.completed_races = completed_races;
    }

    //Setters and Getters
    public int getCompleted_races() {
        return completed_races;
    }

    public void setCompleted_races(int completed_races) {
        this.completed_races = completed_races;
    }
}
