import java.util.Scanner;

public class Exercicio_67 {
	public static void main(String[] args) {
		//Ler o ano atual e o ano de nascimento de uma pessoa.
		//Escrever uma mensagem que diga se ela poder� ou n�o votar este ano (n�o � necess�rio considerar o m�s em que a pessoa nasceu)
		
		Scanner aa = new Scanner(System.in);
		System.out.print("Informe o ano atual: ");
		int anoAtual = aa.nextInt();
		
		Scanner an = new Scanner(System.in);
		System.out.print("Informe o seu ano de nascimento: ");
		int anoNascimento = an.nextInt();
		
		int idade = anoAtual - anoNascimento;
		
		if(idade >= 16 && idade <= 17) {
			System.out.println("A sua idade � " + idade + " anos, e voc� j� tem a op��o de votar, mas n�o � obrigat�rio.");
		} else if(idade >= 18) {
			System.out.println("A sua idade � " + idade + " anos, e voc� j� pode votar.");
		} else {
			System.out.println("A sua idade � " + idade + " anos, e voc� ainda n�o pode votar.");
		}
	}
}
