import java.util.Scanner;

public class Exercicio_29 {
	public static void main(String[] args) {
		//Leia um número, calcule o fatorial deste número e mostre o resultado
		
		Scanner n = new Scanner(System.in);
		System.out.print("Informe um número que deseja ver o fatorial: ");
		int numero = n.nextInt();
		
		int fatorial = 1;
		int contador = 1;
		
		while(contador <= numero) {
			fatorial *= contador;
			contador++;
		}
		System.out.println("O fatorial de " + numero + " é " + fatorial);
	}
}
