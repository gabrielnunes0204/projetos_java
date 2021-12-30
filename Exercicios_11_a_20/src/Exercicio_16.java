import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_16 {
	public static void main(String args[]) {
		//Crie um algoritmo que peça a altura e o peso de uma pessoa. Calcule o IMC e informe se ele está dentro do intervalo de 18,5 e 25.
		
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		Scanner p = new Scanner(System.in);
		System.out.print("Informe o seu peso: ");
		float peso = p.nextFloat();
		
		Scanner a = new Scanner(System.in);
		System.out.print("Informe o seu peso: ");
		float altura = a.nextFloat();
		
		float imc = peso / (altura * altura);
		
		if(imc >= 18.5 && imc <= 25) {
			System.out.println("Seu IMC é de " + formatado.format(imc) + " e você está dentro do intervalo");
		} else {
			System.out.println("Seu IMC é de " + formatado.format(imc) + " e você está fora do intervalo");
		}
	}
}
