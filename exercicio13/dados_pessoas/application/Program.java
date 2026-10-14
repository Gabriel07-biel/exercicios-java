package secao10.exercicio13.dados_pessoas.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		double [] altura = new double[n];
		char[] sexo = new char[n];
		
		
		for (int i=0; i<n; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i+1);
			sexo[i] = sc.next().charAt(0);
		}
		
		double menorAltura = altura[0];
		double maiorAltura= altura[0];
		
		for(int i = 1; i<n; i++) {
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			
			if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		
		int qtdHomens =0;
		int qtdMulheres = 0;
		double alturaFemTotal = 0;
		for(int i = 0; i<n; i++) {
			if(sexo[i] == 'M') {
				qtdHomens++;
			} 
			else {
				qtdMulheres++;
				alturaFemTotal = alturaFemTotal + altura[i];
			}
		}
		
		double alturaFemMedia = alturaFemTotal / qtdMulheres;
		
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", alturaFemMedia);
		System.out.printf("Numero de homens = %d\n", qtdHomens);
		
		
		sc.close();
	}

}
