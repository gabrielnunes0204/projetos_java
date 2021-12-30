import java.util.Scanner;

public class Exercicio_48 {
	public static void main(String[] args) {
		//O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		//Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, crie uma programa para ler o custo de fábrica de um carro, calcular e escrever
		//o custo final ao consumidor
		
		int porcentagemDistribuidor = 28;
		
		Scanner c = new Scanner(System.in);
		System.out.print("Informe o valor de custo de fábrica do veículo R$ ");
		float custoFabrica = c.nextFloat();
		
		
		float valorImposto = (custoFabrica * 45) / 100;
		float valorVeiculo = custoFabrica + porcentagemDistribuidor + valorImposto;

		System.out.println("O valor total do veículo com o custo de fábrica e a porcentagem do distribuidor é de R$ " + valorVeiculo);
	}
}
