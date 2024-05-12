package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Expr;

public final class Progression {
    public static void startGame() {
        String halloString = "What number is missing in the progression?";
        String[][] questions = new String[Engine.ITER][2];
        for (int i = 0; i < Engine.ITER; i++) {
            getNumberOfProgression(questions, i);
        }
        Engine.startEngine(halloString, questions);
    }

    public static void getNumberOfProgression(String[][] questions, int j) {
        final var countOfCycle = 10;
        final var maxOfNumber = 10;
        final var maxIncrement = 5;
        int startNum = Expr.returnRand(maxOfNumber);
        int hiddenNum = Expr.returnRand(countOfCycle);
        int result = (hiddenNum == 0) ? 0 : startNum;
        int increment = Expr.returnRand(maxIncrement) + 1;
        int tekNum = startNum;
        String itStr = (hiddenNum == 0) ? ".." : "" + tekNum;
        for (int i = 1; i < countOfCycle; i++) {
            tekNum += increment;
            if (i == hiddenNum) {
                result = tekNum;
                itStr += " ..";
            } else {
                itStr += " " + tekNum;
            }
        }
        questions[j][0] = itStr;
        questions[j][1] = Integer.toString(result);
    }
}
