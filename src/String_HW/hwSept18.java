package String_HW;

import java.util.Arrays;

public class hwSept18 {
    public static void main(String[] args) {


        // print length of sentence & does sentence start with A? H? C?
        String sentence = "Hello world";
        int sentence_Length = sentence.length() -1 ;
        System.out.println(" sentence length is : " + sentence_Length);

        boolean doesStartWith_A = sentence.startsWith("A");
        System.out.println(doesStartWith_A);

       boolean doesStartWith_H = sentence.startsWith("H");
        System.out.println(doesStartWith_H);


        String sentenc3e = "Hello world";
        System.out.println(sentenc3e.toUpperCase());


        //create variable to create student score and max score?
        double studentScore = 85;
        double maxScore = 100;
        char grade;
        /*if (studentScore <= 100 && studentScore >=91){
            System.out.println("Grade A");
        } else if (studentScore <= 90.99&& studentScore >=81){
            System.out.println("Grade B");
        } else if (studentScore <= 80.99&& studentScore >=71){
        System.out.println("Grade C");
        } else if (studentScore <= 70.99&& studentScore >=61){
        System.out.println("Grade D");
        }else if (studentScore <= 60.99&& studentScore >=51) {
            System.out.println("Grade E");
        }else {
            System.out.println("F");
        }*/
        if (studentScore <= 100 && studentScore >=91){
             grade = 'a';
        } else if (studentScore <= 90.99&& studentScore >=81){
            grade = 'b';
        } else if (studentScore <= 80.99&& studentScore >=71){
            grade = 'c';
        } else if (studentScore <= 70.99&& studentScore >=61){
            grade = 'd';
        }else if (studentScore <= 60.99&& studentScore >=51) {
            grade = 'e';
        }else {
            grade = 'f';
        }

        System.out.println("The Student score is : " + studentScore + " & letter grade is : " + grade);
        String sentence5 = "hello world peace";
        String[] split1 = sentence5.split(" ");
        // String [] words = {hello , world } ;
        System.out.println(Arrays.toString(split1));
       // String sentence4 = "hello ";
        //String sentence6 =  world";
        String lol = split1[0].substring(0,1).toUpperCase() + split1[0].substring(1).toLowerCase();
        String lolz = split1[1].substring(0,1).toUpperCase() + split1[1].substring(1).toLowerCase();
        String lolzz = split1[2].substring(0,1).toUpperCase() + split1[2].substring(1).toLowerCase();
        System.out.println(lol);
        System.out.println(lolz);
        System.out.println(lolzz);









    }




}
