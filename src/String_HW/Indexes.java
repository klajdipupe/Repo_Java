package String_HW;

import java.util.Arrays;

public class Indexes {
    public static void main(String[] args) {


        String sentence_1 = "hello dear, how are you";
        int result_1 = 0;

        int length= sentence_1.length();

        /**
         * Assign result_1 as 100 if the length of sentence_1 is 10 or greater
         * else assign result_ as 15
         *
         *
         * use Ternary operator
         *
         */

        result_1 = length >= 10 ? 100 : 15;
        System.out.println(result_1);



     String sentence_2 = "We all aRe GOod ProgrAMmer";

        /**
         * replace all 'R/r with 'F'
         */
        //String toUppercase = sentence_2.toUpperCase();
        System.out.println(sentence_2.toUpperCase().replace("R", "F"));


        String sentence_3 = "ABC Networks";

        /**
         * 1. Display the length of your sentence
         * 2. Does sentence_3 starts with "a" ( ignore case)
         * does sentence_3 ends with "K" (ignore case)
         */
       int lengthWord = sentence_3.length();
      boolean startsA = sentence_3.toLowerCase().startsWith("a");
        System.out.println(lengthWord);
        System.out.println(startsA);
        boolean endsK = sentence_3.toUpperCase().startsWith("K");
        System.out.println(endsK);

        String result_3 ="";
        //Assign result_3 as "Media" if sentence_3 starts with 'a' (ignore case)
        //else assign "Entertainment"
      result_3 = startsA == true ? "Media" : "Entertainment";
        System.out.println(result_3);



    }
}

