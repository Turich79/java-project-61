package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Expr;

public final class Calc {
    public static void startGame() {
        String halloString = "What is the result of the expression?";
        String[][] questions = new String[Engine.ITER][2];
        final var maxNum = 20;
        final var countOfFunct = 3;
        String[] funct = {"+", "*", "-"};

        for (int i = 0; i < Engine.ITER; i++) {
            int number1 = Expr.returnRand(maxNum);
            int number2 = Expr.returnRand(maxNum);
            int numPos = Expr.returnRand(countOfFunct);
            questions[i][0] = "" + number1 + " " + funct[numPos] + " " + number2;
            questions[i][1] = "" + expression(number1, number2, funct[numPos]);
        }
        Engine.startEngine(halloString, questions);
    }

    private static int expression(int number1, int number2, String functS) {
        int result = switch (functS) {
            case "+" -> number1 + number2;
            case "*" -> number1 * number2;
            case "-" -> number1 - number2;
            default -> 0;
        };
        return result;
    }
}
