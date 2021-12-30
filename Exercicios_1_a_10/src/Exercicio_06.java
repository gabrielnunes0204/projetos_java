import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_06 {
	public static void main(String args[]) {
		//Crie um algoritmo que peça a altura e o peso de uma pessoa. Calcule e informe o IMC.
		
		float imc;
		
		Scanner dado = new Scanner(System.in);
		Scanner n = new Scanner(System.in);
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		System.out.print("Informe o seu nome: ");
		String nome = n.nextLine();
		
		System.out.print("Informe o seu peso: ");
		float peso = dado.nextFloat();
		
		System.out.print("Informe a sua altura: ");
		float altura = dado.nextFloat();
		
		imc = peso / (altura * altura);
		
		if (imc <= 18.5) {
			System.out.println("Olá " + nome + " seu IMC é de " + formatado.format(imc) + " e você está ABAIXO DO PESO");
		} else if (imc > 18.5 && imc <= 24.9) {
			System.out.println("Olá " + nome + " seu IMC é de " + formatado.format(imc) + " e você está no PESO NORMAL");
		} else if (imc > 24.9 && imc <= 30) {
			System.out.println("Olá " + nome + " seu IMC é de " + formatado.format(imc) + " e você está com SOBREPESO");
		} else if(imc > 30) {
			System.out.println("Olá " + nome + " seu IMC é de " + formatado.format(imc) + " e você está com OBESIDADE");
		}
	}
}
