import java.util.Scanner;

public class Exercicio_30 {
	public static void main(String[] args) {
		//Fa�a um programa que receba dois n�meros inteiros e gere os n�meros inteiros que est�o no intervalo compreendido por eles
		
		Scanner i = new Scanner(System.in);
		System.out.print("Informe o n�mero de inicio: ");
		int inicio = i.nextInt();
		
		Scanner f = new Scanner(System.in);
		System.out.print("Informe o n�mero final: ");
		int termino = f.nextInt();
		
		Scanner p = new Scanner(System.in);
		System.out.print("Informe a quantidade de passos: ");
		int passos = p.nextInt();
		
		if (inicio > termino) {
			System.out.println("Valores inv�lidos, o 1� valor deve ser menor que o 2�");
		} else {
			while(inicio <= termino) {
				System.out.println("Inicio: " + inicio);
				inicio = inicio + passos;
			}
		}
	}
}
