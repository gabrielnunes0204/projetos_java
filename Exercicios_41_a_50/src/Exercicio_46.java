import java.util.Scanner;

public class Exercicio_46 {
	public static void main(String[] args) {
		//Crie um programa para ler o sal�rio mensal atual de um funcion�rio e o percentual de reajuste. Calcular e escrever o valor do novo sal�rio
		
		Scanner s = new Scanner(System.in);
		System.out.print("Informe o seu sal�rio: ");
		float salario = s.nextFloat();
		
		Scanner r = new Scanner(System.in);
		System.out.print("Informe a porcentagem de reajuste do seu sal�rio: ");
		float reajuste = r.nextFloat();
		
		float valorReajuste = (salario * reajuste) / 100;
		float novoSalario = salario + valorReajuste;
		
		System.out.println("O sal�rio sem reajuste era de " + salario + ", e com o reajuste ficar� em " + novoSalario);
	}
}
