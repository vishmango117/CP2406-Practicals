package Task2_Q7;

/*CP2406-Programming-III
Task 2 Q7 */
public class Participant {
    //Instance Variables
    private String name;
    private int age;
    private String street_address;

    //Constructor
    public Participant(String name, int age, String street_address) {
        this.name = name;
        this.age = age;
        this.street_address = street_address;
    }

    //Method to override the toString method
    @Override
    public String toString() {
        return this.name+" "+this.age+" "+this.street_address;
    }

    //Method to compare the two participants
    public boolean equals(Participant p2) {
        if(this.name.equals(p2.name) && this.age == p2.age && this.street_address.equals(p2.street_address)) {
            return true;
        }
        return false;
    }
}
