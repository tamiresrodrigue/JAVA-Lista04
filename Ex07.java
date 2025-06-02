package lita04;
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita um número ao usuário
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número está no intervalo de 10 a 20 (inclusive)
        if (numero >= 10 && numero <= 20) {
            System.out.println("O número " + numero + " está dentro do intervalo de 10 a 20.");
        } else {
            System.out.println("O número " + numero + " está fora do intervalo de 10 a 20.");
        }

        scanner.close();
    }
}
