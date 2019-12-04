package Task4_Qn3;

import java.util.Date;

public class TestFitnessTracker {
    public static void main(String[] args) {
        FitnessTracker default_activity = new FitnessTracker();
        System.out.println("Activity Information (Default Values) ");
        System.out.println("Activity Name: "+default_activity.getActivity());
        System.out.println("Activity Duration(in mins): "+default_activity.getNo_of_minutes());
        System.out.println("Activity Date: "+default_activity.getTimestamp());

        FitnessTracker custom_activity = new FitnessTracker("Walking", 60, new Date());
        System.out.println("Activity Information (Default Values) ");
        System.out.println("Activity Name: "+custom_activity.getActivity());
        System.out.println("Activity Duration(in mins): "+custom_activity.getNo_of_minutes());
        System.out.println("Activity Date: "+custom_activity.getTimestamp());
    }
}
