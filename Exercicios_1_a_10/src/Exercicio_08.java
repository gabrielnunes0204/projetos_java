import java.util.Scanner;

public class Exercicio_08 {
	public static void main(String[] args) {
		// Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 250 ml, garrafa de 500 ml e garrafa de 2 litros.
		// Se um comerciante compra uma determinada quantidade de cada formato, faça um algoritmo para calcular quantos litros de refrigerante ele comprou.
		
		Scanner refri = new Scanner(System.in);
		
		System.out.print("Quantas latas de 250ml você comprou? ");
		int lata250 = refri.nextInt();
		
		System.out.print("Quantas garrafas de 500ml você comprou? ");
		int garrafa500 = refri.nextInt();
		
		System.out.print("Quantas garrafas de 1 litro você comprou? ");
		int garrafaLitro = refri.nextInt();
		
		System.out.println("Você comprou " + lata250 + " latas de refrigerante de 250ml, totalizando " + (lata250/4) + " litros");
		System.out.println("Você comprou " + garrafa500 + " garrafas de refrigerante de 500ml, totalizando " + (garrafa500/2) + " litros");
		System.out.println("Você comprou " + garrafaLitro + " garrafas de refrigerante de 1 litro, totalizando " + (garrafaLitro/1) + " litros");
	}
}
