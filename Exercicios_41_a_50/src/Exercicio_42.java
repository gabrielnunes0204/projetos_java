import java.util.Scanner;

public class Exercicio_42 {
	public static void main(String[] args) {
		//Crie um programa para ler um valor (do teclado) e escrever (na tela) o seu antecessor
		
		Scanner n = new Scanner(System.in);
		System.out.print("Informe um n�mero: ");
		int numero = n.nextInt();
		
		System.out.println("O antecessor do n�mero " + numero + " � " + (numero-1));
	}		
}
