package String_HW;

public class DetyraShpie {
    public static void main(String[] args) {

        /** Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90.99
         * Grade C: 71-80.99
         * Grade D: 61-70.99
         * Grade E: 51-60.99
         * Grade F: less than or equal to 50.99
         */
        int studentScore = -50;
        int maxScore = 150;
        double percentage = studentScore * 100.0 / maxScore;

        if (percentage >= 91) {
            System.out.println("Your percentage is : " + percentage + " and your grade is : A");
        } else if (percentage >= 81) {
            System.out.println("Your percentage is : " + percentage + " and your grade is : B");
        } else if (percentage >= 71) {
            System.out.println("Your percentage is : " + percentage + " and your grade is : C");
        } else if (percentage >= 61) {
            System.out.println("Your percentage is : " + percentage + " and your grade is : D");
        } else if (percentage >= 51) {
            System.out.println("Your percentage is : " + percentage + " and your grade is : E");
        } else if (percentage <= 50.99) {
            System.out.println("Your percentage is : " + percentage + " and your grade is : F");
        }


        String cityName = "NeWeee yoreek";
        int length = cityName.length();
        System.out.println("\nLength of " + cityName + " is : " + length);

        String lowerCase = cityName.toLowerCase();
        System.out.println("\n" + lowerCase);


        String name = "New york";
        Boolean COMPARE = name.equalsIgnoreCase(cityName);
        System.out.println(COMPARE);


        boolean contains = cityName.toLowerCase().contains("W yo".toLowerCase());
        System.out.println(contains);

        System.out.println(cityName.replace("e", "o"));


        char index = cityName.charAt(3);
        System.out.println(index);


        //using length value find lastIndex-value (len-1)
        //use lasIndex with charAt

        int lastIndex = length - 1;
        System.out.println(cityName.charAt(lastIndex));

        //or
        System.out.println(cityName.charAt(cityName.length() - 1));

        int indexOf = cityName.indexOf("We");
        System.out.println(indexOf);


        int lastIndexOf = cityName.lastIndexOf("e");
        System.out.println(lastIndexOf);


        //Trim method, removes extra spaces from the beginning and the end
        String home = "    I love New york   ";
        String newHome = home.trim();
        System.out.println("\n" + home + "\n" + newHome);
    }


    }