package hexlet.code;
import java.util.Scanner;

public final class Engine {
    private static String name;
    public static final int ITER = 3;

    public static void startEngine(String halloString, String[][] questions) {
        greet();
        Scanner sc = new Scanner(System.in);

        System.out.println(halloString);
        for (int i = 0; i < ITER; i++) {
            System.out.println("Question: " + questions[i][0]);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            if (!answer.equals(questions[i][1])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + questions[i][1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    public static void greet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!\n"
                + "May I have your name? ");
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
