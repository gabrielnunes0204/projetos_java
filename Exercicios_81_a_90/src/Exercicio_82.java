import java.util.Scanner;

public class Exercicio_82 {
	public static void main(String[] args) {
		//Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome do vencedor.
		//Caso não haja vencedor deverá ser impressa a palavra EMPATE.
		
		Scanner t1 = new Scanner(System.in);
		System.out.print("Informe o nome do 01° time: ");
		String time1 = t1.nextLine();
		
		Scanner t2 = new Scanner(System.in);
		System.out.print("Informe o nome do 02° time: ");
		String time2 = t2.nextLine();
		
		Scanner g1 = new Scanner(System.in);
		System.out.print("Informe a quantidade de gols do Time 1: ");
		int golTime1 = g1.nextInt();
		
		Scanner g2 = new Scanner(System.in);
		System.out.print("Informe a quantidade de gols do Time 2: ");
		int golTime2 = g2.nextInt();
		
		if(golTime1 > golTime2) {
			System.out.println("O vencedor é o " + time1);
		} else if(golTime2 > golTime1) {
			System.out.println("O vencedor é o " + time2);
		} else {
			System.out.println("EMPATE");
		}
	}
}
