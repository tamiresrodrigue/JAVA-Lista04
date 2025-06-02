package lita04;
import java.util,Scanner;
public class Ex08 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        if (numero % 3 == 0 && numero % 5 == 0) {
	            System.out.println("O número " + numero + " é divisível por 3 e por 5.");
	        } else {
	            System.out.println("O número " + numero + " não é divisível por 3 e por 5.");
	        }

	        scanner.close();
	    }
}
