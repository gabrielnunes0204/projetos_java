import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_101 {
	public static void main(String[] args) {
		//Ler 10 valores, calcular e escrever a m�dia aritm�tica desses valores lidos
	
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		Scanner n = new Scanner(System.in);
		
		int contador = 1;
		int soma = 0;
		float media = 0;
		
		while(contador <= 10) {
			System.out.print("Informe um n�mero: ");
			int numero = n.nextInt();
			soma += numero;
			contador++;
		}
		media = soma / 10;
		System.out.println("A m�dia dos n�meros informados � de: " + formatado.format(media));
	}
}
