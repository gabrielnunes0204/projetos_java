import java.util.Scanner;

public class Exercicio_111 {
	public static void main(String[] args) {
		//A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes.
		//Faça um programa para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:
		// a) Média de salário da população
		// b) Média do número de filhos
		// c) Maior salário dos habitantes
		// d) Percentual de pessoas com salário menor que R$ 150,00
		// Obs.: O final das leituras dos dados se dará com a entrada de um “salário negativo”.
	
		Scanner q = new Scanner(System.in);
		System.out.print("Informe quantos habitantes quer cadastrar: ");
		int qtdHabitantes = q.nextInt();
		
		int contador = 1;
		float somaSalario = 0;
		float somaFilhos = 0;
		float mediaSalario = 0;
		float mediaFilhos = 0;
		float salarioMenor = 0;
		
		while(contador <= qtdHabitantes) {
			System.out.print("Informe o salário do " + contador + "° habitante: ");
			float salario = q.nextFloat();
			
			System.out.print("Informe o número de filhos do " + contador + "° habitante: ");
			int qtdFilhos = q.nextInt();
			
			somaSalario += salario;
			somaFilhos += qtdFilhos;
			
			if(salario < 150) {
				salarioMenor++;
			}
			contador++;
		}
		mediaSalario = somaSalario / qtdHabitantes;
		mediaFilhos = somaFilhos / qtdHabitantes;
		System.out.println("A média de salários é R$ " + mediaSalario + ", a média de filhos é de "
							+ mediaFilhos + " e a quantidade de salários menores de R$ 150 é de " + salarioMenor);
	}
}
