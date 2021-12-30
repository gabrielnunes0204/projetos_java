import java.util.Scanner;

public class Exercicio_49 {
	public static void main(String[] args) {
		//Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e 
		//mais 5% do valor das vendas por ele efetuadas. Crie um programa que leia o número de carros por ele vendidos, o valor total de suas vendas,
		//o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor
	
		Scanner c = new Scanner(System.in);
		System.out.print("Informe a quantidade de carros vendidos: ");
		int qtdCarrosVendidos = c.nextInt();
		
		Scanner v = new Scanner(System.in);
		System.out.print("Informe o valor total das vendas: ");
		float valorTotalVendas = v.nextFloat();

		Scanner s = new Scanner(System.in);
		System.out.print("Informe o valor do salário fixo dos funcionários: ");
		float salarioFixo = s.nextFloat();
		
		Scanner cf = new Scanner(System.in);
		System.out.print("Informe o valor da comissão fixa por carro vendido: ");
		float comissaoFixa = cf.nextFloat();
		
		float bonificacao = (valorTotalVendas * 5) / 100;
		float valorTotalComissao = comissaoFixa * qtdCarrosVendidos;
		float salarioFinal = (salarioFixo + valorTotalComissao) + bonificacao;

		System.out.println("O salário fixo do funcionário é de R$ " + salarioFixo + ", e o seu salário final é de R$ " + salarioFinal);
	}
}
