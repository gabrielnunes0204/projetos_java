import java.util.Scanner;
import java.lang.Math;

public class Exercicio_40 {
	public static void main(String[] args) {
		//Crie um programa que receba dois valores do usuário e exiba o resultado de sua exponenciação
		
		Scanner n1 = new Scanner(System.in);
		System.out.print("Informe o 01° valor: ");
		int numero1 = n1.nextInt();
		
		Scanner n2 = new Scanner(System.in);
		System.out.print("Informe o 02° valor: ");
		int numero2 = n2.nextInt();
		
		System.out.println("A exponenciação de " + numero1 + " ^ " + numero2 + " é igual a " + Math.pow(numero1, numero2));
	}
}
