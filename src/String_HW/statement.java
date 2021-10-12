package String_HW;

public class statement {
    public static void main(String[] args) {



        int accountBalance = 100;
        accountBalance = accountBalance + 200;
        System.out.println("New account balance: " + accountBalance);

        int age = 30;

        System.out.println("Before update: " + age);

        age = 30 + 1;
        System.out.println("After update: " + age);


        String firstName = "Klajd";
        String lastName = "Pupe";
        String fullName = firstName + " " + lastName;
        //System.out.println(fullName);

        int fullNameLength = fullName.length();
        System.out.println(fullNameLength );


        String lowerCase = fullName.toLowerCase();
        System.out.println(lowerCase);

    }

}