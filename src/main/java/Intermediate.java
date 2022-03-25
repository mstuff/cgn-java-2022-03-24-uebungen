import java.util.Scanner;

public class Intermediate {
    public static void main(String[] args) {
        //giveNumberName();
        // int number = 10;
         giveName();
        //oneHundred();
    }


    public static String[] arrayOfNumbers = {"one", "two", "three", "four", "five",
            "six", "Seven", "eight", "nine", "ten"};

    public static void giveNumberName() {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println(arrayOfNumbers[i] + " ");
        }
    }

    public static void giveName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! Please insert a number between 1 and 10.");
        int number = scan.nextInt();
        System.out.println("Your number is: " + arrayOfNumbers[number - 1] + ".");

    }

    public static void oneHundred() {
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                System.out.println("#" + i);
            } else if (i % 5 == 0) {
                System.out.println("$" + i);
            } else {
                System.out.println(i);
            }
        }
    }


    }
