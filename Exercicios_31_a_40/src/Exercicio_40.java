import java.util.Scanner;
import java.lang.Math;

public class Exercicio_40 {
	public static void main(String[] args) {
		//Crie um programa que receba dois valores do usu�rio e exiba o resultado de sua exponencia��o
		
		Scanner n1 = new Scanner(System.in);
		System.out.print("Informe o 01� valor: ");
		int numero1 = n1.nextInt();
		
		Scanner n2 = new Scanner(System.in);
		System.out.print("Informe o 02� valor: ");
		int numero2 = n2.nextInt();
		
		System.out.println("A exponencia��o de " + numero1 + " ^ " + numero2 + " � igual a " + Math.pow(numero1, numero2));
	}
}
