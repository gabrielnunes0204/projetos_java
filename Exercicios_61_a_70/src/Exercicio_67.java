import java.util.Scanner;

public class Exercicio_67 {
	public static void main(String[] args) {
		//Ler o ano atual e o ano de nascimento de uma pessoa.
		//Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu)
		
		Scanner aa = new Scanner(System.in);
		System.out.print("Informe o ano atual: ");
		int anoAtual = aa.nextInt();
		
		Scanner an = new Scanner(System.in);
		System.out.print("Informe o seu ano de nascimento: ");
		int anoNascimento = an.nextInt();
		
		int idade = anoAtual - anoNascimento;
		
		if(idade >= 16 && idade <= 17) {
			System.out.println("A sua idade é " + idade + " anos, e você já tem a opção de votar, mas não é obrigatório.");
		} else if(idade >= 18) {
			System.out.println("A sua idade é " + idade + " anos, e você já pode votar.");
		} else {
			System.out.println("A sua idade é " + idade + " anos, e você ainda não pode votar.");
		}
	}
}
