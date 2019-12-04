package Task4_Qn4;

public class BloodData {
    private String blood_type;
    private char rh_factor;

    public BloodData(String blood_type, char rh_factor) {
        this.blood_type = blood_type;
        this.rh_factor = rh_factor;
    }

    public BloodData() {
        this("O", '+');
    }

    public String getBlood_type() {
        return blood_type;
    }

    public char getRh_factor() {
        return rh_factor;
    }
}
