import java.util.Scanner;

public class Exercicio_71 {
	public static void main(String[] args) {
		//A jornada de trabalho semanal de um funcion�rio � de 40 horas.
		//O funcion�rio que trabalhar mais de 40 horas receber� hora extra, cujo c�lculo � o valor da hora regular com um acr�scimo de 50%.
		//Escreva um programa que leia o n�mero de horas trabalhadas em um m�s, o sal�rio por hora e escreva o sal�rio total do funcion�rio, que dever�
		//ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o m�s possua 4 semanas exatas)
	
		Scanner ht = new Scanner(System.in);
		System.out.print("Informe quantas horas trabalhou no m�s: ");
		float horasTrabalhadas = ht.nextFloat();
		
		Scanner sh = new Scanner(System.in);
		System.out.print("Informe o seu sal�rio por hora trabalhada: ");
		float salarioHora = sh.nextFloat();
		
		float salarioSemAcrescimo = salarioHora * horasTrabalhadas;
		float horasExtras = 0;
		
		if(horasTrabalhadas > 40) {
			horasExtras = (salarioSemAcrescimo * 50) / 100;
			System.out.println("O seu sal�rio seria de R$ " + salarioSemAcrescimo + " mas com as horas extras, ficar� em R$ " + (salarioSemAcrescimo+horasExtras));
		} else {
			System.out.println("O seu sal�rio � de R$ " + salarioSemAcrescimo);
		}
	}
}
