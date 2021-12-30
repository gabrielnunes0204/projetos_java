import java.util.Scanner;

public class Exercicio_98 {
	public static void main(String[] args) {
		//Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido
		
		Scanner n = new Scanner(System.in);
		System.out.print("Informe um número (1 a 10): ");
		int numero = n.nextInt();
		
		int contador = 1;
		
		while(contador <= 10) {
			System.out.println(numero + " = " + contador + " = " + (numero*contador));
			contador++;
		}
	}
}
