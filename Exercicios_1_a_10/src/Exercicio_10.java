import java.util.Scanner;

public class Exercicio_10 {
	public static void main(String[] args) {
		//Leia as medidas(b, h) de um retângulo. Informe a área calculada e se é um quadrado ou não
		
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Informe o valor da base do retângulo: ");
		float base = dado.nextFloat();
		
		System.out.print("Informe o valor da altura do retângulo: ");
		float altura = dado.nextFloat();
		
		float areaRetangulo = base * altura;
		
		if(base == altura) {
			System.out.println("A área do retângulo é de " + areaRetangulo + " e ele é um QUADRADO");
		} else {
			System.out.println("A área do retângulo é de " + areaRetangulo + " e ele não é um QUADRADO");
		}
	}
}
