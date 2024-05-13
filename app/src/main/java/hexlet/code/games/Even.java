package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Expr;

public class Even {
    public static void startGame() {
        String halloString = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questions = new String[Engine.ITER][2];
        final var maxNum = 20;
        for (int i = 0; i < Engine.ITER; i++) {
            int question = Expr.returnRand(maxNum);
            questions[i][0] = Integer.toString(question);
            questions[i][1] = isEven(question) ? "yes" : "no";
        }
        Engine.startEngine(halloString, questions);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
