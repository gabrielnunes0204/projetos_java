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
		
		System.out.println("Ol�, sua idade � de " + idade + " anos, o seu peso � de " + peso + " e voc� tem " + altura + " de altura");
	}
}
