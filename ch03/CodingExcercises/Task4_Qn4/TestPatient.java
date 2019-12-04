package Task4_Qn4;

public class TestPatient {
    public static void main(String[] args) {

        //New object with all Default Values
        Patient patient1= new Patient();
        System.out.println("Patient Information (Blank Constructor)");
        System.out.println("Patient ID: "+patient1.getPatient_id());
        System.out.println("Patient Age: "+patient1.getAge());
        System.out.println("Patient Blood Type: "+patient1.getBlood_type());
        System.out.println(); // Added Spacer

        //New object with Custom Values
        patient1 = new Patient("dljfh82457",21,new BloodData("AB",'+'));
        System.out.println("Patient Information (User entered BloodData)");
        System.out.println("Patient ID: "+patient1.getPatient_id());
        System.out.println("Patient Age: "+patient1.getAge());
        System.out.println("Patient Blood Type: "+patient1.getBlood_type());


    }
}
