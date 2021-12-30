import java.util.Scanner;

public class Exercicio_117 {
	public static void main(String[] args) {
		//Solicitar n�meros para o usu�rio e armazenar em um vetor de 20 posi��es (aceitar somente n�meros positivos).
		//Escrever a seguir o valor do maior elemento e a respectiva posi��o que ele ocupa no vetor
			
		Scanner n = new Scanner(System.in);
		
		int[] listaNumeros = new int [21];
		int contador = 1;
		int maior = 0;
		int posicaoMaior = 0;
		
		while(contador <= 20) {
			System.out.print("Informe o " + contador + "� valor: ");
			int numero = n.nextInt();
			
			if(numero < 0) {
				System.out.println("Valor inv�lido. S� ser�o aceitamos n�meros positivos");
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
		System.out.println("O maior valor do array � o " + maior + " e o �ndice do maior valor � o " + posicaoMaior);
	}
}
