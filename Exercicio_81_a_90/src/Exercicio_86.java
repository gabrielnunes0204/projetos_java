import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_86 {
	public static void main(String[] args) {
		//Uma fruteira está vendendo frutas com a seguinte tabela de preços
		
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		Scanner kmo = new Scanner(System.in);
		System.out.print("Informe quantos kg de morango comprou: ");
		float kgMorango = kmo.nextFloat();
		
		Scanner kma = new Scanner(System.in);
		System.out.print("Informe quantos kg de maça comprou: ");
		float kgMaca = kma.nextFloat();
		
		float valorMorango = kgMorango * 2.50f;
		float valorMaca = kgMaca * 1.80f;
		float desconto = 0;
		float valorTotal = 0;
		
		if((kgMorango+kgMaca) > 8 || (valorMorango+valorMaca) > 25) {
			valorMorango = kgMorango * 2.20f;
			valorMaca = kgMaca * 1.50f;
			valorTotal = valorMorango + valorMaca;
			desconto = (valorTotal * 10) / 100;
			System.out.println("O valor total sem desconto é de R$ " + valorTotal + " e com o desconto fica R$ " + formatado.format(valorTotal-desconto));
		} else {
			valorTotal = valorMorango + valorMaca;
			desconto = (valorTotal * 10) / 100;
			System.out.println("O valor total sem desconto é de R$ " + valorTotal + " e com o desconto fica R$ " + formatado.format(valorTotal-desconto));
		}
	}
}
