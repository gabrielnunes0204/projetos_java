import java.util.Scanner;

public class Exercicio_62 {
	public static void main(String[] args) {
		//Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:
		// a) a idade dessa pessoa em anos;
		// b) a idade dessa pessoa em meses;
		// c) a idade dessa pessoa em dias;
		// d) a idade dessa pessoa em semanas.
		
		//REVISAR
	
		Scanner aa = new Scanner(System.in);
		System.out.print("Informe o ano atual: ");
		int anoAtual = aa.nextInt();
		
		Scanner an = new Scanner(System.in);
		System.out.print("Informe o seu ano de nascimento: ");
		int anoNascimento = an.nextInt();
		
		int idadeTotal = anoAtual - anoNascimento;
		int mesesTotal = idadeTotal * 12;
		int diasTotal = mesesTotal * 24;
		int semanasTotal = mesesTotal * 4;
	
		System.out.println(idadeTotal + " " + mesesTotal + " " + diasTotal + " " + semanasTotal);
	}
}
