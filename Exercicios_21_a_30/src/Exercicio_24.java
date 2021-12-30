import java.util.Scanner;

public class Exercicio_24 {
	public static void main(String[] args) {
		//Conte de 1 até 5.
		
		int cont1 = 1;
		while(cont1 <= 3) {
			System.out.println("Com WHILE " + cont1);
			cont1++;
		}
		
		int cont2 = 1;
		do {
			System.out.println("Com DO WHILE " + cont2);
			cont2++;
		}while(cont2 <= 3);
		
		for(int cont3 = 1; cont3 <= 3; cont3++) {
			System.out.println("Com FOR " + cont3);
		}
	}
}
