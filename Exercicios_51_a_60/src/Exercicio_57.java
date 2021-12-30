import java.util.Scanner;

public class Exercicio_57 {
	public static void main(String[] args) {
		//Faça um programa para ler uma temperatura Celsius e imprimi-Ia em Fahrenheit (pesquise como fazer este tipo de conversão).
	
		Scanner c = new Scanner(System.in);
		System.out.print("Informe os graus em Celsius: ");
		float celsius = c.nextFloat();
		
		float fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println("Os graus em Celsius é de " + celsius + " e convertido para Fahrenheit é de " + fahrenheit);
	}
}
