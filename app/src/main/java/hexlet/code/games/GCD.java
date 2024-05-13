package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Expr;

public final class GCD {
    public static void startGame() {
        String halloString = "Find the greatest common divisor of given numbers.";
        String[][] questions = new String[Engine.ITER][2];
        final var maxNum = 100;
        for (int i = 0; i < Engine.ITER; i++) {
            int number1 = Expr.returnRand(maxNum);
            int number2 = Expr.returnRand(maxNum);
            int answer = returnGCD(number1, number2);
            questions[i][0] = "" + number1 + " " + number2;
            questions[i][1] = Integer.toString(answer);
        }
        Engine.startEngine(halloString, questions);
    }

    private static int returnGCD(int number1, int number2) {
        int gcd = 1;
        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
