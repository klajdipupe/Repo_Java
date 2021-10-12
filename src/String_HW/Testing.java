package String_HW;

public class Testing {
    public static void main(String[] args) {


        //  int age = 30;
        //System.out.println(age);

        //String message = "This is my message";
        //String upperCaseMessage = message.toUpperCase();
        //System.out.println(upperCaseMessage);

        //String [] words = message.split(" ");
        //for (String word : words)  {
        //  System.out.println(word);


        String myStatement = "I am a good programmer";
        System.out.println(myStatement);
        System.out.println(myStatement.length());
        System.out.println(myStatement.toLowerCase());
        System.out.println(myStatement.contains("mohammad"));
        System.out.println(myStatement.charAt(5));
        System.out.println(myStatement.isEmpty());
        System.out.println(myStatement.equals("technosoft"));
        System.out.println(myStatement.startsWith("welcome"));
        System.out.println(myStatement.endsWith("good bye"));


        String extractedString = myStatement.substring(12, 22);
        System.out.println("Extracted word:" + extractedString);

        String[] words = myStatement.split(" ");
        System.out.println("Number of words: " + words.length);

        String replacedStatement = myStatement.replace("r", "f");
        System.out.println("Replaced String: " + replacedStatement);


        int age = 10;
        --age;
        System.out.println(age);

        //int count = 0;
        // while (count <= 100){
        //   System.out.println("Count :" + count);
        //  count++;


        // int  count = 0;
        //  while (count <= 100){
        //   if (count % 7 == 0){
        //       System.out.println("Count: " + count);
        //  }
        // count++; }

        for (int i = 100; i >= 0; i -= 5) {
            System.out.println(i);
        }


            }
}

//}
