import java.util.Scanner;

public class Exercicio_103 {
	public static void main(String[] args) {
		//Escreva um programa para ler 10 n�meros e ao final da leitura escrever a soma total dos 10 n�meros lidos
		
		int contador = 1;
		int soma = 0;
		
		while(contador <= 10) {
			Scanner n = new Scanner(System.in);
			System.out.print("Informe um n�mero: ");
			int numero = n.nextInt();
			soma += numero;
			
			contador++;
		}
		System.out.println("A soma dos n�meros � de " + soma);
	}
}
