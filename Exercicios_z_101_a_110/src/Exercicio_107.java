import java.util.Scanner;

public class Exercicio_107 {
	public static void main(String[] args) {
		//Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um programa que permita a entrada das seguintes informações:
		// a) o número total de mercadorias no estoque;
		// b) o valor de cada mercadoria.
		//Ao final imprimir o valor total em estoque e a média de valor das mercadorias.
		
		Scanner nm = new Scanner(System.in);
		System.out.print("Informe o número total de mercadorias no estoque: ");
		int numeroMercadorias = nm.nextInt();
		
		Scanner qm = new Scanner(System.in);
		System.out.print("Informe o valor unitário da mercadoria: ");
		int qtdMercadoria = qm.nextInt();
		
		float valorEstoque = numeroMercadorias * qtdMercadoria;
		float mediaEstoque = numeroMercadorias / qtdMercadoria;
		
		System.out.println("O valor dos produtos em estoque é de R$ " + valorEstoque + " e a média de produtos é de R$ " + mediaEstoque);
	}
}
