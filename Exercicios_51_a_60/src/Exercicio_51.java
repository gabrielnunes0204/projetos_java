import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_51 {
	public static void main(String[] args) {
		//Crie um programa que leia três notas de um aluno, calcule e escreva a média final deste aluno. Considerar que a média é ponderada e que o peso das notas
		//é 2, 3 e 5.
		
		DecimalFormat formatado = new DecimalFormat("0.00");
	
		Scanner n1 = new Scanner(System.in);
		System.out.print("Informe a 01ª nota: ");
		float nota1 = n1.nextFloat();
		
		Scanner n2 = new Scanner(System.in);
		System.out.print("Informe a 02ª nota: ");
		float nota2 = n2.nextFloat();
		
		Scanner n3 = new Scanner(System.in);
		System.out.print("Informe a 03ª nota: ");
		float nota3 = n3.nextFloat();
		
		float p1 = 2;
		float p2 = 3;
		float p3 = 5;
		
		float media = (nota1 * p1 + nota2 * p2 + nota3 * p3) / (p1 + p2 + p3);
		
		System.out.println("A sua média é de " + formatado.format(media));
	}
}
