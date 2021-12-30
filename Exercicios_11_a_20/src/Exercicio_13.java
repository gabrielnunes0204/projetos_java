import java.util.Scanner;

public class Exercicio_13 {
	public static void main(String[] args) {
		//Leia três valores (A, B e C). Informe se A+B é maior do que C.
		
		Scanner n1 = new Scanner(System.in);
		System.out.print("Informe o 01° valor: ");
		int primeiroValor = n1.nextInt();
		
		Scanner n2 = new Scanner(System.in);
		System.out.print("Informe o 02° valor: ");
		int segundoValor = n2.nextInt();
		
		Scanner n3 = new Scanner(System.in);
		System.out.print("Informe o 03° valor: ");
		int terceiroValor = n3.nextInt();
		
		int soma = primeiroValor + segundoValor;
		
		if(soma > terceiroValor) {
			System.out.println("A soma de " + primeiroValor + " com " + segundoValor + " é maior que " + terceiroValor);
		} else {
			System.out.println("A soma de " + primeiroValor + " com " + segundoValor + " não é maior que " + terceiroValor);
		}
	}
}
