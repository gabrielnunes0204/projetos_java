import java.util.Scanner;

public class Exercicio_74 {
	public static void main(String[] args) {
		//Faça um programa para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima
		//em estoque de um produto. Calcular e escrever a quantidade média ((quantidade média = quantidade máxima + quantidade mínima)/2).
		//Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra',
		//senão escrever a mensagem 'Efetuar compra'
	
		Scanner qa = new Scanner(System.in);
		System.out.print("Informe a quantidade em estoque: ");
		float qtdAtual = qa.nextFloat();
		
		Scanner qx = new Scanner(System.in);
		System.out.print("Informe a quantidade máximo em estoque: ");
		float qtdMaxima = qx.nextFloat();
		
		Scanner qm = new Scanner(System.in);
		System.out.print("Informe a quantidade minima em estoque: ");
		float qtdMinima = qm.nextFloat();
		
		float qtdMedia = (qtdMaxima + qtdMinima) / 2;
		
		if(qtdAtual >= qtdMedia) {
			System.out.println("Não efetuar compra");
		} else {
			System.out.println("Efetuar compra");
		}
	}
}
