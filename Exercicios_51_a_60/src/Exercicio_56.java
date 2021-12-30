import java.util.Scanner;

public class Exercicio_56 {
	public static void main(String[] args) {
		//A lanchonete Gostosura vende apenas um tipo de sandu�che, cujo recheio inclui duas fatias de queijo, uma fatia de presunto e uma rodela de hamb�rguer.
		//Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, e que a rodela de hamb�rguer pesa 100 gramas, fa�a um programa em que o dono forne�a a quantidade
		//de sandu�ches a fazer, e a m�quina informe as quantidades (em quilos) de queijo, presunto e carne necess�rios para compra
	
		Scanner s = new Scanner(System.in);
		System.out.print("Informe a quantidade de sandu�ces a fazer: ");
		int qtdSanduiches = s.nextInt();
		
		int queijo = 50;
		int presunto = 50;
		int hamburguer = 100;

		float kiloQueijo = (qtdSanduiches * 2) * queijo;
		float kiloPresunto = (qtdSanduiches * 1) * presunto;
		float kiloHamburguer = (qtdSanduiches * 1) * hamburguer;

		System.out.println("A quantidade de queijo necess�ria � de " + kiloQueijo + " kg");
		System.out.println("A quantidade de presunto necess�ria � de " + kiloPresunto + " kg");
		System.out.println("A quantidade de hamburguer necess�rio � de " + kiloHamburguer + " kg");

	}
}
