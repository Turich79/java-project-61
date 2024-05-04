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
        final int COUNT = 10;
        int[] mas = new int[COUNT];
        int startNum = (int) (Math.random() * 10);
        int hiddenNum = (int) (Math.random() * COUNT);
        int increment = (int) (Math.random() * 5 + 1);
        mas[0] = startNum;
        var assSt = (hiddenNum == 0) ? ".." : mas[0];
        System.out.print("Question: " + assSt);
        for (int i = 1; i < COUNT; i++) {
            mas[i] = mas[i - 1] + increment;
            if (i == hiddenNum) {
                System.out.print(" .. ");
            } else {
                System.out.print(" " + mas[i]);
            }
        }
        return mas[hiddenNum];
    }
}
