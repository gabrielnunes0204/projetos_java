import java.util.Scanner;

public class Exercicio_39 {
	public static void main(String[] args) {
		//Crie um programa que receba dois valores do usuário e exiba o resultado de sua divisão
		
		Scanner n1 = new Scanner(System.in);
		System.out.print("Informe o 01° valor: ");
		int numero1 = n1.nextInt();
		
		Scanner n2 = new Scanner(System.in);
		System.out.print("Informe o 02° valor: ");
		int numero2 = n2.nextInt();
		
		int divi = numero1 / numero2;
		
		System.out.println("A divisão de " + numero1 + " / " + numero2 + " é igual a " + divi);
	}
}
