package Funcoes3;

import java.util.Scanner;

public class quest8 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		boolean resposta;
		System.out.println ( "NÚMEROS DE 4 ALGARISMOS COM A CARACTERISTICA mmnn = ( mm+nn )²\n" );
		// arrumar pra impedir um numero de ser menor ou maior
		for ( int number = 1000 ; number < 9999 ; number++ ) {
			resposta = caracteristica ( number );
			if ( resposta == true ) {
				System.out.println ( "	| " + number + " |" );
			}
		}
		sc.close();
	}
	
	public static boolean caracteristica ( int numero ) {
		boolean resposta = false;
		int quadrado = ( numero / 100 ) + ( numero % 100 );
		if ( quadrado * quadrado == numero ) {
			resposta = true;
		}
		return resposta;
	}
}
