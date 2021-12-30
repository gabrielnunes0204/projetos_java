import java.util.Scanner;

public class Exercicio_92 {
	public static void main(String[] args) {
		//Escreva um programa para ler as notas da 1ª e 2ª avaliações de um aluno, calcule e imprima a média desse aluno.
		//Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota
	
		Scanner n = new Scanner(System.in);
		
		System.out.print("Informe a 01ª nota: ");
		int nota1 = n.nextInt();
		
		System.out.print("Informe a 02ª nota: ");
		int nota2 = n.nextInt();
		
		float media = (nota1 + nota2) / 2;
		
		if(nota1 > 10 || nota2 > 10) {
			System.out.println("Nota Inválida (Somente de 1 a 10)");
		} else {
			System.out.println("Sua média é de " + media);
		}
	}
}
