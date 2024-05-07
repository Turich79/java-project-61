package hexlet.code;

import java.util.Scanner;

public final class Engine {
    private String name;
    private final int iter = 3;

    public Engine(final String userName) {
        this.name = userName;
    }

    public void startEngine(String halloString, String[] questions, String[] rightAnswers) {
        System.out.println(halloString);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < iter; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();

            if (incorrectAnswer(rightAnswers[i], answer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    private boolean incorrectAnswer(String resAnswer, String answer) {
        if (!answer.equals(resAnswer)) {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + resAnswer + "'.");
            System.out.println("Let's try again, " + name + "!");
            return true;
        } else {
            System.out.println("Correct!");
            return false;
        }
    }
}
