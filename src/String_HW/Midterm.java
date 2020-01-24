package String_HW;

public class Midterm {
    public static void main(String[] args) {

//        2.
//        Write a Java program to remove a specific element from an array.
//        Original array: [32, 14, 24, 98, 24, 56, 148, 24, 78, 24]
//        New Array: [32, 14, 98, 56, 148, 78]

        int[] userInput = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24,};
        int toRemove = 24;
        int remove = toRemove;
        int[] input = userInput;

        System.out.println("Before removing the element");
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i] + "");
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i] == remove) {
                input[i] = input[i + 1];
                input[i + 1] = 0;
            }
        }
        System.out.println("After removing the element");
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i] + " ");
        }
    }

    public static int smallestNumb(int[] input) {

        //1.
//        Create a method to return missing smallest positive integer (greater than 0) from given array.
//        Example:
//        For array : [1,3,5,4,2,7]
//        Method should return : 6
//        For array : [-1, -3, 4, 2]
//        Method should return : 1
//        For array : [0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2]
//        Method should return : 6
        int[] numb = {1, 3, 5, 4, 2, 7};

        for (int i = 0; i < input.length; i++) {
            if (i != input[i]) {
                return i;

            }
        }
}






