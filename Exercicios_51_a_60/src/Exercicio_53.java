import java.util.Scanner;

public class Exercicio_53 {
	public static void main(String[] args) {
		//Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o início do ano. Esqueça a questão dos anos bissextos
		//e considere sempre que um mês possui 30 dias.
	
		Scanner d = new Scanner(System.in);
		System.out.print("Informe um dia do ano: ");
		int dia = d.nextInt();
		
		Scanner m = new Scanner(System.in);
		System.out.print("Informe um mês do ano: ");
		int mes = m.nextInt();
		
		int diasPassado = (mes * 30) + dia;
		 System.out.println("A quantidade de dias que se passaram do começo do ano até a data é " + (diasPassado));
	}
}
