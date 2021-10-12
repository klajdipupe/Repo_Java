package String_HW;

import java.util.Arrays;

public class Class_5 {
    public static void main(String[] args) {

  // Question - 1;
        /**
         * String threeWorldSentence = "hApPy nEW yeAr"
         * // code
         * String threeWordSentence = "Happy New Year'
         *
         */
        String threeWordSentence_1 = "hApPy nEW yeAr";
        System.out.println("Before code : " + threeWordSentence_1);

     String[] words = threeWordSentence_1.split(" ");
     String word_1 = words[0].substring(0,1).toUpperCase() + words[0].substring(1).toLowerCase();
     String word_2 = words[1].substring(0,1).toUpperCase() + words[1].substring(1).toLowerCase();
     String word_3 = words[2].substring(0,1).toUpperCase() + words[2].substring(1).toLowerCase();

        System.out.println(" After the code : " + word_1 + " " + word_2 + " " + word_3);



      //  Question_2
        /**
         * Create the abbrevation // HNY
         */


        String wordSentence = "happy new year";
        String abr = "";
        String [] newWord = wordSentence.split(" ");
        abr = (newWord [0].substring(0,1) + newWord[1].substring(0,1) + newWord[2].substring(0,1)).toUpperCase();
        System.out.println(abr);


        /**

        num is divisible by 2 and num < 20
        sout (num * 10)
        sout (num is divisible by 2)
        num is divisible by 5 or 3
        sout(remainder of num] when divided by 2)
        sout (num is divisible by 5 or 3)
        num < 20
        sout ("less than 20")
        */
        int num = 15;

        if (num%2 == 0 && num < 20){
            System.out.println(num + " * 10 = " + (num + 10));
            System.out.println("num is divisible by 2");
        }
        else if (num%5 == 0 || num%3 == 0){
            System.out.println("remainder of " + num + "  when divided by 2: " + num%2);
            System.out.println(num + " divisible by 5 or 3");
    } else if (num < 20) {
            System.out.println(num + " less than 20");
        }


    }
}
