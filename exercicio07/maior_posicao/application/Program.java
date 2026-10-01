package secao10.exercicio07.maior_posicao.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Quantos números voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(int i=0; i<n; i++){
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		double maior = vet[0];
		int posMaior = 0;
		
		for(int i=1; i<n; i++ ) {
			if(vet[i] > maior) {
				maior = vet[i];
				posMaior = i;
			}
		}
		
		System.out.printf("Maior Valor: %.1f\n", maior);
		System.out.printf("Posicao do maior valor: %d\n", posMaior);
		
		
		
		sc.close();
		
	}

}
