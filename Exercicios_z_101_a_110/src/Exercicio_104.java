import java.util.Scanner;

public class Exercicio_104 {
	public static void main(String[] args) {
		//Escreva um programa para ler 10 n�meros. Todos os n�meros lidos com valor inferior a 40 devem ser somados. Escreva o valor final da soma efetuada
		
		int contador = 1;
		int soma = 0;
		
		while(contador <= 10) {
			Scanner n = new Scanner(System.in);
			System.out.print("Informe um n�mero: ");
			int numero = n.nextInt();
			
			if(numero < 40) {
				soma += numero;
			}
			
			contador++;
		}
		System.out.println("A soma dos n�meros menores que 40 � de " + soma);
		
	}
}
