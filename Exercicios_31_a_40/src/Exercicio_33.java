import java.util.Scanner;

public class Exercicio_33 {
	public static void main(String[] args) {
		//Crie um programa para que apresente seu salário e vale-refeição
		
		Scanner s = new Scanner(System.in);
		System.out.print("Informe o seu salário: ");
		float salario = s.nextFloat();
		
		Scanner v = new Scanner(System.in);
		System.out.print("Informe o valor do seu VR (vale-refeição): ");
		float vale = v.nextFloat();
		
		float valorTotal = salario + vale;
		
		System.out.println("O valor do seu salário é de R$ " + salario + ", o valor do VR é de " + vale + " e o total da R$ " + valorTotal);
	}
}
