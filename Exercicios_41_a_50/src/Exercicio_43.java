import java.util.Scanner;

public class Exercicio_43 {
	public static void main(String args[]) {
		//Leia as medidas de base e altura de um ret�ngulo e escreva a �rea calculada
		
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Informe a base do ret�ngulo: ");
		int base = dado.nextInt();
		
		System.out.print("Informe a altura do ret�ngulo: ");
		int altura = dado.nextInt();
		
		int areaRetangulo = base * altura;
		
		System.out.println("A �rea do ret�ngulo � de: " + areaRetangulo);
	}
}
