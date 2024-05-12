package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Expr;

public final class Prime {
    public static void startGame() {
        String halloString = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questions = new String[Engine.ITER][2];
        for (int i = 0; i < Engine.ITER; i++) {
            int question = predPrimeNumber(questions, i);
            questions[i][0] = Integer.toString(question);
        }
        Engine.startEngine(halloString, questions);
    }

    private static int predPrimeNumber(String[][] questions, int i) {
        final var maxOfNumber = 100;
        int number = Expr.returnRand(maxOfNumber);
        if (isPrime(number)) {
            questions[i][1] = "yes";
        } else {
            questions[i][1] = "no";
        }
        return number;
    }

    public static boolean isPrime(int number) {
        int halfNumber = number / 2;
        for (int i = 2; i <= halfNumber; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
