import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_47 {
	public static void main(String[] args) {
		//Crie um programa para converter uma quantidade de dólar para real;
		// • O usuário deve informar o valor em dólar;
		// • O programa deve converter esse valor em reais, exibindo a mensagem com o valor convertido;
		// • DÓLAR: R$ 6.61
		
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		Scanner d = new Scanner(System.in);
		System.out.print("Informe a quantidade de dólares: ");
		float dolar = d.nextFloat();
		
		float real = dolar * 5.61f;
		
		System.out.println("O valor em dólar é de " + dolar + " e convertido para reais fica R$ " + formatado.format(real));
	}
}
