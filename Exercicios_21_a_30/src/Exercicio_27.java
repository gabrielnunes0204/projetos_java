import java.util.Scanner;

public class Exercicio_27 {
	public static void main(String[] args) {
		//Leia dois números, calcule e informe a soma. Pergunte se deseja calcular novamente.

		String verificador = "s";

		while(verificador.equals("s") || verificador.equals("S")) {
			Scanner n1 = new Scanner(System.in);
			System.out.print("Informe o 01° valor: ");
			int numero1 = n1.nextInt();
			
			Scanner n2 = new Scanner(System.in);
			System.out.print("Informe o 02° valor: ");
			int numero2 = n2.nextInt();
			
			int soma = numero1 + numero2;
			System.out.println("A soma de " + numero1 + " + " + numero2 + " é de " + (soma));
			
			Scanner v = new Scanner(System.in);
			System.out.print("Deseja continuar? (S / N): ");
			verificador = v.nextLine();
		}
		System.out.println("APLICAÇÃO ENCERRADA");
	}
}
