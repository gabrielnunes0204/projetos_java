import java.util.Scanner;

public class Exercicio_33 {
	public static void main(String[] args) {
		//Crie um programa para que apresente seu sal�rio e vale-refei��o
		
		Scanner s = new Scanner(System.in);
		System.out.print("Informe o seu sal�rio: ");
		float salario = s.nextFloat();
		
		Scanner v = new Scanner(System.in);
		System.out.print("Informe o valor do seu VR (vale-refei��o): ");
		float vale = v.nextFloat();
		
		float valorTotal = salario + vale;
		
		System.out.println("O valor do seu sal�rio � de R$ " + salario + ", o valor do VR � de " + vale + " e o total da R$ " + valorTotal);
	}
}
