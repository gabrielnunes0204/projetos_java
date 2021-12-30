import java.util.Scanner;

public class Exercicio_44 {
	public static void main(String[] args) {
		//Crie um programa para ler a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dia.
		//Considerar ano com 365 dias e mês com 30 dias
		
		Scanner a = new Scanner(System.in);
		System.out.print("Informe quantos anos você tem: ");
		int ano = a.nextInt();
		
		Scanner m = new Scanner(System.in);
		System.out.print("Informe quanto meses: ");
		int meses = m.nextInt();
		
		Scanner d = new Scanner(System.in);
		System.out.print("Informe quantos dias: ");
		int dia = d.nextInt();
		
		int totalAnos = ano * 365;
		int totalMeses = meses * 30;
		int totalDias = totalAnos + totalMeses + dia;
		
		System.out.println("Você tem " + totalDias + " de vida");
	}
}
