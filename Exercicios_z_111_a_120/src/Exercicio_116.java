import java.util.Scanner;
import java.util.Vector;

public class Exercicio_116 {
	public static void main(String[] args) {
		//Escreva um programa que permita a leitura das notas de uma turma de 20 alunos. Calcular a m�dia da turma e
		//contar quantos alunos obtiveram nota acima desta m�dia calculada. Escrever a m�dia da turma e o resultado da contagem
		
		Vector vetor = new Vector();
		Scanner n = new Scanner(System.in);
		
		int contador = 1;
		int mediaSuperior = 0;
		float media = 0;
		float soma = 0;
		
		while(contador <= 20) {
			System.out.print("Informe a nota/m�dia final do " + contador + "� aluno: ");
			float notas = n.nextFloat();
			vetor.add(notas);
			soma += notas;
			media = soma / 20;
			
			if(notas > media) {
				mediaSuperior++;
			}
			contador++;
		}
		
		System.out.println("A m�dia da turma � de " + media + " e a quantidade de alunos que tiveram m�dia superior a m�dia geral, � de " + mediaSuperior);
	}
}
