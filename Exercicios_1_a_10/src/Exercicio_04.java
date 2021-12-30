import java.util.Scanner;

public class Exercicio_04 {
	public static void main(String args[]) {
		//Leia três valores (A, B e C). Informe média.
		
		float media;
		
		Scanner nota = new Scanner(System.in);
		System.out.print("Informe o 01° valor: ");
		
		float nota1 = nota.nextFloat();
		
		System.out.print("Informe o 02° valor: ");
		float nota2 = nota.nextFloat();
		
		System.out.print("Informe o 03° valor: ");
		float nota3 = nota.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A média dos valores é de: " + media);
	}
}
