import java.util.Scanner;

public class Exercicio_96 {
	public static void main(String[] args) {
		//Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere que o N será sempre maior que ZERO
	
		Scanner n = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int numero = n.nextInt();
		
		int contador = 1;
		
		while(numero <= 0) {
			System.out.println("Valor inválido");
			System.out.print("Informe um número: ");
			numero = n.nextInt();
		}
		
		while(contador <= numero) {
			System.out.println(contador);
			contador++;
		}
	}
}
