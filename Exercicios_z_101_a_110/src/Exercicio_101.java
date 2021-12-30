import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_101 {
	public static void main(String[] args) {
		//Ler 10 valores, calcular e escrever a média aritmética desses valores lidos
	
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		Scanner n = new Scanner(System.in);
		
		int contador = 1;
		int soma = 0;
		float media = 0;
		
		while(contador <= 10) {
			System.out.print("Informe um número: ");
			int numero = n.nextInt();
			soma += numero;
			contador++;
		}
		media = soma / 10;
		System.out.println("A média dos números informados é de: " + formatado.format(media));
	}
}
