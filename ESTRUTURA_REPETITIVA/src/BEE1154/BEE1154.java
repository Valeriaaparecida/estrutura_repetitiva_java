package BEE1154;

import java.util.Locale;
import java.util.Scanner;

public class BEE1154 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int cont = 0;
		int soma = 0;
		int idade = sc.nextInt();
		double media;
		
		while(idade > 0) {
			
			cont +=1;
			soma += idade;
			idade = sc.nextInt();
			
		}
		media = (double)soma / cont;
		
		System.out.printf("%.2f%n", media);
		
		
		
		
		
		sc.close();
		
		
	}

}
