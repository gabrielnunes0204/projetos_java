import java.util.Scanner;

public class Exercicio_117 {
	public static void main(String[] args) {
		//Solicitar números para o usuário e armazenar em um vetor de 20 posições (aceitar somente números positivos).
		//Escrever a seguir o valor do maior elemento e a respectiva posição que ele ocupa no vetor
			
		Scanner n = new Scanner(System.in);
		
		int[] listaNumeros = new int [21];
		int contador = 1;
		int maior = 0;
		int posicaoMaior = 0;
		
		while(contador <= 20) {
			System.out.print("Informe o " + contador + "° valor: ");
			int numero = n.nextInt();
			
			if(numero < 0) {
				System.out.println("Valor inválido. Só serão aceitamos números positivos");
			} else {
				listaNumeros[contador] = numero;
			}
			contador++;
		}
		for(int x = 1; x < listaNumeros.length; x++) {
			if(listaNumeros[x] > maior) {
				maior = listaNumeros[x];
				posicaoMaior = x;
			}
		}
		System.out.println("O maior valor do array é o " + maior + " e o índice do maior valor é o " + posicaoMaior);
	}
}
