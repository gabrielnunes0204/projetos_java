import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_54 {
	public static void main(String[] args) {
		//Uma f�brica de camisetas produz os tamanhos pequeno, m�dio e grande, cada uma sendo vendida respectivamente por 10, 12 e 15 reais.
		//Construa um programa em que o usu�rio forne�a a quantidade de camisetas pequenas, m�dias e grandes referentes a uma venda, 
		//e a m�quina informe quanto ser� o valor arrecadado.
	
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		Scanner p = new Scanner(System.in);
		System.out.print("Informe a quantidade de camisas P vendidas: ");
		int tamanhoP = p.nextInt();
		
		Scanner m = new Scanner(System.in);
		System.out.print("Informe a quantidade de camisas M vendidas: ");
		int tamanhoM = m.nextInt();
		
		Scanner g = new Scanner(System.in);
		System.out.print("Informe a quantidade de camisas G vendidas: ");
		int tamanhoG = g.nextInt();
		
		float valorP = tamanhoP * 10;
		float valorM = tamanhoM * 12;
		float valorG = tamanhoG * 15;

		float valorArrecadado = valorP + valorM + valorG;
		
		System.out.println("O valor arrecadado � de R$ " + formatado.format(valorArrecadado));
	}
}
