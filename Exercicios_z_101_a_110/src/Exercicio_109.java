import java.util.Scanner;

public class Exercicio_109 {
	public static void main(String[] args) {
		//Fa�a um programa para ler uma quantidade e a seguir ler esta quantidade de n�meros.
		//Depois de ler todos os n�meros o programa deve apresentar na tela o maior dos n�meros lidos e a m�dia dos n�meros lidos
	
		Scanner q = new Scanner(System.in);
		System.out.print("Informe a quantidade de n�meros para cadastrar: ");
		int qtdNumeros = q.nextInt();
		
		int contador = 1;
		int soma = 0;
		float media = 0;
		
		while(contador <= qtdNumeros) {
			System.out.print("Informe um n�mero: ");
			int numero = q.nextInt();
			soma += numero;
			contador++;
		}
		media = soma / qtdNumeros;
		System.out.println("A soma dos n�meros � " + soma + ", e a m�dia � " + media);
	}
}
