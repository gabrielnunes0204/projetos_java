import java.util.Scanner;

public class Exercicio_121 {
	public static void main(String[] args) {
		//Faça um programa para ler um valor N qualquer (que será o tamanho dos vetores).
		//Após, ler dois vetores A e B (de tamanho N cada um) e depois armazenar em um terceiro vetor SOMA a
		//soma dos elementos do vetor A com os do vetor B (respeitando as mesmas posições) e escrever o vetor Soma
	
		Scanner n = new Scanner(System.in);
		
		System.out.print("Informe o tamanho de vetor: ");
		int valor = n.nextInt();
		int[] primeiroVetor = new int[valor+1];
		int[] segundoVetor = new int[valor+1];
		int[] vetorSoma = new int[valor+1];
		
		int contador1 = 1;
		int contador2 = 1;
		
		while(contador1 <= valor) {
			System.out.print("Informe o " + contador1 + "° valor para o 01° vetor: ");
			int indiceVetor1 = n.nextInt();
			primeiroVetor[contador1] = indiceVetor1;
			
			contador1++;
		}
		
		while(contador2 <= valor) {
			System.out.print("Informe o " + contador2 + "° valor para o 02° vetor: ");
			int indiceVetor2 = n.nextInt();
			segundoVetor[contador2] = indiceVetor2;
			
			contador2++;
		}
		
		for(int x = 1; x < primeiroVetor.length; x++) {
			vetorSoma[x] = primeiroVetor[x] + segundoVetor[x];
		}
		
		for(int z = 1; z < vetorSoma.length; z++) {
			System.out.println("A soma deu: " + vetorSoma[z]);
		}
	}
}
