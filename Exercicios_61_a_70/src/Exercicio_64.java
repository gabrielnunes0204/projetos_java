import java.util.Scanner;

public class Exercicio_64 {
	public static void main(String[] args) {
		//Ler um valor e escrever se � positivo ou negativo (considere o valor zero como positivo).
	
		Scanner n = new Scanner(System.in);
		System.out.print("Informe um n�mero: ");
		int numero = n.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O n�mero " + numero + " � PAR");
		} else {
			System.out.println("O n�mero " + numero + " � �MPAR");
		}
	}
}
