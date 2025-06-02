package lita04;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o ano ao usuário
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        // Verifica se é bissexto
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        scanner.close();
    }
}

