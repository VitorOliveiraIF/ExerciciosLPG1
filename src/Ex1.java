import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o primeiro termo dessa PA? ");
        int primNumPA = scanner.nextInt();
        System.out.print("Qual é a razão termo dessa PA? ");
        int razaoPA = scanner.nextInt();
        System.out.print("Qual é o número de termos dessa PA? ");
        int numTermosPA= scanner.nextInt();
        int[] pa = new int[numTermosPA];
        int i;

        scanner.close();

        for(i = 0; i < numTermosPA; i++) {
            pa[i] = primNumPA + (razaoPA * i);
            System.out.print(STR."\{pa[i]} ");
        }



    }

}

