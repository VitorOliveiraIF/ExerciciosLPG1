import java.util.Objects;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        String[][] log = new String[5][2];
        log[0][0] = "joao@email.com";
        log[0][1] = "12345678";
        log[1][0] = "pedro@email.com";
        log[1][1] = "teste123";
        log[2][0] = "maria@email.com";
        log[2][1] = "87654321";
        log[3][0] = "pessoa@email.com";
        log[3][1] = "umdoistres";
        log[4][0] = "rafael@email.com";
        log[4][1] = "34534512";

        int tentativa = 3;
        int i;
        Scanner scanner = new Scanner(System.in);


        while(tentativa > 0) {
            System.out.println("Digite o email: ");
            String email = scanner.nextLine();

            System.out.println("Digite a senha: ");
            String senha = scanner.nextLine();

            tentativa--;

            int teste = 0;
            for (i = 0; i < 5; i++) {
                if (Objects.equals(email, log[i][0]) && Objects.equals(senha, log[i][1])) {
                    System.out.println("Login completado com sucesso");
                    teste = 1;
                    break;
                }
            }

            if (teste == 1) {
                break;
            }
            if (teste == 0){
                System.out.println("Os dados informados estão errados\n");
            }

            if (tentativa == 0) {
                System.out.println("Não há mais tentativas");
            }


        }

        scanner.close();

    }
}
