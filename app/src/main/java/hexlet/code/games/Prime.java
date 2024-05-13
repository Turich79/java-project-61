package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Expr;

public final class Prime {
    public static void startGame() {
        String halloString = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questions = new String[Engine.ITER][2];
        final var maxOfNumber = 100;
        for (int i = 0; i < Engine.ITER; i++) {
            int number = Expr.returnRand(maxOfNumber);
            questions[i][0] = Integer.toString(number);
            if (isPrime(number)) {
                questions[i][1] = "yes";
            } else {
                questions[i][1] = "no";
            }
        }
        Engine.startEngine(halloString, questions);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        int halfNumber = number / 2;
        for (int i = 2; i <= halfNumber; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
