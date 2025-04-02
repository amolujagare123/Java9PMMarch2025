package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

    public static void main(String[] args) throws ParseException {

        String dateStr = "04/24/2025";
        SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
        Date date = sd.parse(dateStr);
        System.out.println(date);

        String dateStr1= "23 | June 16  8:34" ;
                //→ dd | MMMM yy hh:mm

        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        Date date1 = sd1.parse(dateStr1);
        System.out.println(date1);


    }
}
