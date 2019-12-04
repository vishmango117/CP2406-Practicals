package Task4_Qn2;

public class Billing {

    public Billing() {
    }

    public double computeBill(double price) {
        return 1.08*price;
    }

    public double computeBill(double price, int qty) {
        return qty*1.08*price;
    }

    public double computeBill(double price, int qty, double coupon_value) {
        return (((100-coupon_value)/100)*(qty*price))*1.08;
    }

    public static void main(String[] args) {
        Billing myobject1 = new Billing();
        Billing myobject2 = new Billing();
        Billing myobject3 = new Billing();
        System.out.println("Total Bill for myobject1="+myobject1.computeBill(100));
        System.out.println("Total Bill for myobject2="+myobject2.computeBill(100,2));
        System.out.println("Total Bull for myobject3="+myobject3.computeBill(100,2,50));
    }
}
