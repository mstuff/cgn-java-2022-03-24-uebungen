import java.util.ArrayList;
import java.util.Scanner;

public class Intermediate2 {
    public static void main(String[] args) {

        boolean runAgain = true;

        String userPromptInput = "\nType in something: ";
        String userPromptToContinue = "\nDo you want to type in more words? [y / n]";

        ArrayList<String> arrayListForUserWords = makeStringArrayList();

        while (runAgain){
            System.out.println("\nThis is what you typed so far: \n");
            printArrayList(arrayListForUserWords);
            String userInput = returnStringAfterUserPrompt(userPromptInput);
            arrayListForUserWords.add(userInput);
            runAgain = continueWhenUserEntersY(userPromptToContinue);
        }
    }

    public static ArrayList<String> makeStringArrayList(){
        return new ArrayList<>();

    }

    public static void printArrayList(ArrayList<String> userInputText) {
        for (int i = 0; i < userInputText.size(); i++) {
            System.out.println(userInputText.get(i));
        }
    }

    public static String returnStringAfterUserPrompt(String userPrompt){
        System.out.println(userPrompt);
        return readUserInput();
    }

    public static String readUserInput(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static boolean continueWhenUserEntersY(String userPrompt){
        String userInput = returnStringAfterUserPrompt(userPrompt);
        if (userInput.equals("y")){
            return true;
        } else {
            System.out.println("program finished");
            return false;
        }
    }
}
