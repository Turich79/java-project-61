package hexlet.code;

import java.util.Scanner;

public class Engine {
    private String name;
    private String numGame;
    private final int iter = 3;

    public Engine(final String userName, final String numberOfGame) {
        this.name = userName;
        this.numGame = numberOfGame;
    }

    public void startGame() {
        switch (numGame) {
            case "2":
                startEven();
                break;
            case "3":
                startCalc();
                break;
            case "4":
                startGCD();
                break;
            case "5":
                startProgression();
                break;
            case "6":
                startPrime();
                break;
            default:
        }
    }

    private void startEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int maxNum = 20;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < iter; i++) {
            int rand = (int) (Math.random() * maxNum);
            String resAnswer = rand % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + rand);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            if (incorrectAnswer(resAnswer, answer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    private void startCalc() {
        System.out.println("What is the result of the expression?");
        int number1;
        int number2;
        int resAnswer;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < iter; i++) {
            number1 = (int) (Math.random() * 20);
            number2 = (int) (Math.random() * 20);
            resAnswer = Expr.expression(number1, number2, i);
            System.out.print("Your answer: ");
            int answer = sc.nextInt();
            if (incorrectAnswer(resAnswer, answer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    private void startGCD() {
        System.out.println("Find the greatest common divisor of given numbers.");
        int number1;
        int number2;
        int resAnswer;
        int maxNum = 100;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < iter; i++) {
            number1 = (int) (Math.random() * maxNum);
            number2 = (int) (Math.random() * maxNum);
            resAnswer = Expr.returnGCD(number1, number2);
            System.out.print("Your answer: ");
            int answer = sc.nextInt();
            if (incorrectAnswer(resAnswer, answer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    private void startProgression() {
        System.out.println("What number is missing in the progression?");
        int resAnswer;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < iter; i++) {
            resAnswer = Expr.getNumberOfProgression();
            System.out.print("\nYour answer: ");
            int answer = sc.nextInt();
            if (incorrectAnswer(resAnswer, answer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    private void startPrime() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        String resAnswer;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < iter; i++) {
            resAnswer = Expr.predPrimeNumber();
            System.out.print("\nYour answer: ");
            String answer = sc.nextLine();
            if (incorrectAnswer(resAnswer, answer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    private boolean incorrectAnswer(int resAnswer, int answer) {
        if (resAnswer != answer) {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + resAnswer + "'.");
            System.out.println("Let's try again, " + name + "!");
            return true;
        } else {
            System.out.println("Correct!");
            return false;
        }
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
