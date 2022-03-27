import java.util.Scanner;

public class Expert {
    public static void main(String[] args) {
        System.out.println(reverseUserInput());
    }

    public static String reverseUserInput(){
        String userPromptForInput = "Please enter the text you want to reverse: ";
        String userInput = returnStringAfterUserPrompt(userPromptForInput);
        String userInputReversed = "";
        int stringLength = getLength(userInput);


        for (int i = 1; i <= stringLength; i++){
            char addToReversedString = userInput.charAt(stringLength-i);
            userInputReversed = addCharToString(userInputReversed, addToReversedString);
        }
        return userInputReversed;
    }

    public static String addCharToString (String stringToExtend, char charForAdding){
        return stringToExtend + charForAdding;
    }

    public static String returnStringAfterUserPrompt(String userPrompt){
        System.out.println(userPrompt);
        return readUserInput();
    }

    public static String readUserInput(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static int getLength(String userInput){
        return (userInput.length());
    }

}

