package Task2_Q8;/*CP2406-Programming-III
Task 2 Q8 */

//Abstract Class
public abstract class Student {
    private int student_id;
    private String last_name;
    protected double annual_tuition;

    //Constructor
    public Student(int student_id, String last_name) {
        this.student_id = student_id;
        this.last_name = last_name;
    }

    //Getter and Setters
    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getLast_name() {
        return last_name;
    }

    public double getAnnual_tuition() {
        return annual_tuition;
    }

    public abstract void setAnnual_tuition();

}
