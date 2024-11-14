package Funcoes3;

import java.util.Scanner;

public class quest6 {
	    
	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		boolean perfeito;
		
		for ( int numero = 0 ; numero < 501 ; numero++ ) {
			perfeito = perfeito ( numero );
			if ( numero > 1 && numero < 500 && perfeito == true ) {
				System.out.print ( numero + " " );
			}
		}
		sc.close();
	}
	
	public static boolean perfeito ( int num ) {
		boolean perfeito = false;
		int divisor , somaDivisores = 1;
		for ( int valor = 2 ; valor < num ; valor++ ) {
				if ( num % valor == 0 ) {
					divisor = num / valor;
					somaDivisores += divisor;
				}
		}
		if ( somaDivisores == num ) {
			perfeito = true;
		}
		return perfeito;
	}
}
