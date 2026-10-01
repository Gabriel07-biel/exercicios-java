package secao10.exercicio06.numeros_pares.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite um número: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println("\nNúmeros pares: ");
		
		int qtdpares = 0; 
		for(int i = 0; i<n; i++) {
			if(vet[i] % 2 == 0) {
				System.out.printf("%d ", vet[i]);
				qtdpares++;
			}
		}
		
		System.out.printf("\n\nQuantidade de pares = %d\n", qtdpares);
		
		sc.close();
	}

}
