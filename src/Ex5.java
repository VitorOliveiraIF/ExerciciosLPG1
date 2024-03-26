import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        System.out.print("Insira um número: ");


        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.print("Os divisores de " + num + " são: ");

        for (int div = 1; div <= num; div++) {
            if (num % div == 0) {
                System.out.print(div + " ");
            }
        }

        scanner.close();
    }
}
