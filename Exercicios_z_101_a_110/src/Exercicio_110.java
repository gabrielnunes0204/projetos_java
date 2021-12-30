import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_110 {
	public static void main(String[] args) {
		//Faça um programa para ler o código e o preço de 5 produtos, calcular e escrever:
		//	- O maior preço lido
		//	- A média aritmética dos preços dos produtos

		DecimalFormat formatado = new DecimalFormat("0.00");
		
		Scanner n = new Scanner(System.in);
		System.out.print("Informe o código do produto: ");
		int codigo = n.nextInt();
		
		int contador = 1;
		float maior = 0;
		float media = 0;
		float soma = 0;
		
		while(contador <= 5) {
			System.out.print("Informe o preço do produto: ");
			float valorProduto = n.nextFloat();
			
			soma += valorProduto;
			
			if(valorProduto > maior) {
				maior = valorProduto;
			}
			contador++;
		}
		media = soma / 5;
		System.out.println("O maior valor é o R$ " + maior + " e a média dos valores é de R$ " + formatado.format(media));
	}
}
