import java.util.Scanner;

public class Exercicio_109 {
	public static void main(String[] args) {
		//Faça um programa para ler uma quantidade e a seguir ler esta quantidade de números.
		//Depois de ler todos os números o programa deve apresentar na tela o maior dos números lidos e a média dos números lidos
	
		Scanner q = new Scanner(System.in);
		System.out.print("Informe a quantidade de números para cadastrar: ");
		int qtdNumeros = q.nextInt();
		
		int contador = 1;
		int soma = 0;
		float media = 0;
		
		while(contador <= qtdNumeros) {
			System.out.print("Informe um número: ");
			int numero = q.nextInt();
			soma += numero;
			contador++;
		}
		media = soma / qtdNumeros;
		System.out.println("A soma dos números é " + soma + ", e a média é " + media);
	}
}
