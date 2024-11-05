package BEE1078;

import java.util.Scanner;

public class BEE1078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i < 11; i++) {
			int multiplica = N * i;
			System.out.println(i + " x " + N + " = " + multiplica);
		
			
		}

		
		sc.close();
	}

}
