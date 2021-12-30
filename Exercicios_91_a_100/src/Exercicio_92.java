import java.util.Scanner;

public class Exercicio_92 {
	public static void main(String[] args) {
		//Escreva um programa para ler as notas da 1� e 2� avalia��es de um aluno, calcule e imprima a m�dia desse aluno.
		//S� devem ser aceitos valores v�lidos durante a leitura (0 a 10) para cada nota
	
		Scanner n = new Scanner(System.in);
		
		System.out.print("Informe a 01� nota: ");
		int nota1 = n.nextInt();
		
		System.out.print("Informe a 02� nota: ");
		int nota2 = n.nextInt();
		
		float media = (nota1 + nota2) / 2;
		
		if(nota1 > 10 || nota2 > 10) {
			System.out.println("Nota Inv�lida (Somente de 1 a 10)");
		} else {
			System.out.println("Sua m�dia � de " + media);
		}
	}
}
