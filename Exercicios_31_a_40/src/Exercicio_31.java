import java.util.Scanner;

public class Exercicio_31 {
	public static void main(String args[]) {
		//Crie um programa para que apresente seu nome, seu celular e sua cidade
		
		Scanner n = new Scanner(System.in);
		System.out.print("Informe o seu nome: ");
		String nome = n .nextLine();
		
		Scanner tel = new Scanner(System.in);
		System.out.print("Informe o seu número de celular: ");
		String celular = tel .nextLine();
		
		Scanner c = new Scanner(System.in);
		System.out.print("Informe o nome da sua cidade: ");
		String cidade = c .nextLine();
		
		System.out.println("Olá " + nome + ", o seu telefone/celular é o " + celular + " e você é da cidade de " + cidade);
	}
}
