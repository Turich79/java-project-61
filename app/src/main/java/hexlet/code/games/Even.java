package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Expr;

public final class Even {
    private String name;
    private final int iter = 3;

    public Even(String userName) {
        this.name = userName;
    }

    public void startGame() {
        String halloString = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[iter];
        String[] rightAnswers = new String[iter];
        final var maxNum = 20;
        for (int i = 0; i < iter; i++) {
            int question = Expr.returnRand(maxNum);
            questions[i] = Integer.toString(question);
            rightAnswers[i] = question % 2 == 0 ? "yes" : "no";
        }
        Engine engine = new Engine(name);
        engine.startEngine(halloString, questions, rightAnswers);
    }
}
