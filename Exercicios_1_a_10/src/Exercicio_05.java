import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_05 {
	public static void main(String args[]) {
		//Faça um algoritmo para uma loja de 1,99. Leia quantos itens foram vendidos. Conceda um desconto de 5% e informe o valor final.
		
		float valorTotal, desconto, valorComDesconto;
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		Scanner itens = new Scanner(System.in);
		System.out.print("Informe a quantidade de itens vendidos: ");
		int itensVendidos = itens.nextInt();
		
		valorTotal = itensVendidos * 1.99f;
		desconto = (valorTotal * 5) / 100;
		valorComDesconto = valorTotal - desconto;
		
		System.out.println("O valor total sem desconto é de: " + formatador.format(valorTotal));
		System.out.println("O valor do produto com 5% de desconto é de: " + formatador.format(valorComDesconto));
	}
}
