import java.util.Scanner;

public class Exercicio_10 {
	public static void main(String[] args) {
		//Leia as medidas(b, h) de um ret�ngulo. Informe a �rea calculada e se � um quadrado ou n�o
		
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Informe o valor da base do ret�ngulo: ");
		float base = dado.nextFloat();
		
		System.out.print("Informe o valor da altura do ret�ngulo: ");
		float altura = dado.nextFloat();
		
		float areaRetangulo = base * altura;
		
		if(base == altura) {
			System.out.println("A �rea do ret�ngulo � de " + areaRetangulo + " e ele � um QUADRADO");
		} else {
			System.out.println("A �rea do ret�ngulo � de " + areaRetangulo + " e ele n�o � um QUADRADO");
		}
	}
}
