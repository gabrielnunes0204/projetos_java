import java.util.Scanner;

public class Exercicio_28 {
	public static void main(String[] args) {
		//Leia o nome da pessoa. Caso ela deixe em branco solicite para digitar novamente.
		
		String nome = "";
		
		while(nome == "") {
			System.out.println("Por gentileza, informe o seu nome");
			Scanner n = new Scanner(System.in);
			System.out.print("Informe o seu nome: ");
			nome = n.nextLine();
		}
		System.out.println("APLICAÇÃO ENCERRADA");
	}
}
