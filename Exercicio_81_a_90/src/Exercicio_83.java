import java.util.Scanner;

public class Exercicio_83 {
	public static void main(String[] args) {
		//Ler dois valores e imprimir uma das três mensagens a seguir:
		
		Scanner n1 = new Scanner(System.in);
		System.out.print("Informe o 01° valor: ");
		int numero1 = n1.nextInt();
		
		Scanner n2 = new Scanner(System.in);
		System.out.print("Informe o 02° valor: ");
		int numero2 = n2.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("Primeiro é maior");
		} else if(numero2 > numero1) {
			System.out.println("Segundo é maior");
		} else {
			System.out.println("Números iguais");
		}
	}
}
