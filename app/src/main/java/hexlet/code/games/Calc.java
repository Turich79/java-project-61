package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Expr;

public final class Calc {
    public static void startGame() {
        String halloString = "What is the result of the expression?";
        String[][] questions = new String[Engine.ITER][2];
        final var maxNum = 20;
        String funct = "";

        for (int i = 0; i < Engine.ITER; i++) {
            int number1 = Expr.returnRand(maxNum);
            int number2 = Expr.returnRand(maxNum);
            int dev = i % Engine.ITER;
            if (dev == 0) {
                funct = "+";
            } else if (dev == 1) {
                funct = "*";
            } else {
                funct = "-";
            }
//////на такой свитч ругается checkstyle
//            switch (dev) {
//                case 0 -> funct = "+";
//                case 1 -> funct = "*";
//                default -> funct = "-";
//            }
            questions[i][0] = "" + number1 + " " + funct + " " + number2;
            questions[i][1] = "" + expression(number1, number2, funct);
        }
        Engine.startEngine(halloString, questions);
    }

    private static int expression(int number1, int number2, String funct) {
        int result = switch (funct) {
            case "+" -> number1 + number2;
            case "*" -> number1 * number2;
            default -> number1 - number2;
        };
        return result;
    }
}
