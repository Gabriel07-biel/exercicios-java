package secao10.exercicio04.somavetor.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números serão digitados: ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for(int i = 0; i < n; i++) {
			soma = soma + vet[i];
		}
		
		double media = soma /n;
		
		System.out.print("VALORES = ");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", vet[i]);
		}
		
		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n", media);
		
		
		sc.close();
	}

}
