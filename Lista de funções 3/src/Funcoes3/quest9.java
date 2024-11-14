package Funcoes3;

import java.util.Scanner;

public class quest9 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		int numero1 , numero2 , result [ ] = new int [ 10 ];
		for ( int contador = 0 ; contador < 10 ; contador++ ) {
			System.out.println ( "Insira um número: " );
			numero1 = sc.nextInt();
			System.out.println ( "Insira outro número: " );
			numero2 = sc.nextInt();
			System.out.println ();
			result [ contador ] = multiplicaFancy ( numero1, numero2 );
		}
		for ( int print = 0 ; print < 10 ; print++ ) {
			System.out.print ( result [ print ] + " " );
		}
		sc.close();
	}
	public static int multiplicaFancy ( int numerum , int numerdos ) {
		int produto = 0 ;
		do {
			if ( numerum % 2 != 0 ) {
				produto += numerdos;
			}
			numerdos *= 2;
			numerum /= 2;
		} while ( numerum != 0 );
		return produto;
	}
}