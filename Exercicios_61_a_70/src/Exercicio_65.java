import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_65 {
	public static void main(String[] args) {
		//As ma��s custam R$ 1,30 cada se forem compradas menos de uma d�zia, e R$ 1,00 se forem compradas pelo menos 12.
		//Escreva um programa que leia o n�mero de ma��s compradas, calcule e escreva o custo total da compra
	
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		Scanner m = new Scanner(System.in);
		System.out.print("Informe a quantidade de ma�as compradas: ");
		int qtdMacas = m.nextInt();
		
		float custoTotal = 0;
		
		if(qtdMacas >= 12) {
			 custoTotal = qtdMacas * 1;
		} else {
			custoTotal = qtdMacas * 1.30f;
		}
		
		System.out.println("A quantidade de ma�as compradas � de " + qtdMacas + " e o valor total � de R$ " + formatado.format(custoTotal));
	}
}
