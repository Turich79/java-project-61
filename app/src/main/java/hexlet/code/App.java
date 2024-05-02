package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String num = sc.nextLine();//Cli.scan();
        if (num.equals("0")) {
            return;
        }
        System.out.println("Welcome to the Brain Games!\n");
        System.out.print("May I have your name? ");
        String name = sc.nextLine();//Cli.scan();
        System.out.println("Hello, " + name + "!");
        if(num.equals("2")){
            Even game = new Even(name);
            game.startGame();
        }
    }
}
