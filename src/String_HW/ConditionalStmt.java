package String_HW;

public class ConditionalStmt {
    public static void main(String[] args) {


        // 1. Menu
        boolean guestOneVegan = true;
        boolean guestTwoVegan = true;
        //Are both vegan? only offer up vegan dishes.
        // At least one vegan? make sure offer up some vegan options.
        //  Else, offer anything on the menu

        if (guestOneVegan && guestTwoVegan) {
            System.out.println("Offer up only vegan dishes");
        } else if (guestOneVegan || guestTwoVegan) {
            System.out.println("Offer some vegan options");
        } else {
            System.out.println("Offer anything else");
        }


        //2. Driver Controller
        // * I want to be able to put car on P mode, D mode, N mode, R mode
        // * If i am on P mode and parking type is parallel then i can park between two cars
        // * If i am on D mode I can put drive type to Snow type, Sport Type or Regular type
        // * If i am on N mode i can put car in car wash station
        // * If i am on R mode I can only reverse the car and car will activate back camera
        // * If mode is incorrect then print me invalid mode type, please check your car mode

        char mode = 'P';
         mode = 'D';
         mode = 'N';
         mode = 'R';

         if (mode == 'P')
        { System.out.println("I can park between two cars");}
         if (mode == 'D')
        {System.out.println("I can put drive type to Snow, Sport or Regular type");}
         if (mode == 'N')
        {System.out.println("I can put the car in the washing station");}
        else if (mode == 'R')
        {System.out.println("I can reverse the car and the back camera will be avtivated");}
        else
        { System.out.println("Invalid mode type, please check your car mode");}


//        3. Store a number in an int variable.
//        if the number is divisible by 15
//        Display "Divisible by 15"
//        Otherwise
//        Display the remainder you get when divide number by 15

        int num = 100;
        if (num % 15 == 0)
            System.out.println("Divisible by 15");
        else
            System.out.println(num % 15);

        // 4. Store your name in a variable.
        // if your name length comes out greater than 8
        // Display your name after replacing all 'a' to 'A' from your name.
        //        Otherwise
        //Display your name in uppercase.

        String name = "Klajdi";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());


    }
}
