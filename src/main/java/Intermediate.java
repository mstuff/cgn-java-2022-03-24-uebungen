import java.util.Scanner;

public class Intermediate {
    public static void main(String[] args) {
        // printArrayContent();

        // int userInput = getUserInput();
        // printNumberName(fetchNumberNameFromArray(userInput));

        //oneHundred();
    }


    public static String[] arrayOfNumbers = {"eins", "zwei", "drei", "vier", "fünf",
            "sechs", "sieben", "acht", "neun", "zehn"};

    public static void printArrayContent() {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println(arrayOfNumbers[i] + " ");
        }
    }
    public static int getUserInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! Please insert a number between 1 and 10.");
        return scan.nextInt();
    }

    public static String fetchNumberNameFromArray(int number) {
        return arrayOfNumbers[number - 1];
    }

    public static void printNumberName(String numberName){
        System.out.println("Your number is: " + numberName +  ".");
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
