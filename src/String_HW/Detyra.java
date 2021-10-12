package String_HW;

import javax.swing.*;

public class Detyra {
    public static void main(String[] args) {


        //Question -1
        String sentence_1 = "hello dear, how are you";
        int result_1 = 0;
        /**
         * Assign result_1 as 100 if the length of sentence_1 is 10 or greater
         * else assign result_1 as 15
         *
         * use Ternary operator
         *
         */
        result_1 = sentence_1.length() >= 10 ? 100 : 15;
        System.out.println("result_1 = " + result_1);


        //Question 2
        String sentence_2 = "We all ARe GOod ProgrAMmer";
        /**
         * replace all 'R/r' with 'F'
         */
        String newSentence = sentence_2.replace("R", "F");

        System.out.println(sentence_2 + " " + newSentence);


        //Question 3
        String sentence_3 = "ABC Network";
        String result_3 = "";

        /**
         * 1. Display/Print length of your sentence_3
         * 2. does sentence_3 starts with "a" (ignore cases)
         * 3. does sentence_3 ends with "K" (ignore cases)
         * 4. Assign result_3 as "Media" if sentence_3 starts with 'a' (ignore cases)
         *          else assign "Entertainment"
         *          Print the result_3 in console
         */
        int length = sentence_3.length();
        System.out.println("The length of '" + sentence_3 + "' is : " + length);
        boolean startsWith_a = sentence_3.toLowerCase().startsWith("a");

        System.out.println("Does '" + sentence_3 + "' starts with 'a' : " + startsWith_a);

        boolean endsWith_K = sentence_3.toUpperCase().endsWith("K");

        System.out.println("Does'" + sentence_3 + "' ends with 'K' : " + endsWith_K);


        result_3 = sentence_3.toLowerCase().startsWith("a") ? "Media" : "Entertainment";
        System.out.println("Value in result_3 is : " + result_3);


    }
}
