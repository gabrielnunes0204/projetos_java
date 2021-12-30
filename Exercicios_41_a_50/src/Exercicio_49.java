import java.util.Scanner;

public class Exercicio_49 {
	public static void main(String[] args) {
		//Uma revendedora de carros usados paga a seus funcion�rios vendedores um sal�rio fixo por m�s, mais uma comiss�o tamb�m fixa para cada carro vendido e 
		//mais 5% do valor das vendas por ele efetuadas. Crie um programa que leia o n�mero de carros por ele vendidos, o valor total de suas vendas,
		//o sal�rio fixo e o valor que ele recebe por carro vendido. Calcule e escreva o sal�rio final do vendedor
	
		Scanner c = new Scanner(System.in);
		System.out.print("Informe a quantidade de carros vendidos: ");
		int qtdCarrosVendidos = c.nextInt();
		
		Scanner v = new Scanner(System.in);
		System.out.print("Informe o valor total das vendas: ");
		float valorTotalVendas = v.nextFloat();

		Scanner s = new Scanner(System.in);
		System.out.print("Informe o valor do sal�rio fixo dos funcion�rios: ");
		float salarioFixo = s.nextFloat();
		
		Scanner cf = new Scanner(System.in);
		System.out.print("Informe o valor da comiss�o fixa por carro vendido: ");
		float comissaoFixa = cf.nextFloat();
		
		float bonificacao = (valorTotalVendas * 5) / 100;
		float valorTotalComissao = comissaoFixa * qtdCarrosVendidos;
		float salarioFinal = (salarioFixo + valorTotalComissao) + bonificacao;

		System.out.println("O sal�rio fixo do funcion�rio � de R$ " + salarioFixo + ", e o seu sal�rio final � de R$ " + salarioFinal);
	}
}
