package BEE1115;

import java.util.Scanner;

public class BEE1115 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		while(X != 0 && Y != 0) {
			
			if(X > 0 && Y > 0) {
				System.out.println("primeiro");
				 X = sc.nextInt();
				 Y = sc.nextInt();
			}else if(X > 0 && Y < 0) {
				System.out.println("quarto");
				 X = sc.nextInt();
				 Y = sc.nextInt();
			}else if(X < 0 && Y < 0) {
				System.out.println("terceiro");
				 X = sc.nextInt();
				 Y = sc.nextInt();
			}else if(X < 0 && Y > 0) {
				System.out.println("segundo");
				 X = sc.nextInt();
				 Y = sc.nextInt();
			}
		}
		
		
		sc.close();

	}

}
