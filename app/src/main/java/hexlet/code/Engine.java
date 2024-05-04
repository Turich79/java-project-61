package hexlet.code;

import java.util.Scanner;

public class Engine {
    String name;
    String numGame;
    final int COUNT_OF_ITER = 3;

    public Engine(String name, String numGame) {
        this.name = name;
        this.numGame = numGame;
    }

    public void startGame() {
        if (numGame.equals("2")) {
            startEven();
        } else if (numGame.equals("3")) {
            startCalc();
        }
    }

    public void startEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < COUNT_OF_ITER; i++) {
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

    public void startCalc() {
        System.out.println("What is the result of the expression?");
        int number1;
        int number2;
        int resNum;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < COUNT_OF_ITER; i++) {
            number1 = (int) (Math.random() * 20);
            number2 = (int) (Math.random() * 20);
            resNum = expression(number1, number2, i);
            System.out.printf("Your answer: ");
            int answer = sc.nextInt();
            if (resNum != answer) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + resNum + "'.");
                System.out.printf("Let's try again, " + name + "!");
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    private int expression(int number1, int number2, int i) {
        if (i == 0) {
            System.out.println("Question: " + number1 + " + " + number2);
            return number1 + number2;
        } else if (i == 1) {
            System.out.println("Question: " + number1 + " * " + number2);
            return number1 * number2;
        } else if (i == 2) {
            System.out.println("Question: " + number1 + " - " + number2);
            return number1 - number2;
        }
        return 0;
    }
}
