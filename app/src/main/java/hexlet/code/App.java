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

    private static void startMenu() {
        Scanner sc = new Scanner(System.in);

        String menu = """
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:""";
        System.out.print(menu + " ");
        String numGame = sc.nextLine();

        switch (numGame) {
            case "1" -> Engine.greet();
            case "2" -> Even.startGame();
            case "3" -> Calc.startGame();
            case "4" -> GCD.startGame();
            case "5" -> Progression.startGame();
            case "6" -> Prime.startGame();
            default -> {
                return;
            }
        }
    }
}
