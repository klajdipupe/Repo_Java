package String_HW;

import java.time.LocalDate;
import java.time.Period;

public class Birthday {
    public static void main(String[] args) {

        //Calculate Age From Date of Birth

        LocalDate time = LocalDate.now();
        LocalDate birthdayDate = LocalDate.of(1992,12,16);
       int years = Period.between(birthdayDate,time).getYears();

        System.out.println(time);
        System.out.println(birthdayDate);
        System.out.println(years);
    }
}
