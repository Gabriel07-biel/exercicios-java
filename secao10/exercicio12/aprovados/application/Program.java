package secao10.exercicio12.aprovados.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double media;
		
		System.out.print("Quantos alunos serão digitados: ");
		int n= sc.nextInt();
		
		String [] nomes= new String[n];
		double[] notas1 = new double[n];
		double[] notas2 = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do do %s aluno: \n ", i + 1);
			sc.nextLine();
			nomes[i] = sc.next();
			notas1[i] = sc.nextDouble();
			notas2[i] = sc.nextDouble();
		}
		
		System.out.print("Alunos aprovados: \n ");
		
		for (int i =0; i<n; i++) {
			media = (notas1[i] + notas2[i]) / 2;
			
			if(media >= 6.0) {
				System.out.printf("%s\n", nomes[i]);
			}
		} 
			
		sc.close();
		
		}
		
	}




