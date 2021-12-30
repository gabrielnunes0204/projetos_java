import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_22 {
	public static void main(String[] args) {
		//Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento.
		
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		Scanner v = new Scanner(System.in);
		System.out.print("Informe o valor do produto R$ ");
		float valorProduto = v.nextFloat();
		
		Scanner f = new Scanner(System.in);
		System.out.println("Informe a forma de pagamento (1...4):"
				+ "\n 1 - À vista em dinheiro ou cheque"
				+ "\n 2 - À vista no cartão de crédito"
				+ "\n 3 - Em duas vezes no cartão"
				+ "\n 4 - Em seis vezes");
		float formaPagamento = f.nextFloat();
		
		float primeiroDesconto = (valorProduto * 15) / 100;
		float segundoDesconto = (valorProduto * 5) / 100;
		float terceiroDesconto = (valorProduto * 10) / 100;
		
		if(formaPagamento == 1) {
			System.out.println("O valor do produto é R$ " + formatado.format(valorProduto) + ", e com o desconto fica R$ " + (valorProduto-primeiroDesconto));
		} else if (formaPagamento == 2) {
			System.out.println("O valor do produto é R$ " + formatado.format(valorProduto) + ", e com o desconto fica R$ " + (valorProduto-segundoDesconto));
		} else if (formaPagamento == 3) {
			System.out.println("O valor do produto é R$ " + formatado.format(valorProduto));
		} else if (formaPagamento == 4) {
			System.out.println("O valor do produto é R$ " + formatado.format(valorProduto) + ", e com o desconto fica R$ " + (valorProduto-terceiroDesconto));
		} else {
			System.out.println("Forma de pagamento inválida");
		}
	}
}
