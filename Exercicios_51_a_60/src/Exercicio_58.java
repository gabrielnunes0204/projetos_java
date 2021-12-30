import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_58 {
	public static void main(String[] args) {
		//A granja Frangotech possui um controle automatizado de cada frango da sua produção. No pé direito do frango há
		//um anel com um chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir.
		//Sabendo que o anel com chip custa R$4,00 e o anel de alimento custa R$3,50, faça um programa para calcular o gasto total da granja para marcar
		//todos os seus frangos.
		
		DecimalFormat formatado = new DecimalFormat("0.00");

		Scanner v = new Scanner(System.in);
		System.out.print("Informe a quantidade de galinhas na granja: ");
		int qtdGalinhas = v.nextInt();
		
		float chipIdentidade = 4.40f;
		float chipAlimento = 3.50f;
		
		float valorGalinha = (chipAlimento + chipAlimento) + chipIdentidade;
		
		float valorTotalGranja = qtdGalinhas * valorGalinha;
				
		System.out.println("O valor total gasto pela granja é de R$ " + formatado.format(valorTotalGranja));
	}
}
