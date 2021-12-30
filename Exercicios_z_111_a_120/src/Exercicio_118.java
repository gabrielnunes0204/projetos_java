import java.util.Scanner;

public class Exercicio_118 {
	public static void main(String[] args) {
		//Solicitar n�meros para o usu�rio e armazenar em um vetor de 20 posi��es (aceitar somente n�meros positivos).
		//Escrever a seguir o valor do menor elemento e a respectiva posi��o que ele ocupa no vetor
			
		Scanner n = new Scanner(System.in);
		
		int[] listaNumeros = new int [21];
		int contador = 1;
		int menor = 0;
		int posicaoMenor = 0;
		
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
			if(listaNumeros[x] <= listaNumeros[1]) {
				menor = listaNumeros[x];
				posicaoMenor = x;
			}
		}
		System.out.println("O menor valor do array � o " + menor + " e o �ndice do menor valor � o " + posicaoMenor);
	}
}
