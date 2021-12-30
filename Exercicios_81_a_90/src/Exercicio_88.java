import java.util.Scanner;

public class Exercicio_88 {
	public static void main(String[] args) {
		//Fa�a um programa para ler: a descri��o do produto (nome), a quantidade adquirida e o pre�o unit�rio. Calcular
		//e escrever o total (total = quantidade adquirida * pre�o unit�rio), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que
		// Se quantidade <= 5 o desconto ser� de 2%
		// Se quantidade > 5 e quantidade <=10 o desconto ser� de 3%
		// Se quantidade > 10 o desconto ser� de 5%
		
		Scanner n = new Scanner(System.in);
		System.out.print("Informe o nome do produto: ");
		String nomeProduto = n.nextLine();
		
		Scanner q = new Scanner(System.in);
		System.out.print("Informe a quantidade adquirida: ");
		int qtdAdquirida = q.nextInt();
		
		Scanner p = new Scanner(System.in);
		System.out.print("Informe o pre�o unit�rio do produto: ");
		float precoUnitario = p.nextFloat();
		
		float valorTotal = precoUnitario * qtdAdquirida;
		float desconto = (valorTotal * 10) / 100;
		
		System.out.println("O valor do produto " + nomeProduto + " sem desconto � de R$ " + valorTotal + " e com desconto � de R$ " + (valorTotal-desconto));
	}
}
