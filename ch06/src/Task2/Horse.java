package Task2;

import java.util.Date;

public class Horse {
    private String name;
    private String color;
    private int birthyear;

    public Horse(String name, String color, int birthyear) {
        this.name = name;
        this.color = color;
        this.birthyear = birthyear;
    }

    //Getters
    public String getName() { return name; }
    public String getColor() { return color; }
    public int getBirthyear() { return birthyear; }

    //Setters
    public void setName(String name) { this.name = name; }
    public void setColor(String color) { this.color = color; }
    public void setBirthyear(int birthyear) { this.birthyear = birthyear; }
}
