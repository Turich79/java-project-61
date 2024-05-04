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
        int count = 10;
        int[] mas = new int[count];
        int maxStartNum = 10;
        int maxIncrement = 5;
        int startNum = (int) (Math.random() * maxStartNum);
        int hiddenNum = (int) (Math.random() * count);
        int increment = (int) (Math.random() * maxIncrement + 1);
        mas[0] = startNum;
        var assSt = (hiddenNum == 0) ? ".." : mas[0];
        System.out.print("Question: " + assSt);
        for (int i = 1; i < count; i++) {
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
        int maxNumber = 100;
        int number = (int) (Math.random() * maxNumber + 1);
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
