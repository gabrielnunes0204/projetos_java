import java.util.Scanner;

public class Exercicio_61 {
	public static void main(String[] args) {
		//Um tonel de refresco � feito com 8 partes de �gua mineral e 2 partes de suco de maracuj�.
		//Fa�a um programa para calcular quantos litros de �gua e de suco s�o necess�rios para se fazer X litros de refresco 
		//(informados pelo usu�rio)
		
		Scanner r = new Scanner(System.in);
		System.out.print("Informe litros de refresco voc� precisa: ");
		int litrosRefresco = r.nextInt();
		
		int litrosAgua = litrosRefresco * 8;
		int litrosSuco = litrosRefresco * 2;
		
		System.out.println("Para fazer " + litrosRefresco + " litros de refresco s�o necess�rios "
										 + litrosAgua + " litros de �gua, e "
				                         + litrosSuco + " litros de suco");
	}
}
