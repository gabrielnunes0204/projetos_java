import java.util.Scanner;

public class Exercicio_46 {
	public static void main(String[] args) {
		//Crie um programa para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário
		
		Scanner s = new Scanner(System.in);
		System.out.print("Informe o seu salário: ");
		float salario = s.nextFloat();
		
		Scanner r = new Scanner(System.in);
		System.out.print("Informe a porcentagem de reajuste do seu salário: ");
		float reajuste = r.nextFloat();
		
		float valorReajuste = (salario * reajuste) / 100;
		float novoSalario = salario + valorReajuste;
		
		System.out.println("O salário sem reajuste era de " + salario + ", e com o reajuste ficará em " + novoSalario);
	}
}
