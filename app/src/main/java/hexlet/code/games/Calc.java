package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Expr;

public final class Calc {
    public static void startGame() {
        String halloString = "What is the result of the expression?";
        String[][] questions = new String[Engine.ITER][2];
        final var maxNum = 20;

        for (int i = 0; i < Engine.ITER; i++) {
            int number1 = Expr.returnRand(maxNum);
            int number2 = Expr.returnRand(maxNum);
            expression(number1, number2, questions, i);
        }
        Engine.startEngine(halloString, questions);
    }

    private static void expression(int number1, int number2, String[][] questions, int i) {
        if (i % Engine.ITER == 0) {
            questions[i][0] = "" + number1 + " + " + number2;
            questions[i][1] = Integer.toString(number1 + number2);
        } else if (i % Engine.ITER == 1) {
            questions[i][0] = "" + number1 + " * " + number2;
            questions[i][1] = Integer.toString(number1 * number2);
        } else if (i % Engine.ITER == 2) {
            questions[i][0] = "" + number1 + " - " + number2;
            questions[i][1] = Integer.toString(number1 - number2);
        }
    }
}
