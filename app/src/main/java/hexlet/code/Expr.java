package hexlet.code;

public class Expr {
    public static int expression(int number1, int number2, int i) {
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

    public static int returnGCD(int number1, int number2) {
        int gcd = 1;
        System.out.println("Question: " + number1 + " " + number2);
        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int getNumberOfProgression() {
        final var countOfCycle = 10;
        int[] mas = new int[countOfCycle];
        final var maxOfNumber = 10;
        final var maxIncrement = 5;
        int startNum = (int) (Math.random() * maxOfNumber);
        int hiddenNum = (int) (Math.random() * countOfCycle);
        int increment = (int) (Math.random() * maxIncrement + 1);
        mas[0] = startNum;
        var assSt = (hiddenNum == 0) ? ".." : mas[0];
        System.out.print("Question: " + assSt);
        for (int i = 1; i < countOfCycle; i++) {
            mas[i] = mas[i - 1] + increment;
            if (i == hiddenNum) {
                System.out.print(" ..");
            } else {
                System.out.print(" " + mas[i]);
            }
        }
        return mas[hiddenNum];
    }

    public static String predPrimeNumber() {
        final var maxOfNumber = 100;
        int number = (int) (Math.random() * maxOfNumber + 1);
        System.out.print("Question: " + number);
        if (isPrime(number)) {
            return "yes";
        } else {
            return "no";
        }
    }

    private static boolean isPrime(int number) {
        int halfNumber = number / 2;
        for (int i = 2; i <= halfNumber; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}