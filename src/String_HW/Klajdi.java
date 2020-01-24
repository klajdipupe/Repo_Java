package String_HW;

public class Klajdi {
   public static void main(String[] args) {

//        fahrenheit to celsius
        double cel = getConvertedCel(25);

        if (cel < 0) {
            System.out.println("It's cold");
        }

       double kel = getConvertedKel(35);

       if (kel > 30) {
           System.out.println("It's hot");
       }


    }
        public static double getConvertedCel(double fahrenheit){
    double celsius = (fahrenheit - 32) * 5/9;
    return celsius;
    }





    public static double getConvertedKel (double celsius) {
        double kelvin = celsius + 273.15;
        return kelvin;

        //Celsius to Fahrenheit

    }
   }


