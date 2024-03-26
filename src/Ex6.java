import java.util.Scanner;
import java.util.Random;


public class Ex6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(10) + 1;

        for(int i = 0; i < 3; i++){
        System.out.println("Chute um número ");
        int chute = scanner.nextInt();
        if(chute == numeroAleatorio){
            System.out.println("Parabéns, você acertou!");
            break;
        }
        else{
            if(i !=2){
                System.out.println("Você errou, tente novamente. ");
            }
            else{
                System.out.println("Você errou, não há mais tentativas :( ");
            }
        }
    }
        scanner.close();
    }
}
