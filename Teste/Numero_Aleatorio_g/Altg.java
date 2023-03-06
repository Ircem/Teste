package Numero_Aleatorio_g;
import java.util.Random;
import java.util.Scanner;

public class Altg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gera um número aleatório entre 1 e 100
        int numeroAleatorio = random.nextInt(100) + 1;

        System.out.println("Bem-vindo ao jogo de adivinhação!");

        int tentativas = 0;
        boolean acertou = false;

        while (!acertou) {
            System.out.print("Digite um número entre 1 e 100: ");
            int palpite = scanner.nextInt();

            tentativas++;

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas!");
                acertou = true;
            } else if (palpite < numeroAleatorio) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
        }
    }
}

