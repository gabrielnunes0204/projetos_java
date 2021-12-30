import java.util.Scanner;
import java.util.Vector;

public class Exercicio_124 {
	public static void main(String[] args) {
		//Fa�a um programa para ler um vetor de 20 n�meros.
		//Ap�s isto, dever� ser lido mais um n�mero qualquer e verificar se esse n�mero existe no vetor ou n�o.
		//Se existir, o programa deve gerar um novo vetor sem esse n�mero. (Considere que n�o haver� n�meros repetidos no vetor)
	
		Scanner n = new Scanner(System.in);
		Vector vetorNumeros = new Vector();
		
		//int[] listaNumeros = new int[5+1];
		int contador = 1;
		
		while(contador <= 5) {
			System.out.print("Informe o " + contador + "� n�mero: ");
			int numero = n.nextInt();
			vetorNumeros.add(numero);
			
			contador++;
		}
		
		System.out.print("Informe o n�mero a ser comparado: ");
		int novoNumero = n.nextInt();
		
		for(int x = 1; x < 5; x++) {
			if(vetorNumeros.contains(novoNumero)) {
				vetorNumeros.remove(x);
			}
		}
		System.out.println(vetorNumeros);
	}
}
