package secao10.exercicio09.abaixo_da_media.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma, media;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
				
		double[] vet = new double[n];
		
		for(int i = 0; i<n; i++) {
			System.out.println("Digite um numero: ");
			 vet[i] = sc.nextDouble(); 
		}
		
		soma= 0;
		for(int i=0; i<n; i++) {
			soma = soma + vet[i];
		}
		
		media = soma / n;
		
		System.out.printf("Media do Vetor: %.3f\n", media);
		System.out.printf("Elementos Abaixo da Media: ");
		for(int i=0; i<n; i++) {
			if(vet[i] < media) {
				System.out.printf("\n%.1f\n", vet[i]);
			}
			
		}
		sc.close();
	}
}
