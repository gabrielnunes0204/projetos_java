import java.util.Scanner;
import java.util.Vector;

public class Exercicio_116 {
	public static void main(String[] args) {
		//Escreva um programa que permita a leitura das notas de uma turma de 20 alunos. Calcular a média da turma e
		//contar quantos alunos obtiveram nota acima desta média calculada. Escrever a média da turma e o resultado da contagem
		
		Vector vetor = new Vector();
		Scanner n = new Scanner(System.in);
		
		int contador = 1;
		int mediaSuperior = 0;
		float media = 0;
		float soma = 0;
		
		while(contador <= 20) {
			System.out.print("Informe a nota/média final do " + contador + "° aluno: ");
			float notas = n.nextFloat();
			vetor.add(notas);
			soma += notas;
			media = soma / 20;
			
			if(notas > media) {
				mediaSuperior++;
			}
			contador++;
		}
		
		System.out.println("A média da turma é de " + media + " e a quantidade de alunos que tiveram média superior a média geral, é de " + mediaSuperior);
	}
}
