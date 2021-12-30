import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_52 {
	public static void main(String[] args) {
		//Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um programa para ler o preço do litro da gasolina e o valor do pagamento,
		//e exibir quantos litros ele conseguiu colocar no tanque.
		
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		Scanner p = new Scanner(System.in);
		System.out.print("Informe o preço do litro da gasolina R$ ");
		float litroGasosa = p.nextFloat();
		
		Scanner v = new Scanner(System.in);
		System.out.print("Informe o valor que tem para colocar de gasolina: ");
		float valorPagamento = v.nextFloat();
		
		float qtdLitros = valorPagamento / litroGasosa;
		
		System.out.println("A quantidade que você conseguiu colocar é de " + formatado.format(qtdLitros) + " litros");
	}
}
