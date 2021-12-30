import java.util.Scanner;

public class Exercicio_89 {
	public static void main(String[] args) {
		//Faça um programa para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos exercícios que fazem parte da avaliação.
		//Calcular a média de aproveitamento, usando a fórmula abaixo e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:
	
		Scanner n = new Scanner(System.in);
		
		System.out.print("Informe a sua 01ª nota: ");
		float nota1 = n.nextFloat();
		
		System.out.print("Informe a sua 02ª nota: ");
		float nota2 = n.nextFloat();
		
		System.out.print("Informe a sua 03ª nota: ");
		float nota3 = n.nextFloat();
		
		int peso2 = 2;
		int peso3 = 3;
		
		float media = (nota1 + nota2 * peso2 + nota3 * peso3) / (peso2 + peso3) ;
		
		if(media >= 9) {
			System.out.println("Sua média é de " + media + " e seu conceito é A");
		} else if(media >= 7.5 && media < 9) {
			System.out.println("Sua média é de " + media + " e seu conceito é B");
		} else if(media >= 6 && media < 7.5) {
			System.out.println("Sua média é de " + media + " e seu conceito é C");
		} else {
			System.out.println("Sua média é de " + media + " e seu conceito é D");
		}
	}
}
