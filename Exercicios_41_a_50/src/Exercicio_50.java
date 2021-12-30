import java.util.Scanner;

public class Exercicio_50 {
	public static void main(String[] args) {
		//Crie um programa para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius.
		
		Scanner f = new Scanner(System.in);
		System.out.print("Informe os graus em Fahrenheit: ");
		float fahrenheit = f.nextFloat();
		
		float celsius = (fahrenheit - 32) / 1.8f;
		
		System.out.println("Os graus em Fahrenheit é de " + fahrenheit + " e convertido para Celsius é de " + celsius);
	}
}
