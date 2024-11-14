package Funcoes3;

import java.util.Scanner;

public class testePrimo {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		int numero;
		boolean primo;
		System.out.println ( "Insira um número: " );
		numero = sc.nextInt();
		primo = primo ( numero );
		System.out.println ( primo );
		sc.close();
	}
	public static boolean primo ( int num ) {
		boolean primo = false;
		if ( num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0 && num % 11 != 0 && num % 13 != 0 ) {
			primo = true;
		}
		return primo;
	}
}
