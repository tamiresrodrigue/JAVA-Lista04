package lita04;
import java.util.Scanner;
public class Ex10 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o comprimento do lado 1: ");
	        double a = scanner.nextDouble();

	        System.out.print("Digite o comprimento do lado 2: ");
	        double b = scanner.nextDouble();

	        System.out.print("Digite o comprimento do lado 3: ");
	        double c = scanner.nextDouble();
	        if (a + b > c && a + c > b && b + c > a) {
	            System.out.println("Os lados formam um triângulo válido.");
	        } else {
	            System.out.println("Os lados NÃO formam um triângulo válido.");
	        }

	        scanner.close();
	    }
}
