import java.util.Scanner;

public class Exercicio_119 {
	public static void main(String[] args) {
		//Ler um vetor A de 10 n�meros. Ap�s, ler mais um n�mero e guardar em uma vari�vel X.
		//Armazenar em um vetor M o resultado de cada elemento de A multiplicado pelo valor X. Logo ap�s, imprimir o vetor M
	
		Scanner n = new Scanner(System.in);
		
		int[] vetorNumeros = new int [11];
		int[] vetorMulti = new int [11];
		
		int contador = 1;
		int multi = 1;
		
		while(contador <= 10) {
			System.out.print("Informe o " + contador + "� n�mero: ");
			int numero = n.nextInt();
			vetorNumeros[contador] = numero;
			
			contador++;
		}
		System.out.print("Informe um novo n�mero: ");
		int novoNumero = n.nextInt();
		
		for(int x = 1; x < vetorNumeros.length; x++) {
			multi = vetorNumeros[x] * novoNumero;
			vetorMulti[x] = multi;
		}
		
		for(int y = 1; y < vetorMulti.length; y++) {
			System.out.println("O resultado da multiplica��o � de: " + vetorMulti[y]);
		}
	}
}
