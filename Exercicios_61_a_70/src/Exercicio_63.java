import java.util.Scanner;

public class Exercicio_63 {
	public static void main(String[] args) {
		//Ler um valor e escrever a mensagem: � MAIOR QUE 10, se o valor lido for maior que 10, caso contr�rio escrever N�O � MAIOR QUE 10
		
		Scanner n = new Scanner(System.in);
		System.out.print("Informe um n�mero: ");
		int numero = n.nextInt();
		
		if(numero > 10) {
			System.out.println("O n�mero " + numero + " � maior que 10");
		} else if(numero < 10) {
			System.out.println("O n�mero " + numero + " � menor que 10");
		} else {
			System.out.println("O n�mero " + numero + " � igual a 10");
		}
	}
}
