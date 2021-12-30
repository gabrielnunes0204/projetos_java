import java.util.Scanner;

public class Exercicio_23 {
	public static void main(String[] args) {
		//Mostre o seu nome 3 vezes na tela (WHILE).
		//Mostre o seu nome 3 vezes na tela (DO WHILE).
		//Mostre o seu nome 3 vezes na tela (FOR).
		
		Scanner n = new Scanner(System.in);
		System.out.print("Informe o seu nome: ");
		String primeiroNome = n.nextLine();
		
		int cont1 = 1;
		int cont2 = 1;
		
		while(cont1 <= 3) {
			System.out.println(cont1 + " - " + primeiroNome + " (WHILE) ");
			cont1++;
		}
		
		System.out.print("Informe o seu nome: ");
		String segundoNome = n.nextLine();
		do {
			System.out.println(cont2 + " - " + segundoNome + " (DO WHILE) ");
			cont2++;
		}while(cont2 <= 3);
		
		System.out.print("Informe o seu nome: ");
		String terceiroNome = n.nextLine();
		for(int cont3 = 1; cont3 <= 3; cont3++) {
			System.out.println(cont3 + " - " + terceiroNome + " (FOR) ");
		}
	}
}
