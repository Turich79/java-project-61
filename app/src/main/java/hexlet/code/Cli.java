package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String scan() {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        return word;
    }
}
