import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_07 {
	public static void main(String args[]) {
		
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		Scanner moeda = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de moedas de 01 centavo: ");
		int umCent = moeda.nextInt();
		
		System.out.print("Informe a quantidade de moedas de 05 centavos: ");
		int cincoCent = moeda.nextInt();
		
		System.out.print("Informe a quantidade de moedas de 10 centavos: ");
		int dezCent = moeda.nextInt();
		
		System.out.print("Informe a quantidade de moedas de 25 centavos: ");
		int vinteCincoCent = moeda.nextInt();
		
		System.out.print("Informe a quantidade de moedas de 50 centavos: ");
		int cinquentaCent = moeda.nextInt();
		
		System.out.print("Informe a quantidade de moedas de 01 real: ");
		int umReal = moeda.nextInt();
		
		int umCentReal = umCent / 100;
		int cincoCentReal = cincoCent / 20;
		int DezCentReal = dezCent / 10;
		int vinteCincoCentReal = vinteCincoCent / 4;
		int cinquentaCentReal = cinquentaCent / 2;
		
		int valorTotal = umCentReal + cincoCentReal + DezCentReal + vinteCincoCentReal + cinquentaCentReal + umReal;
		
		System.out.println("No total você tem " + umCent + " moedas de 01 centavo, e R$ " + formatado.format(umCentReal));
		System.out.println("No total você tem " + cincoCent + " moedas de 05 centavos, e R$ " + formatado.format(cincoCentReal));
		System.out.println("No total você tem " + dezCent + " moedas de 10 centavos, e R$ " + formatado.format(DezCentReal));
		System.out.println("No total você tem " + vinteCincoCent + " moedas de 25 centavos, e R$ " + formatado.format(vinteCincoCentReal));
		System.out.println("No total você tem " + cinquentaCent + " moedas de 50 centavos, e R$ " + formatado.format(cinquentaCentReal));
		System.out.println("No total você tem " + umReal + " moedas de 01 real, e R$ " + formatado.format(umReal));
		System.out.println("O valor total de moedas é de R$ " + formatado.format(valorTotal));
	}
}
