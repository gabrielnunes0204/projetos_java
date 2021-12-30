import java.util.Scanner;
import java.util.Vector;

public class Exercicio_124 {
	public static void main(String[] args) {
		//Faça um programa para ler um vetor de 20 números.
		//Após isto, deverá ser lido mais um número qualquer e verificar se esse número existe no vetor ou não.
		//Se existir, o programa deve gerar um novo vetor sem esse número. (Considere que não haverá números repetidos no vetor)
	
		Scanner n = new Scanner(System.in);
		Vector vetorNumeros = new Vector();
		
		//int[] listaNumeros = new int[5+1];
		int contador = 1;
		
		while(contador <= 5) {
			System.out.print("Informe o " + contador + "° número: ");
			int numero = n.nextInt();
			vetorNumeros.add(numero);
			
			contador++;
		}
		
		System.out.print("Informe o número a ser comparado: ");
		int novoNumero = n.nextInt();
		
		for(int x = 1; x < 5; x++) {
			if(vetorNumeros.contains(novoNumero)) {
				vetorNumeros.remove(x);
			}
		}
		System.out.println(vetorNumeros);
	}
}
