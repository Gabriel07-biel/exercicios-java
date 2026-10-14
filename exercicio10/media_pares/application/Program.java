package secao10.exercicio10.media_pares.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, somaspares = 0, npares =0;
		double mediapares;
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		int [] vet = new int[n];
		
		for(int i=0; i<n; i++) {
		System.out.print("Digite um numero: ");
		vet[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(vet[i] % 2 == 0) {
				somaspares = somaspares + vet[i];
				npares++;
			}
		}
		
		if(npares == 0) {
			System.out.println("nenhum numero par");
		} else {
			mediapares = (double)somaspares / npares;
			
			System.out.printf("Media dos Pares = %.1f\n", mediapares);
		}
		sc.close();
	}

}
