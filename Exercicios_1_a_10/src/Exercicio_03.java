import java.util.Scanner;

public class Exercicio_03 {
	public static void main(String args[]) {
		//Leia dois valores (A e B) e informe a soma
		
		int soma;
		
		Scanner valor = new Scanner(System.in);
		
		System.out.print("Informe o 01° valor: ");
		int primeiroValor = valor.nextInt();
		
		System.out.print("Informe o 02° valor: ");
		int segundoValor = valor.nextInt();
		
		soma = primeiroValor + segundoValor;
		
		System.out.println("A soma de " + primeiroValor + " com " + segundoValor + " é de " + soma);
	}
}
