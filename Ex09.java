package lita04;
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita uma letra ao usuário
        System.out.print("Digite uma letra: ");
        String input = scanner.nextLine();

        // Verifica se foi digitado exatamente uma letra
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Entrada inválida! Por favor, digite apenas uma letra.");
        } else {
            char letra = Character.toLowerCase(input.charAt(0));

            // Verifica se é vogal ou consoante
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("A letra '" + letra + "' é uma vogal.");
            } else {
                System.out.println("A letra '" + letra + "' é uma consoante.");
            }
        }

        scanner.close();
    }
}
