import java.util.Scanner;

public class Exercicio_61 {
	public static void main(String[] args) {
		//Um tonel de refresco é feito com 8 partes de água mineral e 2 partes de suco de maracujá.
		//Faça um programa para calcular quantos litros de água e de suco são necessários para se fazer X litros de refresco 
		//(informados pelo usuário)
		
		Scanner r = new Scanner(System.in);
		System.out.print("Informe litros de refresco você precisa: ");
		int litrosRefresco = r.nextInt();
		
		int litrosAgua = litrosRefresco * 8;
		int litrosSuco = litrosRefresco * 2;
		
		System.out.println("Para fazer " + litrosRefresco + " litros de refresco são necessários "
										 + litrosAgua + " litros de água, e "
				                         + litrosSuco + " litros de suco");
	}
}
