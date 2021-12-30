import java.util.Scanner;

public class Exercicio_74 {
	public static void main(String[] args) {
		//Fa�a um programa para ler: quantidade atual em estoque, quantidade m�xima em estoque e quantidade m�nima
		//em estoque de um produto. Calcular e escrever a quantidade m�dia ((quantidade m�dia = quantidade m�xima + quantidade m�nima)/2).
		//Se a quantidade em estoque for maior ou igual a quantidade m�dia escrever a mensagem 'N�o efetuar compra',
		//sen�o escrever a mensagem 'Efetuar compra'
	
		Scanner qa = new Scanner(System.in);
		System.out.print("Informe a quantidade em estoque: ");
		float qtdAtual = qa.nextFloat();
		
		Scanner qx = new Scanner(System.in);
		System.out.print("Informe a quantidade m�ximo em estoque: ");
		float qtdMaxima = qx.nextFloat();
		
		Scanner qm = new Scanner(System.in);
		System.out.print("Informe a quantidade minima em estoque: ");
		float qtdMinima = qm.nextFloat();
		
		float qtdMedia = (qtdMaxima + qtdMinima) / 2;
		
		if(qtdAtual >= qtdMedia) {
			System.out.println("N�o efetuar compra");
		} else {
			System.out.println("Efetuar compra");
		}
	}
}
