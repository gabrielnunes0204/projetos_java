import java.util.Scanner;

public class Exercicio_89 {
	public static void main(String[] args) {
		//Fa�a um programa para ler as 3 notas obtidas por um aluno nas 3 verifica��es e a m�dia dos exerc�cios que fazem parte da avalia��o.
		//Calcular a m�dia de aproveitamento, usando a f�rmula abaixo e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:
	
		Scanner n = new Scanner(System.in);
		
		System.out.print("Informe a sua 01� nota: ");
		float nota1 = n.nextFloat();
		
		System.out.print("Informe a sua 02� nota: ");
		float nota2 = n.nextFloat();
		
		System.out.print("Informe a sua 03� nota: ");
		float nota3 = n.nextFloat();
		
		int peso2 = 2;
		int peso3 = 3;
		
		float media = (nota1 + nota2 * peso2 + nota3 * peso3) / (peso2 + peso3) ;
		
		if(media >= 9) {
			System.out.println("Sua m�dia � de " + media + " e seu conceito � A");
		} else if(media >= 7.5 && media < 9) {
			System.out.println("Sua m�dia � de " + media + " e seu conceito � B");
		} else if(media >= 6 && media < 7.5) {
			System.out.println("Sua m�dia � de " + media + " e seu conceito � C");
		} else {
			System.out.println("Sua m�dia � de " + media + " e seu conceito � D");
		}
	}
}
