import java.util.Scanner;

public class Exercicio_32 {
	public static void main(String args[]) {
		//Crie um programa para que apresente sua idade, altura e peso
		
		Scanner i = new Scanner(System.in);
		System.out.print("Informe a sua idade: ");
		int idade = i .nextInt();
		
		Scanner a = new Scanner(System.in);
		System.out.print("Informe a sua altura: ");
		float altura = a.nextFloat();
		
		Scanner p = new Scanner(System.in);
		System.out.print("Informe o seu peso: ");
		float peso = p .nextFloat();
		
		System.out.println("Olá, sua idade é de " + idade + " anos, o seu peso é de " + peso + " e você tem " + altura + " de altura");
	}
}
