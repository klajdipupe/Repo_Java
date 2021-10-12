package String_HW;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Birthday {
    public static void main(String[] args) {

        //Calculate Age From Date of Birth

        LocalDate time = LocalDate.now();
        LocalDate birthdayDate = LocalDate.of(1992,12,16);
       int years = Period.between(birthdayDate,time).getYears();

        System.out.println(time);
        System.out.println(birthdayDate);
        System.out.println(years);




        int com1 = 1, com2 = 5;
        boolean com1GreaterCom2 = com1 > com2;
        System.out.println(com1 + " > " + com2 + " = " + com1GreaterCom2);


        int creditScore = 600;
        boolean firstHomeBuyer = true;
         boolean isCustQualif = creditScore >= 600 && firstHomeBuyer==false;

        System.out.println("is customer qualified = " +isCustQualif);




        //* Find the length of the given string : "New York
        String cityName = "New York";
        int cityNameLength = cityName.length();
        System.out.println("\nThe length of '" + cityName + "' is " + cityNameLength);


          //Verify if cityName (neW yorK) contains "NeW"
        //ignore the cases
        //

        String cityName_UpperCase = cityName.toUpperCase();
        String stringToCheckUpperCase = "w yo".toUpperCase();
        boolean isContaining = cityName_UpperCase.contains(stringToCheckUpperCase);
        System.out.println(isContaining);
        System.out.println(cityName_UpperCase.contains("w yo".toUpperCase()));




        // Print the last index

        String str = "Hello World";
       int stringLength = str.length();
       int lastIndex = stringLength - 1;
        System.out.println(str.charAt(lastIndex));

        //the three lines you can combine in one line

       // System.out.println(str.charAt(stringLength)-1);




    }
}
