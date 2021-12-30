import java.util.Scanner;

public class Exercicio_85 {
	public static void main(String[] args) {
		//Escreva um programa que leia as idades de 2 homens e de 2 mulheres (considere que as idades dos homens serão
		//sempre diferentes entre si, bem como as das mulheres).
		//Calcule e escreva a soma das idades do homem mais velho
		//com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha

		Scanner idh1 = new Scanner(System.in);
		System.out.print("Informe a 01ª idade (Homem): ");
		int idadeHomem1 = idh1.nextInt();
		
		Scanner idh2 = new Scanner(System.in);
		System.out.print("Informe a 02ª idade (Homem): ");
		int idadeHomem2 = idh2.nextInt();
		
		Scanner idm1 = new Scanner(System.in);
		System.out.print("Informe a 01ª idade (Mulher): ");
		int idadeMulher1 = idm1.nextInt();
		
		Scanner id2 = new Scanner(System.in);
		System.out.print("Informe a 02ª idade (Mulher): ");
		int idadeMulher2 = id2.nextInt();
		
		int homemVelho = 0;
		int homemNovo = 0;
		int mulherVelha = 0;
		int mulherNova = 0;
		
		if(idadeHomem1 > idadeHomem2) {
			homemVelho = idadeHomem1;
			homemNovo = idadeHomem2;
		} else if(idadeHomem2 > idadeHomem1){
			homemVelho = idadeHomem2;
			homemNovo = idadeHomem1;
		}
		
		if(idadeMulher1 > idadeMulher2) {
			mulherVelha = idadeMulher1;
			mulherNova = idadeMulher2;
		} else if(idadeMulher2 > idadeMulher1) {
			mulherVelha = idadeMulher2;
			mulherNova= idadeMulher1;
		}
		
		System.out.println("A soma das idades do homem mais velha com a mulher mais nova é " + (homemVelho + mulherNova));
		System.out.println("A multiplicação das idades do homem mais novo com a mulher mais velha é " + (homemNovo + mulherVelha));
	}
}
