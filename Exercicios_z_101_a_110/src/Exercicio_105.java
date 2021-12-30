import java.util.Scanner;

public class Exercicio_105 {
	public static void main(String[] args) {
		//Ler 2 valores, calcular e escrever a soma dos inteiros existentes entre os 2 valores lidos (incluindo os valores lidos na soma).
		//Considere que o segundo valor lido será sempre maior que o primeiro valor lido
		
		Scanner n = new Scanner(System.in);
		
		System.out.print("Informe o 01° valor: ");
		int valor1 = n.nextInt();
		
		System.out.print("Informe o 02° valor: ");
		int valor2 = n.nextInt();
		
		int soma = 0;
		
		if(valor1 > valor2) {
			System.out.println("Valores inválidos, o 01° valor deve ser menor que o 02° valor");
		} else if(valor1 < valor2){
			while(valor1 <= valor2) {
				soma += valor1;
				valor1++;
			}
		}
		System.out.println("A soma dos números entre o intervalo é de " + soma);
	}
}
