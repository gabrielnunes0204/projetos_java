import java.util.Scanner;

public class Exercicio_19 {
	public static void main(String[] args) {
		//Solicite um n�mero de 1 a 12 e informe o m�s escolhido por extenso.
		
		Scanner m = new Scanner(System.in);
		System.out.print("Informe um m�s do ano, por n�meros(1..12): ");
		int mes = m.nextInt();
		
		switch(mes) {
		case 1:
			System.out.println("JANEIRO");
			break;
		case 2:
			System.out.println("FEVEREIRO");
			break;
		case 3:
			System.out.println("MAR�O");
			break;
		case 4:
			System.out.println("ABRIL");
			break;
		case 5:
			System.out.println("MAIO");
			break;
		case 6:
			System.out.println("JUNHO");
			break;
		case 7:
			System.out.println("JULHO");
			break;
		case 8:
			System.out.println("AGOSTO");
			break;
		case 9:
			System.out.println("SETEMBRO");
			break;
		case 10:
			System.out.println("OUTUBRO");
			break;
		case 11:
			System.out.println("NOVEMBRO");
			break;
		case 12:
			System.out.println("DEZEMBRO");
			break;
		default:
			System.out.println("M�s inv�lido");
		}
	}
}
