import java.util.Scanner;

public class Exercicio_70 {
	public static void main(String[] args) {
		//Ler a hora de in�cio e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e
		//calcule a dura��o do jogo em horas, sabendo-se que o tempo m�ximo de dura��o do jogo � de 24 horas e que o
		//jogo pode iniciar em um dia e terminar no dia seguinte
	
		Scanner hi = new Scanner(System.in);
		System.out.print("Informe a hora de inicio: ");
		int horaInicio = hi.nextInt();
		
		Scanner ht = new Scanner(System.in);
		System.out.print("Informe a hora de t�rmino: ");
		int horaTermino = ht.nextInt();
		
		int contador = 0;
		

		System.out.println("A quantidade de horas jogadas � de " + (horaTermino - horaInicio) + " horas");
	}
}
