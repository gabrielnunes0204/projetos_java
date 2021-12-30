import java.util.Scanner;

public class Exercicio_45 {
	public static void main(String[] args) {
		//Crie um programa para ler o n�mero total de eleitores de um munic�pio, o n�mero de votos brancos, nulos e v�lidos.
		//Calcular e escrever o percentual que cada um representa em rela��o ao total de eleitores
	
		Scanner e = new Scanner(System.in);
		System.out.print("Informe a quantidade de eleitores do municipio: ");
		int totalEleitores = e.nextInt();
		
		Scanner vb = new Scanner(System.in);
		System.out.print("Informe a quantidade de votos em branco: ");
		int votosBrancos = vb.nextInt();
		
		Scanner vn = new Scanner(System.in);
		System.out.print("Informe a quantidade de votos nulos: ");
		int votosNulos = vn.nextInt();
		
		Scanner vv = new Scanner(System.in);
		System.out.print("Informe a quantidade de votos v�lidos: ");
		int votosValidos = vv.nextInt();
		
		float totalBrancos = (votosBrancos * 100) / totalEleitores;
		float totalNulos = (votosNulos * 100) / totalEleitores;
		float totalValidos = (votosValidos * 100) / totalEleitores;
		
		System.out.println("Total votos brancos: " + totalBrancos + "% | Total votos nulos: " + totalNulos + "% | Total votos v�lidos: " + totalValidos + "%");
	}
}
