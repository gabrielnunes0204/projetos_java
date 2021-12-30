import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_54 {
	public static void main(String[] args) {
		//Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo vendida respectivamente por 10, 12 e 15 reais.
		//Construa um programa em que o usuário forneça a quantidade de camisetas pequenas, médias e grandes referentes a uma venda, 
		//e a máquina informe quanto será o valor arrecadado.
	
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
		
		System.out.println("O valor arrecadado é de R$ " + formatado.format(valorArrecadado));
	}
}
