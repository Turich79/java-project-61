package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Expr;

public final class GCD {
    private final String name;
    private final int iter = 3;

    public GCD(String userName) {
        this.name = userName;
    }

    public void startGame() {
        String halloString = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[iter];
        String[] rightAnswers = new String[iter];
        final var maxNum = 100;
        for (int i = 0; i < iter; i++) {
            int number1 = Expr.returnRand(maxNum);
            int number2 = Expr.returnRand(maxNum);
            int answer = Expr.returnGCD(number1, number2);
            questions[i] = "" + number1 + " " + number2;
            rightAnswers[i] = Integer.toString(answer);
        }
        Engine engine = new Engine(name);
        engine.startEngine(halloString, questions, rightAnswers);
    }
}
