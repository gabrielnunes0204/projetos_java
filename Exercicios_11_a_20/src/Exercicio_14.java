import java.util.Scanner;

public class Exercicio_14 {
	public static void main(String[] args) {
		//Pergunte qual o valor da compra e a forma de pagamento, se for a vista dê 10% de desconto, caso contrário dê 5%.
		
		Scanner v = new Scanner(System.in);
		System.out.print("Informe o valor da compra: ");
		int valor = v.nextInt();
		
		Scanner f = new Scanner(System.in);
		System.out.print("Informe a forma de pagamento (a vista / outro): ");
		String formaPagamento = f.nextLine();
		
		float valorAVista = (valor * 10) / 100;
		float valorOutro = (valor * 5) / 100;
		
		if(formaPagamento.equals("a vista")) {
			System.out.println("O seu pagamento foi feita à vista, assim terá 10% de desconto na compra, ficando no valor de R$ " + (valor-valorAVista));
		} else {
			System.out.println("O valor da sua compra ficará em R$ " + (valor-valorOutro));
		}
	}
}
