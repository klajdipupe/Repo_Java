package String_HW;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {


        //  1. Convert this date into string format "Fri, June 7 2013"
       //  2. Convert this date into string format "Friday, Jun 7, 2013 12:10:56 PM"


        
        //1.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String date = sdf.format(new Date("Fri, June 7 2013"));
        System.out.println(date);


        //2.
        SimpleDateFormat formate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
        String time = formate.format(new Date("Fri, June 7 2013 12:10:56 PM"));
        System.out.println(time);

    }
}
