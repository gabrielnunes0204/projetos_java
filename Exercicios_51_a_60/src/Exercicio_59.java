import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_59 {
	public static void main(String[] args) {
		//A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos: lata de 250 ml, garrafa de 500 ml e garrafa de 2 litros.
		//Se um comerciante compra uma determinada quantidade de cada formato, faça um programa para calcular quantos litros de refrigerante ele comprou.
	
		Scanner t1 = new Scanner(System.in);
		System.out.print("Informe a quantidade de latas de 250ml que você comprou: ");
		int lata250 = t1.nextInt();
		
		Scanner t2 = new Scanner(System.in);
		System.out.print("Informe a quantidade de garrafas de 500ml que você comprou: ");
		int garrafa500 = t2.nextInt();
		
		Scanner t3 = new Scanner(System.in);
		System.out.print("Informe a quantidade de garrafas de 2 litros que você comprou: ");
		int garrafaDoisLitro = t3.nextInt();
		
		float total250 = lata250 / 4;
		float total500 = garrafa500 / 2;
		float totalDoisLitros = garrafaDoisLitro * 2;
		
		System.out.println("Em latas de 250ml, você tem " + total250 + " litros");
		System.out.println("Em garrafas de 500ml, você tem " + total500 + " litros");
		System.out.println("Em garrafas de 2 litros, você tem " + totalDoisLitros + " litros");
	}
}
