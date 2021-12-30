import java.util.Scanner;

public class Exercicio_100 {
	public static void main(String[] args) {
		//Ler 10 valores e escrever quantos desses valores lidos estão no intervalo [10,20] (incluindo os valores 10 e 20
		//no intervalo) e quantos deles estão fora deste intervalo
	
		Scanner n = new Scanner(System.in);
		
		int contador = 1;
		int noIntervalo = 0;
		int foraIntervalo = 0;
		
		while(contador <= 10) {
			System.out.print("Informe um número: ");
			int numero = n.nextInt();
			if(numero >= 10 && numero <=20) {
				noIntervalo += 1;
			} else {
				foraIntervalo += 1;
			}
			contador++;
		}
		System.out.println("A quantidade de números no intervalo é de " + noIntervalo + " e fora do intervalo são " + foraIntervalo);
	}
}
