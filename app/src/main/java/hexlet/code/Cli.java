package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String scan(){
        Scanner sc = new Scanner(System.in);
        //System.out.print("May I have your name? ");
        String word = sc.nextLine();
        return word;
        //System.out.println("Hello, " + name + "!");
    }
}
