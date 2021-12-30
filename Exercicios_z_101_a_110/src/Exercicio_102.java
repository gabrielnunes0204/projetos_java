import java.util.Scanner;

public class Exercicio_102 {
	public static void main(String[] args) {
		//Ler o número de alunos existentes em uma turma e, após isto, ler as notas destes alunos, calcular e escrever a média aritmética dessas notas lidas.
	
		Scanner n = new Scanner(System.in);
		System.out.print("Informe a quantidade de alunos na turma: ");
		int qtdAlunos = n.nextInt();
		
		int contador = 1;
		float media = 0;
		
		while(contador <= qtdAlunos) {
			System.out.print("Informe a 01ª nota do aluno: ");
			int nota1 = n.nextInt();
			
			System.out.print("Informe a 02ª nota do aluno: ");
			int nota2 = n.nextInt();
			
			System.out.print("Informe a 03ª nota do aluno: ");
			int nota3 = n.nextInt();
			
			media = (nota1 + nota2 + nota3) / 3;
			System.out.println("A média é: " + media);
			
			contador++;
		}
		
	}
}
