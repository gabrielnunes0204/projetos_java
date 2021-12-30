import java.util.Scanner;

public class Exercicio_72 {
	public static void main(String[] args) {
		//Ler o sal�rio fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe uma
		//comiss�o de 3% sobre o total das vendas at� R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu sal�rio total
		
		Scanner s = new Scanner(System.in);
		System.out.print("Informe o seu sal�rio fixo: ");
		float salarioFixo = s.nextFloat();
		
		Scanner v = new Scanner(System.in);
		System.out.print("Informe o valor das vendas efetuadas: ");
		float valorVendas = v.nextFloat();
		
		float salarioTotal = 0;
		float reajusteMenor = (salarioFixo * 3) / 100;
		float reajusteMaior = (salarioFixo * 5) / 100;
		
		if(valorVendas <= 1500) {
			salarioTotal = salarioFixo + reajusteMenor;
			System.out.println("O sal�rio fixo � de R$ " + salarioFixo + " e com reajuste fica R$ " + salarioTotal);
		} else if(valorVendas > 1500){
			salarioTotal = salarioFixo + reajusteMaior;
			System.out.println("O sal�rio fixo � de R$ " + salarioFixo + " e com reajuste fica R$ " + salarioTotal);
		}
	}
}
