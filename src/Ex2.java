import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o primeiro termo dessa PA? ");
        int primNumPA = scanner.nextInt();
        System.out.print("Qual é a razão termo dessa PA? ");
        int razaoPA = scanner.nextInt();
        System.out.print("Qual é o maior número dessa PA? ");
        int maiorNumPA= scanner.nextInt();

        scanner.close();

        int numControle = maiorNumPA;
        int rep = 1;

        while(numControle > primNumPA) {
            numControle = numControle - razaoPA;
            rep++;
        }

        int numTermosPA= rep;

        int[] pa = new int[numTermosPA];
        int i;

        scanner.close();

        for(i = 0; i < numTermosPA; i++) {
            pa[i] = primNumPA + (razaoPA * i);
            System.out.print(pa[i] + " ");

        }
    }
}

