package lita04;
import java.ultil.Scanner;
public class Ex01 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita um número inteiro ao usuário
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }

        scanner.close();
    }
}
