package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Expr;

public final class Calc {
    private String name;
    private final int iter = 3;

    public Calc(String userName) {
        this.name = userName;
    }

    public void startGame() {
        String halloString = "What is the result of the expression?";
        String[] questions = new String[iter];
        String[] rightAnswers = new String[iter];
        final var maxNum = 20;

        for (int i = 0; i < iter; i++) {
            int number1 = Expr.returnRand(maxNum);
            int number2 = Expr.returnRand(maxNum);
            expression(number1, number2, questions, rightAnswers, i);
        }
        Engine engine = new Engine(name);
        engine.startEngine(halloString, questions, rightAnswers);
    }

    private void expression(int number1, int number2, String[] questions, String[] rightAnswers, int i) {
        if (i % iter == 0) {
            questions[i] = "" + number1 + " + " + number2;
            rightAnswers[i] = Integer.toString(number1 + number2);
        } else if (i % iter == 1) {
            questions[i] = "" + number1 + " * " + number2;
            rightAnswers[i] = Integer.toString(number1 * number2);
        } else if (i % iter == 2) {
            questions[i] = "" + number1 + " - " + number2;
            rightAnswers[i] = Integer.toString(number1 - number2);
        }
    }
}
