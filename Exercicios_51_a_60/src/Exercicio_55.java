import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_55 {
	public static void main(String[] args) {
		//Tr�s amigos, Carlos, Andr� e Felipe. decidiram rachar igualmente a conta de um bar. Fa�a um programa para ler o valor total da conta
		//e imprimir quanto cada um deve pagar, mas fa�a com que Carlos e Andr� n�o paguem centavos.
		//Ex: uma conta de R$101,53 resulta em R$33,00 para Carlos, R$33,00 para Andr� e R$35,53 para Felipe.
	
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		String[] amigos = {"Carlos", "Andr�", "Felipe"};
		
		Scanner v = new Scanner(System.in);
		System.out.print("Informe o valor total da conta: ");
		float valorConta = v.nextFloat();
		
		float valorDividido = valorConta / amigos.length;
		int contador = 0;
		
		while(contador < amigos.length) {
			System.out.println("O " + amigos[contador] + " pagou R$ " + formatado.format(valorDividido));
			contador++;
		}
	}
}
