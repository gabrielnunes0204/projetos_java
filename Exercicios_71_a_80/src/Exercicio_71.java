import java.util.Scanner;

public class Exercicio_71 {
	public static void main(String[] args) {
		//A jornada de trabalho semanal de um funcionário é de 40 horas.
		//O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
		//Escreva um programa que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá
		//ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas)
	
		Scanner ht = new Scanner(System.in);
		System.out.print("Informe quantas horas trabalhou no mês: ");
		float horasTrabalhadas = ht.nextFloat();
		
		Scanner sh = new Scanner(System.in);
		System.out.print("Informe o seu salário por hora trabalhada: ");
		float salarioHora = sh.nextFloat();
		
		float salarioSemAcrescimo = salarioHora * horasTrabalhadas;
		float horasExtras = 0;
		
		if(horasTrabalhadas > 40) {
			horasExtras = (salarioSemAcrescimo * 50) / 100;
			System.out.println("O seu salário seria de R$ " + salarioSemAcrescimo + " mas com as horas extras, ficará em R$ " + (salarioSemAcrescimo+horasExtras));
		} else {
			System.out.println("O seu salário é de R$ " + salarioSemAcrescimo);
		}
	}
}
