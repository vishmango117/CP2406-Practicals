package Task4_Qn4;


public class TestBloodData {
    public static void main(String[] args) {
        BloodData myobjecttest1= new BloodData();
        BloodData myobjecttest2 = new BloodData("B",'-');

        System.out.println("Blood Information (Default Values)");
        System.out.println("Blood Type: "+myobjecttest1.getBlood_type()+myobjecttest1.getRh_factor());

        System.out.println("Blood Information (Custom Input Entered B-)");
        System.out.println("Blood Type: "+myobjecttest2.getBlood_type()+myobjecttest2.getRh_factor());
    }
}
