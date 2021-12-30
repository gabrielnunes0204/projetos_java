import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_11 {
	public static void main(String args[]) {
		//Sabendo que cada unidade de ferradura custa 9,90, pergunte quantos cavalos precisam de (4) ferraduras.
		//Se o custo total for maior que 100, aplique um desconto de 10%. Depois informe o valor final.
		
		int qtdFerraduras = 4;
		float precoFerradura = 9.90f;
		float valorTotal, desconto, valorComDesconto;
		
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		Scanner c = new Scanner(System.in);
		System.out.print("Informe quantos cavalos precisam de ferraduras: ");
		int qtdCavalos = c.nextInt();
		
		valorTotal = (qtdCavalos * precoFerradura) * qtdFerraduras;
		desconto = (valorTotal * 5) / 100;
		valorComDesconto = valorTotal - desconto;		
		
		if(valorTotal > 100) {
			System.out.println("O valor total das ferraduras sem desconto é de R$ " + formatado.format(valorTotal));
			System.out.println("O valor total das ferraduras com desconto de 5% é de R$ " + formatado.format(valorComDesconto));
		} else {
			System.out.println("O valor total das ferraduras é de R$ " + formatado.format(valorTotal));
		}
	}
}
