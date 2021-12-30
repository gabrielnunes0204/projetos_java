import java.util.Scanner;

public class Exercicio_77 {
	public static void main(String[] args) {
		//Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores
		
		Scanner n1 = new Scanner(System.in);
		System.out.print("Informe o 01° valor: ");
		int numero1 = n1.nextInt();
		
		Scanner n2 = new Scanner(System.in);
		System.out.print("Informe o 02° valor: ");
		int numero2 = n2.nextInt();
		
		Scanner n3 = new Scanner(System.in);
		System.out.print("Informe o 03° valor: ");
		int numero3 = n3.nextInt();
		
		if(numero3 < numero1 && (numero1 < numero2)) {
			System.out.println(numero1 + numero2);
		} else if(numero2 < numero1 && (numero1 < numero3)) {
			System.out.println(numero1 + numero3);
		} else if(numero1 < numero2 && (numero2 < numero3)) {
			System.out.println(numero2 + numero3);
		}
	}
}
