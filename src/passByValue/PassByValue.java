package passByValue;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PassByValue {

    public static void main(String[] args) {
        new PassByValue().go();
    }

    public void go(){
        Calendar cal = new GregorianCalendar();
        int x = 1;
        tomorrow(cal);
        addOne(x);
         System.out.printf("Calendar after method return is %tF\n", cal);
         System.out.println("int after the method return is = " + x);
    }

    public void tomorrow(Calendar c){
        System.out.printf("Calendar before is %tF\n", c);
        c.add(Calendar.DATE, 1);
        System.out.printf("Calendar after is %tF\n", c);
    }

    public void addOne(int i){
        System.out.println("int before is = " + i);
        i = i + 1;
        System.out.println("int after is = " + i);
    }
}
