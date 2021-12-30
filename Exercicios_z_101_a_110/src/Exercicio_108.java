import java.util.Scanner;

public class Exercicio_108 {
	public static void main(String[] args) {
		//Faça um programa que leia 10 valores e no final, escreva o maior e o menor valor lido
		
		Scanner n = new Scanner(System.in);
		
		int contador = 1;
		int maior = 0;
		int menor = 999;
		
		while(contador <= 10) {
			System.out.print("Informe " + contador + "° valor: ");
			int valor = n.nextInt();
			
			if(valor > maior) {
				maior = valor;
			}
			
			if(valor < maior) {
				menor = valor;
			}
			contador++;
		}
		System.out.println(maior + " e o " + menor);
	}
}
