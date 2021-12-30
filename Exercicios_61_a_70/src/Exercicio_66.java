import java.util.Scanner;

public class Exercicio_66 {
	public static void main(String[] args) {
		//Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem
		//que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado).
		//Escrever também a média calculada
	
		Scanner n1 = new Scanner(System.in);
		System.out.print("Informe a 01ª nota: ");
		float nota1 = n1.nextFloat();
		
		Scanner n2 = new Scanner(System.in);
		System.out.print("Informe a 02ª nota: ");
		float nota2 = n2.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		
		if(media >= 6) {
			System.out.println("A sua média é de " + media + " e você está APROVADO");
		} else if(media < 6) {
			System.out.println("A sua média é de " + media + " e você está REPROVADO");
		}
	}
}
