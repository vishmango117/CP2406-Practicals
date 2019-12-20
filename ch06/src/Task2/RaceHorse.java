package Task2;

public class RaceHorse extends Horse {
    private int completed_races;

    public RaceHorse(Horse myhorse, int completed_races) {
        super(myhorse.getName(),myhorse.getColor(), myhorse.getBirthyear());
        this.completed_races = completed_races;
    }

    public RaceHorse(String name, String color, int birthyear, int completed_races) {
        super(name, color, birthyear);
        this.completed_races = completed_races;
    }

    public int getCompleted_races() {
        return completed_races;
    }

    public void setCompleted_races(int completed_races) {
        this.completed_races = completed_races;
    }
}
