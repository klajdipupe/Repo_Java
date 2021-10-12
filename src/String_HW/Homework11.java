package String_HW;

import java.util.ArrayList;
import java.util.List;

public class Homework11
{
    public static void main(String[] args) {


        String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        System.out.println("Repeated words -> " + findRepeatingValues(words));
/**
* Question 2:
        Create a method that would return the values occurring more than I times in given array
 * String[] words = { "happy", "peace", " "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
 * ["happy", "joy", "laugh"]
 *
 *
 * String[] words = {"happy", "laugh", "joy"};
 *
 */

    }
    public static List<String> findRepeatingValues(String[] arr){
        List <String> repeatedValues = new ArrayList<>();
        for (int i=0; i< arr.length; i++ ){
             for (int j=i+1; j < arr.length; j++){
                 if (arr[i].equalsIgnoreCase(arr[j]) && !repeatedValues.contains(arr[i].toLowerCase()))  {
                     repeatedValues.add(arr[i].toLowerCase());
                 }
             }
        }
        return repeatedValues;
    }


    /**
     * Question 3
     * Create a method that can print the count of given value in the given array
     * String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
     * String word = "happy"
     *
     *
     *output: 'happy' occurs N times in array.
     *
     * String [] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
     * String word = "PEace"
     *
     * output: 'peace' occur only one time in array
     *
     * String [] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
     * String word = "Helpful"
     *
     * output: 'Helpful' is not present in array
     */

  /*
  int counter = 0
  String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
   String word = "happy";

  for (int i=0; i<words.length; i++) {
    if(words[i] == word){
        counter++

   */
}