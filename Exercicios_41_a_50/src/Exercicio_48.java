import java.util.Scanner;

public class Exercicio_48 {
	public static void main(String[] args) {
		//O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
		//Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, crie uma programa para ler o custo de f�brica de um carro, calcular e escrever
		//o custo final ao consumidor
		
		int porcentagemDistribuidor = 28;
		
		Scanner c = new Scanner(System.in);
		System.out.print("Informe o valor de custo de f�brica do ve�culo R$ ");
		float custoFabrica = c.nextFloat();
		
		
		float valorImposto = (custoFabrica * 45) / 100;
		float valorVeiculo = custoFabrica + porcentagemDistribuidor + valorImposto;

		System.out.println("O valor total do ve�culo com o custo de f�brica e a porcentagem do distribuidor � de R$ " + valorVeiculo);
	}
}
