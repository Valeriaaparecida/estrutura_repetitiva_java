package BEE1117;

import java.util.Locale;
import java.util.Scanner;

public class BEE1117 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota = sc.nextDouble();
		
		int cont = 0;
		double soma = 0;
		
		while (nota < 0 || nota > 10) {
			
			System.out.println("nota invalida");
			nota = sc.nextDouble();
		}
		while(nota >= 0 || nota <= 10) {
			cont++;
			soma += nota;
			nota = sc.nextDouble();
		}
		if(cont == 2) {
			double media = soma / cont;	
			System.out.printf("media = %.2f%n", media);
			cont = 0;
		}
		
		
		sc.close();
	}

}
