import java.util.Scanner;

public class Exercicio_08 {
	public static void main(String[] args) {
		// Uma f�brica de refrigerantes vende seu produto em tr�s formatos: lata de 250 ml, garrafa de 500 ml e garrafa de 2 litros.
		// Se um comerciante compra uma determinada quantidade de cada formato, fa�a um algoritmo para calcular quantos litros de refrigerante ele comprou.
		
		Scanner refri = new Scanner(System.in);
		
		System.out.print("Quantas latas de 250ml voc� comprou? ");
		int lata250 = refri.nextInt();
		
		System.out.print("Quantas garrafas de 500ml voc� comprou? ");
		int garrafa500 = refri.nextInt();
		
		System.out.print("Quantas garrafas de 1 litro voc� comprou? ");
		int garrafaLitro = refri.nextInt();
		
		System.out.println("Voc� comprou " + lata250 + " latas de refrigerante de 250ml, totalizando " + (lata250/4) + " litros");
		System.out.println("Voc� comprou " + garrafa500 + " garrafas de refrigerante de 500ml, totalizando " + (garrafa500/2) + " litros");
		System.out.println("Voc� comprou " + garrafaLitro + " garrafas de refrigerante de 1 litro, totalizando " + (garrafaLitro/1) + " litros");
	}
}
