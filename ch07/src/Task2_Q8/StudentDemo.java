package Task2_Q8;/*CP2406-Programming-III
Task 2 Q8 */
import java.util.ArrayList;

//Class to Demo the function of all the classes
public class StudentDemo {
    //method to print all the information
    public static void printvalues(ArrayList<Student> myarraylist) {
        for(Student current_student: myarraylist) {
            System.out.println("Task2_Q8.Student Information");
            System.out.println("Task2_Q8.Student ID: "+current_student.getStudent_id());
            System.out.println("Task2_Q8.Student Last Name: "+current_student.getLast_name());
            System.out.println("Task2_Q8.Student Annual Tuition: "+current_student.getAnnual_tuition());
            System.out.println();
        }
    }
    // Main Method
    public static void main(String[] args) {
        //New ArrayList
        ArrayList<Student> student_list = new ArrayList<>();
        //Adding Values to the List
        student_list.add(new UndergraduateStudent(32532,"Setiawan"));
        student_list.add(new GraduateStudent(2394,"Ong"));
        student_list.add(new GraduateStudent(3242,"Huang"));
        student_list.add(new UndergraduateStudent(32423,"Chen"));
        student_list.add(new StudentAtLarge(319434, "Mango"));
        student_list.add(new StudentAtLarge(0323,"Ang Nathaniel Tecson"));
        //Printing Values from the list
        StudentDemo.printvalues(student_list);
    }
}
