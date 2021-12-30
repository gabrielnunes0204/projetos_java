import java.util.Scanner;

public class Exercicio_02 {
	public static void main(String args[]) {
		//Sabendo que cada cavalo precisa de 4 ferraduras e que cada unidade custa 9,90, pergunte quantos cavalos
		//precisam de ferraduras. Depois calcule e informe o valor final
		
		int qtdFerraduras = 4;
		float precoFerradura = 9.90f;
		float valorTotal;
		
		Scanner c = new Scanner(System.in);
		System.out.print("Informe quantos cavalos precisam de ferraduras: ");
		int qtdCavalos = c.nextInt();
		
		valorTotal = (qtdCavalos * precoFerradura) * qtdFerraduras;
		
		System.out.println("O valor total das ferraduras é de R$ " + valorTotal);
	}
}
