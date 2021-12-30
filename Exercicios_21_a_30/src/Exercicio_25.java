import java.util.Scanner;

public class Exercicio_25 {
	public static void main(String[] args) {
		//Leia o nome da pessoa e imprima ele 15 vezes na tela.
		
		Scanner n = new Scanner(System.in);
		System.out.print("Informe o seu nome: ");
		String nome = n.nextLine();
		
		int contador = 1;
		while(contador <= 15) {
			System.out.println(contador + " - " + nome);
			contador++;
		}
		
	}
}
