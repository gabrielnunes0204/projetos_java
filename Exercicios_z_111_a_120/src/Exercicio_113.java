
public class Exercicio_113 {
	public static void main(String[] args) {
		//Escreva um programa que imprima as seguintes sequ�ncias de n�meros: (1, 1 2 3 4 5 6 7 8 9 10) (2, 1 2 3 4 5 6 7 8 9 10)
		//(3, 1 2 3 4 5 6 7 8 9 10) (4, 1 2 3 4 5 6 7 8 9 10) e assim sucessivamente, at� que o primeiro n�mero (antes da v�rgula), tamb�m chegue a 10
	
		//REFAZER - FIZ GAMBIARRA
		
		int x = 1;
		int y = 1;
		
		while(x <= 10) {
			System.out.println("(" + x + ", 1 2 3 4 5 6 7 8 9 10" + ")");
			x++;
		}
	}
}
