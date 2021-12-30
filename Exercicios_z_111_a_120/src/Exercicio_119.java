import java.util.Scanner;

public class Exercicio_119 {
	public static void main(String[] args) {
		//Ler um vetor A de 10 números. Após, ler mais um número e guardar em uma variável X.
		//Armazenar em um vetor M o resultado de cada elemento de A multiplicado pelo valor X. Logo após, imprimir o vetor M
	
		Scanner n = new Scanner(System.in);
		
		int[] vetorNumeros = new int [11];
		int[] vetorMulti = new int [11];
		
		int contador = 1;
		int multi = 1;
		
		while(contador <= 10) {
			System.out.print("Informe o " + contador + "° número: ");
			int numero = n.nextInt();
			vetorNumeros[contador] = numero;
			
			contador++;
		}
		System.out.print("Informe um novo número: ");
		int novoNumero = n.nextInt();
		
		for(int x = 1; x < vetorNumeros.length; x++) {
			multi = vetorNumeros[x] * novoNumero;
			vetorMulti[x] = multi;
		}
		
		for(int y = 1; y < vetorMulti.length; y++) {
			System.out.println("O resultado da multiplicação é de: " + vetorMulti[y]);
		}
	}
}
