package String_HW;

public class StringQuestions {

    public static void main(String[] args) {

//1)
//String myStatment = "I am a good programmer";
//Use string methods to do following tasks:
//	Extract "Programmer" string from myStatement.
//	Display the total number of words in the myStatement.
//	replace all the 'r' characters with 'f' characters.
//2)
//Store your name in a string variable.
//Calculate the length of your name, without using length() method of String class.
//3)
//String[] names = {"Mohammad" , "John", "Ferdous" , "Abul" , "Ratna" , "Mareeha" , "Ruslan" , "Himani"};
//Verify if "JOHN" is present at index 1.
//4)
//Array:
//Store first names of 5 of your friends/colleagues in an array, and display the following in console:
  //  1. Length of that array
    //2. Print name written on 3rd position (hint: 2nd index)
    //3. Name of each friend/colleague
    //4. Does name on 2nd position, start with "A"

 //1.
        String mystatement = "I am a good programmar";

        String extractedString = mystatement.substring(12, 22);
        System.out.println("Extracted word: " + extractedString);

        String [] words = mystatement.split(" ");
        System.out.println("Number of words: " + words.length);

        String replacedStatement = mystatement.replace("r", "f");
        System.out.println("Replaced String: " + replacedStatement);

//2.
         String name = "Klajdi";
         int count = name.lastIndexOf("");
        System.out.println("Count with lasindexof: " + count);
        int charCount = name.toCharArray().length;
        System.out.println("Count with Char Array: " + charCount);

 //3.
        String[] names = {"Mohammed", "John", "Ferdous", "Abdul", "Ratna", "Mareeha", "Ruslan", "Himani"};

        boolean isJohnPresent = names[1].equals("John");
        System.out.println("is John Present: " + isJohnPresent);

 //4.
        String friends [] = {"John", "Michel", "Craig", "Faiz", "Vick"};
        int lengthOfArray = friends.length;
        System.out.println(lengthOfArray);

        System.out.println("Name of Each Friends: " + friends);

        boolean isSecondPositionStartA = friends[2].startsWith("A");
        System.out.println("Is Second Position Name Starts with A: " + isSecondPositionStartA);





    }

}
