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
}
