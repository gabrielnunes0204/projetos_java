import java.util.Scanner;

public class Exercicio_123 {
	public static void main(String[] args) {
		//O mesmo contexto do exerc�cio anterior, mas depois de ordenar os elementos do vetor em ordem crescente,
		//deve ser lido mais um n�mero qualquer e inserir esse novo n�mero na posi��o correta, ou seja, mantendo a ordem crescente do vetor
		
		//REVISAR - N�O CONSEGUI FAZER ESSE
	
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
		
		System.out.print("Informe o novo n�mero do vetor: ");
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
