import java.util.Scanner;

public class Exercicio_90 {
	public static void main(String[] args) {
		//Uma empresa quer verificar se um empregado est� qualificado para a aposentadoria ou n�o.
		//Para estar em condi��es, um dos seguintes requisitos deve ser satisfeito
		
		Scanner c = new Scanner(System.in);
		System.out.print("Informe o seu c�digo de funcion�rio: ");
		int codigoEmpregado = c.nextInt();
		
		Scanner an = new Scanner(System.in);
		System.out.print("Informe o seu ano de nascimento: ");
		int anoNascimento = an.nextInt();
		
		Scanner ai = new Scanner(System.in);
		System.out.print("Informe o ano de admiss�o na empresa: ");
		int anoAdmissao = ai.nextInt();
		
		int idadeEmpregado = 2021 - anoNascimento;
		int tempoEmpresa = 2021 - anoAdmissao;
		
		if(idadeEmpregado >= 65 || tempoEmpresa >= 30 || idadeEmpregado == 60 && tempoEmpresa == 25) {
			System.out.println("Voc� tem " + tempoEmpresa + " de anos de empresa e pode Requerer Aposentadoria");
		} else {
			System.out.println("Voc� tem " + tempoEmpresa + " de anos de empresa e n�o pode Requerer Aposentadoria");
		}
	}
}
