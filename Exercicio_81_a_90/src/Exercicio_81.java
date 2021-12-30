import java.util.Scanner;

public class Exercicio_81 {
	public static void main(String[] args) {
		//Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo.
		//OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados
	
		Scanner n1 = new Scanner(System.in);
		System.out.print("Informe o 01° valor: ");
		int numero1 = n1.nextInt();
		
		Scanner n2 = new Scanner(System.in);
		System.out.print("Informe o 02° valor: ");
		int numero2 = n2.nextInt();
		
		Scanner n3 = new Scanner(System.in);
		System.out.print("Informe o 03° valor: ");
		int numero3 = n3.nextInt();
		
		if(numero1 == numero2 && (numero1 != numero2)) {
			System.out.println("É um triângulo");
		} else if(numero1 == numero3 && (numero1 != numero2)) {
			System.out.println("É um triângulo");
		} else if(numero2 == numero3 && (numero2 != numero1)) {
			System.out.println("É um triângulo");
		} else if(numero3 == numero1 && (numero3 != numero2)) {
			System.out.println("É um triângulo");
		} else {
			System.out.println("Não é um triângulo");
		}
	}
}
