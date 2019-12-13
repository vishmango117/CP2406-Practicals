package Task4;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Perfect {
    public static Boolean generatePerfect (int numbers) {
        int sum=0;
        for(int i=1;i<numbers;i++) {
            if(numbers%i == 0){
                sum=sum+i;
            }
        }
        return ((sum==numbers) ? true : false);
    }
    public static void main(String[] args) {
        //JOptionPane.showInputDialog("Enter Number of Perfect Numbers to generate");
        ArrayList<Integer> mylist = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            if (generatePerfect(i)) {
                mylist.add(i);
            }
        }
        JOptionPane.showMessageDialog(null, mylist.toString());
    }
    }
