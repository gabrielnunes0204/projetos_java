import java.util.Scanner;

public class Exercicio_64 {
	public static void main(String[] args) {
		//Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).
	
		Scanner n = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int numero = n.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O número " + numero + " é PAR");
		} else {
			System.out.println("O número " + numero + " é ÍMPAR");
		}
	}
}
