import java.util.Scanner;

public class Exercicio_20 {
	public static void main(String[] args) {
		//Solicite um número de 0 a 6 e informe o dia da semana por extenso.
		
		Scanner d = new Scanner(System.in);
		System.out.print("Informe um dia da semana por número (1..7): ");
		int dia = d.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("DOMINGO");
			break;
		case 2:
			System.out.println("SEGUNDA-FEIRA");
			break;
		case 3:
			System.out.println("TERÇA-FEIRA");
			break;
		case 4:
			System.out.println("QUARTA-FEIRA");
			break;
		case 5:
			System.out.println("QUINTA-FEIRA");
			break;
		case 6:
			System.out.println("SEXTA-FEIRA");
			break;
		case 7:
			System.out.println("SÁBADO");
			break;
		default:
			System.out.println("Dia inválido");
		}
	}
}
