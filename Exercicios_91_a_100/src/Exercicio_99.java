import java.util.Scanner;

public class Exercicio_99 {
	public static void main(String[] args) {
		//Ler 10 valores e escrever quantos desses valores lidos s�o NEGATIVOS
	
		Scanner n = new Scanner(System.in);
		
		int contador = 1;
		int valoresNegativos = 0;
		
		while(contador <= 10) {
			System.out.print("Informe um n�mero: ");
			int numero = n.nextInt();
			if(numero < 0) {
				valoresNegativos += 1;
			}
			contador++;
		}
		System.out.println("A quantidade de n�meros negativos � de " + valoresNegativos);
	}
}
