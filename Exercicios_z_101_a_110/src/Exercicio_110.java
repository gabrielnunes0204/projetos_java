import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_110 {
	public static void main(String[] args) {
		//Fa�a um programa para ler o c�digo e o pre�o de 5 produtos, calcular e escrever:
		//	- O maior pre�o lido
		//	- A m�dia aritm�tica dos pre�os dos produtos

		DecimalFormat formatado = new DecimalFormat("0.00");
		
		Scanner n = new Scanner(System.in);
		System.out.print("Informe o c�digo do produto: ");
		int codigo = n.nextInt();
		
		int contador = 1;
		float maior = 0;
		float media = 0;
		float soma = 0;
		
		while(contador <= 5) {
			System.out.print("Informe o pre�o do produto: ");
			float valorProduto = n.nextFloat();
			
			soma += valorProduto;
			
			if(valorProduto > maior) {
				maior = valorProduto;
			}
			contador++;
		}
		media = soma / 5;
		System.out.println("O maior valor � o R$ " + maior + " e a m�dia dos valores � de R$ " + formatado.format(media));
	}
}
