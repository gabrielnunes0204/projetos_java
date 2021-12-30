import java.util.Scanner;

public class Exercicio_91 {
	public static void main(String[] args) {
		//Escreva um programa para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja
		//para o segundo valor não pode ser aceito o valor zero e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.
	
		Scanner n1 = new Scanner(System.in);
		System.out.print("Informe o 01° valor: ");
		int numero1 = n1.nextInt();
		
		Scanner n2 = new Scanner(System.in);
		System.out.print("Informe o 02° valor: ");
		int numero2 = n2.nextInt();
		
		while(numero2 == 0) {
			System.out.print("Informe o 02° valor: ");
			numero2 = n2.nextInt();
		}
		int divisao = numero1 / numero2;
		System.out.println("A divisão de " + numero1 + " com " + numero2 + " é de " + divisao);
	}
}
