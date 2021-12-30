import java.util.Scanner;

public class Exercicio_69 {
	public static void main(String[] args) {
		//Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente
	
		Scanner n1 = new Scanner(System.in);
		System.out.print("Informe o 01° valor: ");
		int numero1 = n1.nextInt();
		
		Scanner n2 = new Scanner(System.in);
		System.out.print("Informe o 02° valor: ");
		int numero2 = n2.nextInt();
		
		if(numero1 > numero2) {
			System.out.println(numero2 + " " + numero1);
		} else if(numero1 < numero2) {
			System.out.println(numero1 + " " + numero2);
		}
	}
}
