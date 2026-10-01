package secao10.exercicio08.soma_vetores.application;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite os valores do vetor A: ");
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite os valores do vetor B: ");
			b[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			c[i] = a[i] + b[i];
		}
		
		System.out.println("Valor Resultante: ");
		
		for(int i=0; i<n; i++) {
		System.out.printf("%d\n", c[i]);
		
		}
		
		sc.close();
	}

}
