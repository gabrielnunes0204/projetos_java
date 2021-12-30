import java.util.Scanner;
import java.util.Vector;

public class Exercicio_115 {
	public static void main(String[] args) {
		//Escreva um programa que permita a leitura dos nomes de 10 pessoas e armazene os nomes lidos em um vetor.
		//Após isto, o programa deve permitir a leitura de mais 1 nome qualquer de pessoa e depois escrever a mensagem ACHEI,
		//se o nome estiver entre os 10 nomes lidos anteriormente (guardados no vetor), ou NÃO ACHEI caso contrário
		
		Scanner n = new Scanner(System.in);
		Vector vetorNomes = new Vector();
		
		int contador = 1;
		
		while(contador <= 10) {
			System.out.print("Informe o seu nome: ");
			String nome = n.nextLine();
			vetorNomes.add(nome);
			contador++;
		}
		System.out.print("Insira o novo nome: ");
		String novoNome = n.nextLine();
		
		for(int x = 1; x <= 10; x++) {
			if(vetorNomes.contains(novoNome)) {
				System.out.println("ACHEI");
				break;
			} else {
				System.out.println("NÃO ACHEI");
				break;
			}
		}
	}
}
