import java.text.DecimalFormat;

public class Exercicio_106 {
	public static void main(String[] args) {
		//Faça um programa que calcule e escreva a média aritmética dos números inteiros entre 15 (inclusive) e 100 (inclusive)
	
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		int soma = 0;
		
		for(int contador = 15; contador <= 100; contador++) {		
			soma += contador;
			contador++;
		}
		
		float media = soma / 85;
		System.out.println(formatado.format(media));
	}
}
