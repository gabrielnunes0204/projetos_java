import java.util.Scanner;

public class Exercicio_88 {
	public static void main(String[] args) {
		//Faça um programa para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. Calcular
		//e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que
		// Se quantidade <= 5 o desconto será de 2%
		// Se quantidade > 5 e quantidade <=10 o desconto será de 3%
		// Se quantidade > 10 o desconto será de 5%
		
		Scanner n = new Scanner(System.in);
		System.out.print("Informe o nome do produto: ");
		String nomeProduto = n.nextLine();
		
		Scanner q = new Scanner(System.in);
		System.out.print("Informe a quantidade adquirida: ");
		int qtdAdquirida = q.nextInt();
		
		Scanner p = new Scanner(System.in);
		System.out.print("Informe o preço unitário do produto: ");
		float precoUnitario = p.nextFloat();
		
		float valorTotal = precoUnitario * qtdAdquirida;
		float desconto = (valorTotal * 10) / 100;
		
		System.out.println("O valor do produto " + nomeProduto + " sem desconto é de R$ " + valorTotal + " e com desconto é de R$ " + (valorTotal-desconto));
	}
}
