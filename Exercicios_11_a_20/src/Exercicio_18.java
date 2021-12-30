import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_18 {
	public static void main(String[] args) {
		//Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condi��o de acordo com a tabela abaixo.
		
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		Scanner n = new Scanner(System.in);
		System.out.print("Informe o seu nome: ");
		String nome = n.nextLine();
		
		Scanner p = new Scanner(System.in);
		System.out.print("Informe o seu peso: ");
		float peso = p.nextFloat();
		
		Scanner a = new Scanner(System.in);
		System.out.print("Informe a sua altura: ");
		float altura = a.nextFloat();
		
		float imc = peso / (altura * altura);
		
		if(imc < 18.5) {
			System.out.println("Ol� " + nome + " seu IMC � de " + formatado.format(imc) + " e voc� est� ABAIXO DO PESO");
		} else if (imc >= 18.5 && imc < 24.9) {
			System.out.println("Ol� " + nome + " seu IMC � de " + formatado.format(imc) + " e voc� est� com PESO NORMAL");
		} else if (imc >= 24.9 && imc < 29.9) {
			System.out.println("Ol� " + nome + " seu IMC � de " + formatado.format(imc) + " e voc� est� com SOBREPESO");
		} else if (imc > 29.9 && imc < 34.9) {
			System.out.println("Ol� " + nome + " seu IMC � de " + formatado.format(imc) + " e voc� est� com OBESIDADE GRAU I");
		} else if (imc >= 34.9 && imc < 39.9) {
			System.out.println("Ol� " + nome + " seu IMC � de " + formatado.format(imc) + " e voc� est�com OBESIDADE GRAU II");
		} else {
			System.out.println("Ol� " + nome + " seu IMC � de " + formatado.format(imc) + " e voc� est� com OBESIDADE GRAU III");
		}
	}
}
