package String_HW;
import java.util.Scanner;

public class ConditionalStmt {
    public static void main(String[] args) {


//                 * 3. Store a number in an int variable.
//                 * if the number is divisible by 15
//                 * Display "Divisible by 15"
//                 * Otherwise
//                 * Display the remainder you get when divide number by 15
//
                int num = 32;
                int divisibleBy = 15;
                int remainder = num % divisibleBy; 
                if(remainder == 0) {
                    System.out.println("Divisible by " + divisibleBy);
                } else {
                    System.out.println("Remainder after dividing " + num + " by " + divisibleBy + " = " + remainder);
                }

//                 * 4. Store your name in a variable.
//                 * if your name length comes out greater than 8
//                 * 	Display your name after replacing all 'a' to 'A' from your name.
//                 * Otherwise
//                 * 	Display your name in uppercase.

                String myName = "Deepak";
                int nameLength = myName.length();
                if (nameLength > 8) {
                    System.out.println("Replacing all 'a' to 'A' from " + myName + ": " + myName.replaceAll("a", "A"));
                } else {
                    System.out.println(myName + " in all uppercase: " + myName.toUpperCase());
                }

//                 * 5. Create an array of 5 int values. Calculate the average of those 5 values. [pls don't use for-loop]
//                 * If you average of stored numbers greater than 25
//                 * 	Display Array from index 0 to last
//                 * Otherwise
//                 * 	Display Array from index last to 0
//
                int[] numArray = {4, 21, 55, 7, 32};
                int lenArray = numArray.length;
                //Adding all numbers of array without using for-loops
                double arrayTotal = numArray[lenArray-5]+numArray[lenArray-4]+numArray[lenArray-3]+numArray[lenArray-2]+numArray[lenArray-1];
                //above code is same as -> double arrayTotal = numArray[0]+numArray[1]+numArray[2]+numArray[3]+numArray[4];
                double avgArray = arrayTotal/lenArray;


                if (avgArray > 25) {
                    System.out.println("Print from index 0 to last -> " +
                            numArray[lenArray-5] + ", " + numArray[lenArray-4] + ", " +
                            numArray[lenArray-3] + ", " + numArray[lenArray-2] + ", " +
                            numArray[lenArray-1]);
                } else {
                    System.out.println("Print from index last to 0 -> " +
                            numArray[lenArray-1] + ", " + numArray[lenArray-2] + ", " +
                            numArray[lenArray-3] + ", " + numArray[lenArray-4] + ", " +
                            numArray[lenArray-5]);
                }

//                 * 1.Students score, total possible score
//                 * 15/20 -> You got a C (75%)
//                 * A 90-100, B 80-89, C 70-79, D 60-69, F 0-59


                double score = 19;
                int maxScore = 20;
                double percentage = (score*100)/maxScore;


//                 * int a = 15;
//                 * int b = 20;
//                 * 3.333
//                 * a/b = 3.3


                if (percentage >= 90) {
                    System.out.println("You got 'A' grade.");
                } else if (percentage >= 80) {
                    System.out.println("You got 'B' grade.");
                } else if (percentage >= 70) {
                    System.out.println("You got 'C' grade.");
                } else if (percentage >= 60) {
                    System.out.println("You got 'D' grade.");
                } else {
                    System.out.println("You got 'F' grade.");
                }


//                 * Write a logic that prints multiplication table of the user provided number upto ten.


                Scanner input = new Scanner(System.in);
                System.out.print("Enter number for which you want to generate multiplication table: ");
                int mulTableNum = input.nextInt();
                int tableUptoNum = 10;
                System.out.println("Multiplication for " + mulTableNum);
                for (int i=1 ; i <= tableUptoNum ; i++) {
                    System.out.println(mulTableNum + " * " + i + " = " + mulTableNum*i);
                }

//                 * num * i = num*i
//                 * 2 * 2 = 4
//                 * 2 * 3 = 6
//                 * ...
//                 */
//​
//                /**
//                 * Write a logic that checks if a number is a Prime number

                System.out.print("Enter number to check if it's prime number or not: ");
                int checkPrime = input.nextInt();
                boolean isPrime = true;
                if (checkPrime > 2) {
                    for (int i = 2; i < checkPrime; i++) { //for condition can also be, i < checkPrime
                        if (checkPrime % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                if (isPrime) {
                    System.out.println(checkPrime + " is a prime number");
                } else {
                    System.out.println(checkPrime + " is NOT a prime number");
                }

//            2. Driver Controller
//             * I want to be able to put car on P mode, D mode, N mode, R mode
//             * If i am on P mode and parking type is parallel then i can park between two cars
//             * If i am on D mode I can put drive type to Snow type, Sport Type or Regular type
//             * If i am on N mode i can put car in car wash station
//             * If i am on R mode I can only reverse the car and car will activate back camera
//             * If mode is incorrect then print me invalid mode type, please check your car mode

                String gear = "d";
                boolean isParallelParking = true;
                String driveMode = "SPORT";
                switch (gear.toUpperCase()) {
                    case "P":
                        System.out.println("");
                        if (isParallelParking) {
                            System.out.println("parallel parking available");
                        } else {
                            System.out.println("Not available");
                        }
                        break;
                    case "D":
                        System.out.println();
                        switch (driveMode.toLowerCase()) {
                            case "snow":
                                System.out.println("YOu are driving in snow mode");
                                break;
                            case "sport":
                                System.out.println("YOu are driving in sport mode");
                                break;
                            default:
                                System.out.println("Wrong mode entered: " + driveMode);
                        }
                        break;
                    case "N":
                        System.out.println("Neutral mode");
                        break;
                    case "R":
                        System.out.println("Back camera switches on");
                        break;
                    default:
                        System.out.println("Invalid gear entered: " + gear);
                }
            }
        }