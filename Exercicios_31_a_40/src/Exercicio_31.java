import java.util.Scanner;

public class Exercicio_31 {
	public static void main(String args[]) {
		//Crie um programa para que apresente seu nome, seu celular e sua cidade
		
		Scanner n = new Scanner(System.in);
		System.out.print("Informe o seu nome: ");
		String nome = n .nextLine();
		
		Scanner tel = new Scanner(System.in);
		System.out.print("Informe o seu n�mero de celular: ");
		String celular = tel .nextLine();
		
		Scanner c = new Scanner(System.in);
		System.out.print("Informe o nome da sua cidade: ");
		String cidade = c .nextLine();
		
		System.out.println("Ol� " + nome + ", o seu telefone/celular � o " + celular + " e voc� � da cidade de " + cidade);
	}
}
