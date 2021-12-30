import java.util.Scanner;

public class Exercicio_76 {
	public static void main(String[] args) {
		//Ler 3 valores (considere que não serão informados valores iguais) e escrever o menor deles
		
		Scanner n1 = new Scanner(System.in);
		System.out.print("Informe o 01° valor: ");
		int numero1 = n1.nextInt();
		
		Scanner n2 = new Scanner(System.in);
		System.out.print("Informe o 02° valor: ");
		int numero2 = n2.nextInt();
		
		Scanner n3 = new Scanner(System.in);
		System.out.print("Informe o 03° valor: ");
		int numero3 = n3.nextInt();
		
		if(numero1 < numero2 && numero1 < numero3) {
			System.out.println("O primeiro número é o menor");
		} else if(numero2 < numero1 && numero2 < numero3) {
			System.out.println("O segundo número é o menor");
		} else if(numero3 < numero2 && numero3 < numero1) {
			System.out.println("O terceiro número é o menor");
		}
	}
}
