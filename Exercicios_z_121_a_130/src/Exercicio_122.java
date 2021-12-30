import java.util.Scanner;

public class Exercicio_122 {
	public static void main(String[] args) {
		//Fa�a um programa para ler 10 n�meros e armazenar em um vetor. Ap�s isto, o programa deve ordenar os n�meros no vetor em ordem crescente.
		//Escrever o vetor ordenado.
	
		Scanner n = new Scanner(System.in);
		int[] vetorNumeros = new int[10+1];
		
		int contador = 1;
		int aux;
		
		while(contador <= 10) {
			System.out.print("Informe o " + contador + "� n�mero: ");
			int numero = n.nextInt();
			vetorNumeros[contador] = numero;
			
			contador++;
		}
		
		for(int x = 1; x < 10; x++) {
			for(int y = x + 1; y < vetorNumeros.length; y++) {
				
				if(vetorNumeros[x] > vetorNumeros[y]) {
				aux = vetorNumeros[x];
				vetorNumeros[x] = vetorNumeros[y];
				vetorNumeros[y] = aux;
				}
			}
			System.out.print(" " + vetorNumeros[x]);
		}
	}
}
