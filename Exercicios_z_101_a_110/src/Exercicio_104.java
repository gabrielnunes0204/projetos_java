import java.util.Scanner;

public class Exercicio_104 {
	public static void main(String[] args) {
		//Escreva um programa para ler 10 números. Todos os números lidos com valor inferior a 40 devem ser somados. Escreva o valor final da soma efetuada
		
		int contador = 1;
		int soma = 0;
		
		while(contador <= 10) {
			Scanner n = new Scanner(System.in);
			System.out.print("Informe um número: ");
			int numero = n.nextInt();
			
			if(numero < 40) {
				soma += numero;
			}
			
			contador++;
		}
		System.out.println("A soma dos números menores que 40 é de " + soma);
		
	}
}
