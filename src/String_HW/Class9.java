package String_HW;

public class Class9 {

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }

   /** Write. a method to convert given string into Titlecase
    *Input sentence •"happy new year TO, You DeaR"
    * Final answer = "Happy New Year Tö You Dear"
    */
public static String titleCase(String userStr) {
    String formattedStr = "";
    String[] userStrArray = userStr.toUpperCase().split(" ");
    for (String word : userStrArray) {
        formattedStr = formattedStr + word.charAt(0) + word.substring(1).toLowerCase() + " ";
        //' format//tedStr+-word. chart (0) +word, substring (1) , toLowerCase()+" ";
    }
return  formattedStr.trim();
}
/**
 * Write a method to reverse a String
 */
public static String reverseString(String task3String) {
    String rev = "";
    for (int i = task3String.length() - 1; i >= 0; i--) {
        rev = rev + task3String.charAt(i);
    }
    return rev;



}


}
