package BEE1072;

import java.util.Scanner;

public class BEE1072 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int valor;
		int out = 0;
		int in = 0;
		for (int i = 0; i < n; i++) {
			valor = sc.nextInt();
			if (valor >= 10 && valor <= 20) {

				in += 1;
			} else {

				out += 1;
			}

		}
		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();
	}
}
