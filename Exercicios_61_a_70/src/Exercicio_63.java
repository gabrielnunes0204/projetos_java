import java.util.Scanner;

public class Exercicio_63 {
	public static void main(String[] args) {
		//Ler um valor e escrever a mensagem: É MAIOR QUE 10, se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10
		
		Scanner n = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int numero = n.nextInt();
		
		if(numero > 10) {
			System.out.println("O número " + numero + " é maior que 10");
		} else if(numero < 10) {
			System.out.println("O número " + numero + " é menor que 10");
		} else {
			System.out.println("O número " + numero + " é igual a 10");
		}
	}
}
