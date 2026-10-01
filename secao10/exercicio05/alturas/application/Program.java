package secao10.exercicio05.alturas.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nmenores;
		double mediaalt, alturatotal, percentualMenores;
		
		System.out.println("Digite a quantidade de pessoas digitadas: ");
		int n = sc.nextInt();
		
		String [] nomes = new String[n];
		int [] idade = new int[n];
		double [] alturas = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Qual o nome? ");
			nomes[i] = sc.next();
			System.out.println("Quantos anos? ");
			idade[i] = sc.nextInt();
			System.out.println("Qual a altura? ");
			alturas[i] = sc.nextDouble();
		}
		
		nmenores = 0;
		alturatotal = 0;
		for(int i = 0; i < n; i++) {
			if(idade[i]< 16) {
				nmenores++;
			}
			alturatotal = alturatotal + alturas[i]; 
		}
		
		mediaalt = alturatotal / n;
		percentualMenores = ((double)nmenores / n) * 100.0;
		
		System.out.printf("\nAltura media = %.2f\n", mediaalt);
		System.out.printf("Pessoas com menos de 16 anos: ", percentualMenores);
		
		for(int i=0; i<n; i++){
			if(idade[i] < 16) {
				System.out.printf("%s\n", nomes[i]);
			}
		}
		
		sc.close();
	}

}
