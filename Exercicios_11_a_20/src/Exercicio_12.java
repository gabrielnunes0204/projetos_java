import java.util.Scanner;

public class Exercicio_12 {
	public static void main(String[] args) {
		//Leia dois valores (A e B) e informe qual � o maior valor.
		
		Scanner n1 = new Scanner(System.in);
		System.out.print("Informe o 01� valor: ");
		int primeiroValor = n1.nextInt();
		
		Scanner n2 = new Scanner(System.in);
		System.out.print("Informe o 02� valor: ");
		int segundoValor = n2.nextInt();
		
		if(primeiroValor > segundoValor) {
			System.out.println("O valor " + primeiroValor + " � maior que " + segundoValor + " ou seja, o primeiro valor � maior");
		} else if (segundoValor > primeiroValor) {
			System.out.println("O valor " + segundoValor + " � maior que " + primeiroValor + " ou seja, o segundo valor � maior");
		} else {
			System.out.println("Os valores " + segundoValor + " e " + primeiroValor + " s�o iguais");
		}
	}
}
