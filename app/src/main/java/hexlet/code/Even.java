package hexlet.code;

import java.util.Scanner;

public class Even {
    String name;

    public Even(String name) {
        this.name = name;
    }

    public void startGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int rand = (int) (Math.random() * 20);
            String isEven = rand % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + rand);
            System.out.printf("Your answer: ");
            String answer = sc.nextLine();
            if (!answer.equals(isEven)) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + isEven + "'.");
                System.out.printf("Let's try again, " + name + "!");
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
