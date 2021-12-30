import java.util.Scanner;

public class Exercicio_56 {
	public static void main(String[] args) {
		//A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de queijo, uma fatia de presunto e uma rodela de hambúrguer.
		//Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça um programa em que o dono forneça a quantidade
		//de sanduíches a fazer, e a máquina informe as quantidades (em quilos) de queijo, presunto e carne necessários para compra
	
		Scanner s = new Scanner(System.in);
		System.out.print("Informe a quantidade de sanduíces a fazer: ");
		int qtdSanduiches = s.nextInt();
		
		int queijo = 50;
		int presunto = 50;
		int hamburguer = 100;

		float kiloQueijo = (qtdSanduiches * 2) * queijo;
		float kiloPresunto = (qtdSanduiches * 1) * presunto;
		float kiloHamburguer = (qtdSanduiches * 1) * hamburguer;

		System.out.println("A quantidade de queijo necessária é de " + kiloQueijo + " kg");
		System.out.println("A quantidade de presunto necessária é de " + kiloPresunto + " kg");
		System.out.println("A quantidade de hamburguer necessário é de " + kiloHamburguer + " kg");

	}
}
