import java.util.Scanner;

public class Exercicio_70 {
	public static void main(String[] args) {
		//Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e
		//calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o
		//jogo pode iniciar em um dia e terminar no dia seguinte
	
		Scanner hi = new Scanner(System.in);
		System.out.print("Informe a hora de inicio: ");
		int horaInicio = hi.nextInt();
		
		Scanner ht = new Scanner(System.in);
		System.out.print("Informe a hora de término: ");
		int horaTermino = ht.nextInt();
		
		int contador = 0;
		

		System.out.println("A quantidade de horas jogadas é de " + (horaTermino - horaInicio) + " horas");
	}
}
