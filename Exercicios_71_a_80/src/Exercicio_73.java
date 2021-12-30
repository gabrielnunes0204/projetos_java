import java.util.Scanner;

public class Exercicio_73 {
	public static void main(String[] args) {
		//Fa�a um programa para ler: n�mero da conta do cliente, saldo, d�bito e cr�dito. Ap�s, calcular e escrever o saldo
		//atual (saldo atual = saldo - d�bito + cr�dito). Tamb�m testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo',
		//sen�o escrever a mensagem 'Saldo Negativo'.
	
		Scanner nc = new Scanner(System.in);
		System.out.print("Informe o n�mero da sua conta: ");
		float numeroConta = nc.nextFloat();
		
		Scanner s = new Scanner(System.in);
		System.out.print("Informe o saldo da sua conta: ");
		float saldoConta = s.nextFloat();
		
		Scanner d = new Scanner(System.in);
		System.out.print("Informe o valor de d�bito: ");
		float debito = d.nextFloat();
		
		Scanner c = new Scanner(System.in);
		System.out.print("Informe o valor de cr�dito: ");
		float credito = c.nextFloat();
		
		float saldoAtual = saldoConta - debito + credito;
		
		if(saldoAtual > 0) {
			System.out.println("Seu saldo � POSITIVO, e est� no valor de R$ " + saldoAtual);
		} else {
			System.out.println("Seu saldo � NEGATIVO, e est� em d�bito de R$ " + saldoAtual);
		}
	}
}
