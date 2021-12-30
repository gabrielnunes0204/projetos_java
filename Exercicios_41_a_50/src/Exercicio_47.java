import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_47 {
	public static void main(String[] args) {
		//Crie um programa para converter uma quantidade de d�lar para real;
		// � O usu�rio deve informar o valor em d�lar;
		// � O programa deve converter esse valor em reais, exibindo a mensagem com o valor convertido;
		// � D�LAR: R$ 6.61
		
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		Scanner d = new Scanner(System.in);
		System.out.print("Informe a quantidade de d�lares: ");
		float dolar = d.nextFloat();
		
		float real = dolar * 5.61f;
		
		System.out.println("O valor em d�lar � de " + dolar + " e convertido para reais fica R$ " + formatado.format(real));
	}
}
