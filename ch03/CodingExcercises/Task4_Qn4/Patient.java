package Task4_Qn4;

public class Patient {
    private String patient_id;
    private int age;
    private BloodData blood_type;

    public Patient(String patient_id, int age, BloodData blood_type) {
        this.patient_id = patient_id;
        this.age = age;
        this.blood_type = blood_type;
    }

    public Patient() {
        this("0", 0, new BloodData("O", '+'));
    }

    public String getPatient_id() {
        return patient_id;
    }

    public int getAge() {
        return age;
    }

    public String getBlood_type() {
        return blood_type.getBlood_type()+blood_type.getRh_factor();
    }
}
