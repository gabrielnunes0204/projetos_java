import java.util.Scanner;
//import java.util.Vector;

public class Exercicio_120 {
	public static void main(String[] args) {
		//Fa�a um programa para ler 20 n�meros e armazenar em um vetor.
		//Ap�s a leitura total dos 20 n�meros, o programa deve escrever esses 20 n�meros lidos na ordem inversa
		
		Scanner n = new Scanner(System.in);
		//Vector vetorNumeros = new Vector();
		
		int[] vetorNumeros = new int[6];
		
		int contador = 1;
		
		while(contador <= 5) {
			System.out.print("Informe o " + contador + "� valor: ");
			int valor = n.nextInt();
			vetorNumeros[contador] = valor;
			//vetorNumeros.add(valor);
			contador++;
		}
		
		for(int x = 5; x >= 1; x--) {
			System.out.println("Reverso: " + vetorNumeros[x]);			
		}
	}
}
