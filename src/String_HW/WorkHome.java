package String_HW;

public class WorkHome {
    public static void main(String[] args) {

    /**
     * task 1:
     * Find out if the value stored in word variable is palindrome.
     * And, store the result in "isPalindrome" variable
     * -> palindrome: string which reads the same in reverse
     * eg:
     * level -> level (palindrome)
     * eye -> eye  (palindrome)
     * head -> dash (not palindrome)
     */
    // String task1String = "";


        /**
         * Task 2
         * Count the number of vowels (a,e,i,o,u) present in the given sentence
         */
        int count = 0;
        char [] vowels = { 'a', 'e', 'i', 'o', 'u'};
        String sentence = "hOW arE You My DEAr FRiEnd";
      for (int i = 0 ; i<sentence.length(); i++){
          char ch = sentence.toLowerCase().charAt(i);
          for ( char vowel : vowels){
          if (vowel == ch) {
              count++;
          }
          }
      }
        System.out.println("Number of vowels in the given sentence is "+count);


        /**
         * Task 3:
         * Write code to reverse a string
         *
         * "happy holidays"
         *
         * "syadiloh yppah"
         */

        String str = "happy holidays";
        String rev ="";

        for (int i = str.length()-1; i >=0; i--)
            rev = rev + str.charAt(i);{
            System.out.println(rev);
        }

    }
}
