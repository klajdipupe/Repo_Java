package String_HW;

public class Homework_5 {
    public static void main(String[] args) {

        /** Write. a method to convert given string into Titlecase
         *Input sentence •"happy new year TO, You DeaR"
         * Final answer = "Happy New Year Tö You Dear"
         */



        String sentence = "happy new year TO You DeaR love";

        String[] arr1 = sentence.split(" ");
        String newSentence = "";
        for (int i = 0; i <= arr1.length - 1; i++) {
            newSentence = newSentence + " " + arr1[i].substring(0, 1).toUpperCase() + arr1[i].substring(1).toLowerCase();
        }
        newSentence = newSentence.trim();
        System.out.println(newSentence);


/**
 * Calculate the average of this array
 */

        int [] numbers = {4, 5, 6,29, 18,19};
          int total =0;

          for (int count = 0; count<numbers.length; count++){
           total+= numbers[count];
       }
        System.out.println(total/numbers.length);


    }

      }