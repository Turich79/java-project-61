package hexlet.code;

import java.util.Scanner;

public class Engine {
    String name;
    String numGame;
    final static int ITER = 3;

    public Engine(String name, String numGame) {
        this.name = name;
        this.numGame = numGame;
    }

    public void startGame() {
        switch (numGame) {
            case "2" -> startEven();
            case "3" -> startCalc();
            case "4" -> startGCD();
            case "5" -> startProgression();
            case "6" -> startPrime();
        }
    }

    private void startEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ITER; i++) {
            int rand = (int) (Math.random() * 20);
            String resAnswer = rand % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + rand);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            if (!checkAnswer(resAnswer, answer)) {
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
        for (int i = 0; i < ITER; i++) {
            number1 = (int) (Math.random() * 20);
            number2 = (int) (Math.random() * 20);
            resAnswer = Expr.expression(number1, number2, i);
            System.out.print("Your answer: ");
            int answer = sc.nextInt();
            if (!checkAnswer(resAnswer, answer)) {
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
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ITER; i++) {
            number1 = (int) (Math.random() * 100);
            number2 = (int) (Math.random() * 100);
            resAnswer = Expr.returnGCD(number1, number2);
            System.out.print("Your answer: ");
            int answer = sc.nextInt();
            if (!checkAnswer(resAnswer, answer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    private void startProgression() {
        System.out.println("What number is missing in the progression?");
        int resAnswer;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ITER; i++) {
            resAnswer = Expr.getNumberOfProgression();
            System.out.print("\nYour answer: ");
            int answer = sc.nextInt();
            if (!checkAnswer(resAnswer, answer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    private void startPrime(){
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        String resAnswer;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ITER; i++) {
            resAnswer = Expr.predPrimeNumber();
            System.out.print("\nYour answer: ");
            String answer = sc.nextLine();
            if (!checkAnswer(resAnswer, answer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    private boolean checkAnswer(int resAnswer, int answer) {
        if (resAnswer != answer) {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + resAnswer + "'.");
            System.out.println("Let's try again, " + name + "!");
            return false;
        } else {
            System.out.println("Correct!");
            return true;
        }
    }

    private boolean checkAnswer(String resAnswer, String answer) {
        if (!answer.equals(resAnswer)) {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + resAnswer + "'.");
            System.out.printf("Let's try again, " + name + "!");
            return false;
        } else {
            System.out.println("Correct!");
            return true;
        }
    }
}
