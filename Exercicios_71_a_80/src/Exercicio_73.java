import java.util.Scanner;

public class Exercicio_73 {
	public static void main(String[] args) {
		//Faça um programa para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o saldo
		//atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo',
		//senão escrever a mensagem 'Saldo Negativo'.
	
		Scanner nc = new Scanner(System.in);
		System.out.print("Informe o número da sua conta: ");
		float numeroConta = nc.nextFloat();
		
		Scanner s = new Scanner(System.in);
		System.out.print("Informe o saldo da sua conta: ");
		float saldoConta = s.nextFloat();
		
		Scanner d = new Scanner(System.in);
		System.out.print("Informe o valor de débito: ");
		float debito = d.nextFloat();
		
		Scanner c = new Scanner(System.in);
		System.out.print("Informe o valor de crédito: ");
		float credito = c.nextFloat();
		
		float saldoAtual = saldoConta - debito + credito;
		
		if(saldoAtual > 0) {
			System.out.println("Seu saldo é POSITIVO, e está no valor de R$ " + saldoAtual);
		} else {
			System.out.println("Seu saldo é NEGATIVO, e está em débito de R$ " + saldoAtual);
		}
	}
}
