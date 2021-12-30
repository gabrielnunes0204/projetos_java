import java.util.Scanner;

public class Exercicio_123 {
	public static void main(String[] args) {
		//O mesmo contexto do exercício anterior, mas depois de ordenar os elementos do vetor em ordem crescente,
		//deve ser lido mais um número qualquer e inserir esse novo número na posição correta, ou seja, mantendo a ordem crescente do vetor
		
		//REVISAR - NÃO CONSEGUI FAZER ESSE
	
		Scanner n = new Scanner(System.in);
		int[] vetorNumeros = new int[10+1];
		
		int contador = 1;
		int aux;
		
		while(contador <= 10) {
			System.out.print("Informe o " + contador + "° número: ");
			int numero = n.nextInt();
			vetorNumeros[contador] = numero;
			
			contador++;
		}
		
		System.out.print("Informe o novo número do vetor: ");
		int novoNumero = n.nextInt();
		
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
