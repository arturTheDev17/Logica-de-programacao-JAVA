package Funcoes3;

import java.util.Scanner;

public class quest5 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		int numero;
		boolean primo;
		for ( int numerico = 0 ; numerico < 101 ; numerico++ ) {
			primo = primo ( numerico );
			if ( numerico > 10 && numerico < 100 && primo == true ) {
				System.out.print ( numerico + "  " );
			}
		}
		sc.close();
	}
	public static boolean primo ( int num ) {
		boolean primo = false;
		if ( num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0 && num % 11 != 0 && num % 13 != 0 && num % 17 != 0 && num % 19 != 0 && num % 23 != 0 || num == 2 || num == 3 || num == 5 || num == 7 || num == 11 || num == 13 || num == 17 || num == 19 || num == 23  ) {
			primo = true;
		}
		return primo;
	}

}
