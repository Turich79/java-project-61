package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        startMenu();
    }

    public static void startMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String numGame = sc.nextLine();//Cli.scan();
        if (numGame.equals("0")) {
            return;
        }
        System.out.println("Welcome to the Brain Games!\n");
        System.out.print("May I have your name? ");
        String name = sc.nextLine();//Cli.scan();
        System.out.println("Hello, " + name + "!");
        if(numGame.equals("2") || numGame.equals("3")
                || numGame.equals("4") || numGame.equals("5")
                || numGame.equals("6")){
            Engine game = new Engine(name, numGame);
            game.startGame();
        }
    }
}
