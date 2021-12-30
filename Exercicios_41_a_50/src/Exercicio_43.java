import java.util.Scanner;

public class Exercicio_43 {
	public static void main(String args[]) {
		//Leia as medidas de base e altura de um retângulo e escreva a área calculada
		
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Informe a base do retângulo: ");
		int base = dado.nextInt();
		
		System.out.print("Informe a altura do retângulo: ");
		int altura = dado.nextInt();
		
		int areaRetangulo = base * altura;
		
		System.out.println("A área do retângulo é de: " + areaRetangulo);
	}
}
