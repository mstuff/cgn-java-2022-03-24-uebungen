import java.util.Scanner;

public class MainNovice {
    public static void main(String[] args) {

        String name = "Maria";
        //printName(name);
        loopName5x(name);
        greetName();

    }
    /*
    public static String printName(String name){
        System.out.println(name);
        return name;

    }

     */

    public static void loopName5x(String name){
        for (int i = 1; i <= 5; ++i){
            System.out.println(name);
        }
    }

    public static boolean greaterZero(int a){
        if(a > 0){
            return true;
        } else {
            return false;
        }
    }

    public static int squareNumber(int number){
        return number * number;
    }

    public static void greetName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! Please insert your name.");
        String name = scan.nextLine();
        System.out.println("Hello " + name + "!");
    }

}
