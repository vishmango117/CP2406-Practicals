package Task4_Qn3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FitnessTracker {
    private String activity;
    private int no_of_minutes;
    private Date timestamp;

    public FitnessTracker(String activity, int no_of_minutes, Date timestamp) {
        this.activity = activity;
        this.no_of_minutes = no_of_minutes;
        this.timestamp = timestamp;
    }

    public FitnessTracker() {
        // Needs to invoke Gregorian Calendar as Default constructor setting values are deprecated
        this("running",0, new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime());
    }

    public String getActivity() {
        return activity;
    }

    public int getNo_of_minutes() {
        return no_of_minutes;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}
