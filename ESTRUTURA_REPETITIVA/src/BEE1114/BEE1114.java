package BEE1114;

import java.util.Scanner;

public class BEE1114 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int senha = 2002;

		int tentativa = sc.nextInt();

		while (tentativa != senha) {
			System.out.println("Senha Invalida");
			tentativa = sc.nextInt();
		}
		System.out.println("Acesso Permitido");

		sc.close();

	}

}
