package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Expr;

public final class Progression {
    public static void startGame() {
        String halloString = "What number is missing in the progression?";
        String[][] questions = new String[Engine.ITER][2];
        final var countOfCycle = 10;
        final var maxOfNumber = 10;
        final var maxIncrement = 5;

        for (int i = 0; i < Engine.ITER; i++) {
            int startNum = Expr.returnRand(maxOfNumber);
            int increment = Expr.returnRand(maxIncrement) + 1;
            int[] progression = getNumberOfProgression(startNum, increment, countOfCycle);
            int hiddenNum = Expr.returnRand(countOfCycle);
            String result = "";
            String itStr = "";
            for (int j = 0; j < countOfCycle; j++) {
                if (j == hiddenNum) {
                    itStr += " ..";
                    result = Integer.toString(progression[j]);
                } else {
                    itStr = itStr + " " + progression[j];
                }
            }
            questions[i][0] = itStr.trim();
            questions[i][1] = result;
        }
        Engine.startEngine(halloString, questions);
    }

    private static int[] getNumberOfProgression(int startNum, int increment, int countOfCycle) {
        int tekNum = startNum;
        int[] tekProgression = new int[countOfCycle];
        for (int i = 0; i < countOfCycle; i++) {
            tekProgression[i] = tekNum + i * increment;
        }
        return tekProgression;
    }
}
