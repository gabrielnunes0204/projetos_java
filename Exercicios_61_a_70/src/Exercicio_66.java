import java.util.Scanner;

public class Exercicio_66 {
	public static void main(String[] args) {
		//Ler as notas da 1a. e 2a. avalia��es de um aluno. Calcular a m�dia aritm�tica simples e escrever uma mensagem
		//que diga se o aluno foi ou n�o aprovado (considerar que nota igual ou maior que 6 o aluno � aprovado).
		//Escrever tamb�m a m�dia calculada
	
		Scanner n1 = new Scanner(System.in);
		System.out.print("Informe a 01� nota: ");
		float nota1 = n1.nextFloat();
		
		Scanner n2 = new Scanner(System.in);
		System.out.print("Informe a 02� nota: ");
		float nota2 = n2.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		
		if(media >= 6) {
			System.out.println("A sua m�dia � de " + media + " e voc� est� APROVADO");
		} else if(media < 6) {
			System.out.println("A sua m�dia � de " + media + " e voc� est� REPROVADO");
		}
	}
}
