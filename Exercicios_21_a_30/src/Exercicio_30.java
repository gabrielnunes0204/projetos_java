import java.util.Scanner;

public class Exercicio_30 {
	public static void main(String[] args) {
		//Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles
		
		Scanner i = new Scanner(System.in);
		System.out.print("Informe o número de inicio: ");
		int inicio = i.nextInt();
		
		Scanner f = new Scanner(System.in);
		System.out.print("Informe o número final: ");
		int termino = f.nextInt();
		
		Scanner p = new Scanner(System.in);
		System.out.print("Informe a quantidade de passos: ");
		int passos = p.nextInt();
		
		if (inicio > termino) {
			System.out.println("Valores inválidos, o 1º valor deve ser menor que o 2º");
		} else {
			while(inicio <= termino) {
				System.out.println("Inicio: " + inicio);
				inicio = inicio + passos;
			}
		}
	}
}
