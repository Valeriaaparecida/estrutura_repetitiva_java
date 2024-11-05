package BEE1067;

import java.util.Scanner;

public class BEE1067 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		if( X >= 1 || X <= 1000) {
			for (int i = 1; i <= X; i++) {
				if (i % 2 !=0) {
					System.out.println(i);
				}
			}
		}
		
		sc.close();

	}

}
