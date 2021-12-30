import java.util.Scanner;

public class Exercicio_72 {
	public static void main(String[] args) {
		//Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe uma
		//comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total
		
		Scanner s = new Scanner(System.in);
		System.out.print("Informe o seu salário fixo: ");
		float salarioFixo = s.nextFloat();
		
		Scanner v = new Scanner(System.in);
		System.out.print("Informe o valor das vendas efetuadas: ");
		float valorVendas = v.nextFloat();
		
		float salarioTotal = 0;
		float reajusteMenor = (salarioFixo * 3) / 100;
		float reajusteMaior = (salarioFixo * 5) / 100;
		
		if(valorVendas <= 1500) {
			salarioTotal = salarioFixo + reajusteMenor;
			System.out.println("O salário fixo é de R$ " + salarioFixo + " e com reajuste fica R$ " + salarioTotal);
		} else if(valorVendas > 1500){
			salarioTotal = salarioFixo + reajusteMaior;
			System.out.println("O salário fixo é de R$ " + salarioFixo + " e com reajuste fica R$ " + salarioTotal);
		}
	}
}
