package Task2_Q8;/*CP2406-Programming-III
Task 2 Q8 */

//Inherited class from Abstract Class
public class UndergraduateStudent extends Student {

    public UndergraduateStudent(int student_id, String last_name) {
        super(student_id, last_name);
    }

    @Override
    public void setAnnual_tuition() {
        this.annual_tuition = 4000;
    }
}
