import java.util.Scanner;

public class Exercicio_111 {
	public static void main(String[] args) {
		//A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes.
		//Fa�a um programa para coletar dados sobre o sal�rio e n�mero de filhos de cada habitante e ap�s as leituras, escrever:
		// a) M�dia de sal�rio da popula��o
		// b) M�dia do n�mero de filhos
		// c) Maior sal�rio dos habitantes
		// d) Percentual de pessoas com sal�rio menor que R$ 150,00
		// Obs.: O final das leituras dos dados se dar� com a entrada de um �sal�rio negativo�.
	
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
			System.out.print("Informe o sal�rio do " + contador + "� habitante: ");
			float salario = q.nextFloat();
			
			System.out.print("Informe o n�mero de filhos do " + contador + "� habitante: ");
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
		System.out.println("A m�dia de sal�rios � R$ " + mediaSalario + ", a m�dia de filhos � de "
							+ mediaFilhos + " e a quantidade de sal�rios menores de R$ 150 � de " + salarioMenor);
	}
}
