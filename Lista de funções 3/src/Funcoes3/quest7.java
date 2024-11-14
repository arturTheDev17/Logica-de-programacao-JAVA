package Funcoes3;

import java.util.Scanner;

public class quest7 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		int numeroInv , contador = 0;
		System.out.println ( "Palíndromos:\n" );
		for ( int numero = 1000 ; numero < 10001 ; numero++ ) {
			numeroInv = reversorDeNumero ( numero );
			if ( numeroInv == numero ) {
				System.out.print ( numero + "  " );
				contador++; if ( contador % 10 == 0 ) {
					System.out.println ();
				}
			}
		}
		sc.close();
	}
	
	public static int reversorDeNumero ( int inteiro ) {
		int reversed = 0;
		 while ( inteiro > 0 ) {
			 reversed *= 10;
			 reversed += ( inteiro % 10 );
			 inteiro /= 10;
		} 
		return reversed;
	}
}
