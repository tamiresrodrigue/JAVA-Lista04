package lita04;
import java.util.Scanner;
public class Ex03 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        System.out.print("Digite a nota (0 a 100): ");
        int nota = scanner.nextInt();
        if (nota < 0 || nota > 100) {
            System.out.println("Nota inválida! Digite um valor entre 0 e 100.");
        } else {
            if (nota >= 60) {
                System.out.println("Aluno aprovado!");
            } else {
                System.out.println("Aluno reprovado.");
            }
        }

        scanner.close();
    }
}

