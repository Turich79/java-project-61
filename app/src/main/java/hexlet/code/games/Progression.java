package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Expr;

public final class Progression {
    private String name;
    private final int iter = 3;

    public Progression(String userName) {
        this.name = userName;
    }

    public void startGame() {
        String halloString = "What number is missing in the progression?";
        String[] questions = new String[iter];
        String[] rightAnswers = new String[iter];
        final var maxNum = 20;
        for (int i = 0; i < iter; i++) {
            int answer = getNumberOfProgression(questions, i);
            rightAnswers[i] = "" + answer;
        }
        Engine engine = new Engine(name);
        engine.startEngine(halloString, questions, rightAnswers);
    }

    public static int getNumberOfProgression(String[] questions, int j) {
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
        questions[j] = itStr;
        return result;
    }
}
