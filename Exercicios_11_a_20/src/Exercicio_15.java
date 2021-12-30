import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_15 {
	public static void main(String[] args) {
		//Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal.
		
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		Scanner n = new Scanner(System.in);
		System.out.print("Informe o seu nome: ");
		String nome = n.nextLine();
		
		Scanner s = new Scanner(System.in);
		System.out.print("Informe o seu sexo (M / F): ");
		String sexo = s.nextLine();
		
		Scanner a = new Scanner(System.in);
		System.out.print("Informe a sua altura: ");
		float altura = a.nextFloat();
		
		double pesoIdealHomem = (72.7 * altura) - 58;
		double pesoIdealMulher = (62.1 * altura) - 44.7;
		
		if(sexo.equals("M") || sexo.equals("m")) {
			System.out.println("Olá " + nome + ", seu peso ideal é: " + formatado.format(pesoIdealHomem));
		} else if (sexo.equals("F") || sexo.equals("f")) {
			System.out.println("Olá " + nome + ", seu peso ideal é: " + formatado.format(pesoIdealMulher));
		} else {
			System.out.println("Valor de sexo é inválido");
		}
	}
}
