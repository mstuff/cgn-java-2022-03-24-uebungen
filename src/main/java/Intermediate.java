import java.util.ArrayList;
import java.util.Scanner;

public class Intermediate {
    public static void main(String[] args) {
        // printArrayContent();

        // int userInput = getUserInput();
        // printNumberName(fetchNumberNameFromArray(userInput));

        //oneHundred();

       /* ArrayList<String> textStorage = new ArrayList<>();
        System.out.println("Please insert some text: ");
        textStorage.add(getUserInputText());
        printArrayList(textStorage);
        */
        scanSavePrint();





    }

    public static String[] arrayOfNumbers = {"eins", "zwei", "drei", "vier", "fünf",
            "sechs", "sieben", "acht", "neun", "zehn"};

    public static void printArrayContent(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int getUserInputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! Please insert a number between 1 and 10.");
        return scan.nextInt();
    }

    public static String fetchNumberNameFromArray(int number) {
        return arrayOfNumbers[number - 1];
    }

    public static void printNumberName(String numberName) {
        System.out.println("Your number is: " + numberName + ".");
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

    public static String getUserInputText() {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Please insert some text: ");
        return scan.nextLine();
    }

    public static void printArrayList (ArrayList<String> userInputText) {
        for (int i = 0; i < userInputText.size(); i++) {
        System.out.println(userInputText.get(i));
        }
    }

    public static void scanSavePrint(){
        String runAgain = "y";
        while (runAgain == "y"){
            //do something;
            System.out.println("Continue? [y/n]");
            runAgain = getUserInputText();
        }
    }










}
