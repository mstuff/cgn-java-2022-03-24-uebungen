import java.util.Scanner;

public class Intermediate {
    public static void main(String[] args) {
       // giveNumberName();
        // int number = 10;
        giveName();
    }


    public static String[] arrayOfNumbers = {"eins", "zwei", "drei", "vier", "fünf",
                "sechs", "sieben", "acht", "neun", "zehn"};

    public static void giveNumberName (){

        for (int i = 0; i < arrayOfNumbers.length; i++){
            System.out.println(arrayOfNumbers[i] + " ");
        }
    }

    public static void giveName (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! Please insert a number between 1 and 10.");
        int number = scan.nextInt();
        System.out.println("Your number is: " + arrayOfNumbers[number-1] + ".");

    }
}

