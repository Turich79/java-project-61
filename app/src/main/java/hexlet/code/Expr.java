package hexlet.code;

public class Expr {
    public static int returnRand(int maxNum) {
        return (int) (Math.random() * maxNum);
    }

    public static int returnGCD(int number1, int number2) {
        int gcd = 1;
        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static boolean isPrime(int number) {
        int halfNumber = number / 2;
        for (int i = 2; i <= halfNumber; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
