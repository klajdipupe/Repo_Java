package String_HW;

public class TempCalc {

    public static void main(String[] args) {

 //Homework
//        Celsius to Kelvin
//        Celsius to Fahrenheit
//        Kelvin to Celsius
//        Kelvin to Fahrenheit

        double celsius = 0; // 273.15k


        //Celsius to Kelvin
        //T(K) = 20°C + 273.15 = 293.15 K

        double kelvin = 20 + 273.15;
       System.out.println("20c into kelvin is = " + kelvin);

        // Celsius to Fahrenheit
       // T(°F) = 20°C × 9/5 + 32 = 68 °F

        double fahrenheit = 20 * 9/5 + 32;
        System.out.println("20c into fahrenheit is = " + fahrenheit);

        //Kelvin to Celsius
        //T(°C) = 300K - 273.15 = 26.85 °C

        celsius = 300 - 273.15;
        System.out.println("300k into celsius is = " + celsius);

       // Kelvin to Fahrenheit
       // T(°F) = 300K × 9/5 - 459.67 = 80.33 °F
        
        fahrenheit = 300 * 9/5 - 459.67;
        System.out.println("300k into fahrenheit is = " + fahrenheit);



    }
}
