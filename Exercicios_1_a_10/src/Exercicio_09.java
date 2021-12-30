import java.util.Scanner;

public class Exercicio_09 {
	public static void main(String[] args) {
		//Leia um número de 1 a 10, calcule e mostre a tabuada.
		
		Scanner n = new Scanner(System.in);
		System.out.print("Informe um número para ver sua tabuada: ");
		int numero = n.nextInt();
		
		int contador = 1;
		
		while(contador <= 10) {
			System.out.println(numero + " X " + contador + " = " + (numero * contador));
			contador++;
		}
	}
}
