package String_HW;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {


        //  1. Convert this date into string format "Fri, June 7 2013"
       //  2. Convert this date into string format "Friday, Jun 7, 2013 12:10:56 PM"



        String dateInString = "Friday, Jun 7, 2013 12:10:56 PM";
        SimpleDateFormat formatter = new SimpleDateFormat(" dd, MM, yyyy HH:mm:ss a");
        try {

            Date date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }



    }
}
