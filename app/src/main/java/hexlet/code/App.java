package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        startMenu();
    }

    public static void startMenu() {
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
        String numGame = sc.nextLine();
        if (numGame.equals("0")) {
            return;
        }
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        switch (numGame) {
            case "2":
                Even even = new Even(name);
                even.startGame();
                break;
            case "3":
                Calc calc = new Calc(name);
                calc.startGame();
                break;
            case "4":
                GCD gcd = new GCD(name);
                gcd.startGame();
                break;
            case "5":
                Progression progression = new Progression(name);
                progression.startGame();
                break;
            case "6":
                Prime prime = new Prime(name);
                prime.startGame();
                break;
            default:
        }
    }
}
