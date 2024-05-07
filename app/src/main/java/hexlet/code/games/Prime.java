package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Expr;

public final class Prime {
    private String name;
    private final int iter = 3;

    public Prime(String userName) {
        this.name = userName;
    }

    public void startGame() {
        String halloString = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[iter];
        String[] rightAnswers = new String[iter];
        for (int i = 0; i < iter; i++) {
            int question = predPrimeNumber(rightAnswers, i);
            questions[i] = Integer.toString(question);
        }
        Engine engine = new Engine(name);
        engine.startEngine(halloString, questions, rightAnswers);
    }

    private static int predPrimeNumber(String[] rightAnswers, int i) {
        final var maxOfNumber = 100;
        int number = Expr.returnRand(maxOfNumber);
        if (Expr.isPrime(number)) {
            rightAnswers[i] = "yes";
        } else {
            rightAnswers[i] = "no";
        }
        return number;
    }
}
