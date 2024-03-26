import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
String[] consoante = {"b", "c", "d", "f", "g", "h", "j", "k" ,"l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
String[] vogal = {"a", "e", "i", "o", "u"};
int numVog = 0, numCons = 0;

        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        char[] arrayDeChars = nome.toCharArray();

        for (char c : arrayDeChars) {
            if (Arrays.asList(consoante).contains(String.valueOf(c))) {
                numCons++;
            } else if (Arrays.asList(vogal).contains(String.valueOf(c))) {
                numVog++;
            }
        }

        System.out.println(STR."Número de consoantes: \{numCons}");
        System.out.println(STR."Número de vogais: \{numVog}");


        scanner.close();


    }
}
