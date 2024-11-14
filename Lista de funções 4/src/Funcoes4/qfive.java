package Funcoes4;

import java.util.Random;

public class qfive {

	public static void main ( String [] args ) {
		int contador = 0;
		int dado1 = dado ();
		int dado2 = dado ();
		int print1 = primeiraRodada ( dado1 , dado2 ) , ponto = 0;
		print1 ( print1 );
		if ( print1 != -1 && print1 != 1 ) {
			do {
				ponto = rodada ( ( dado1 + dado2 ) );
			    printRodada ( ponto , dado1 + dado2 );
			} while ( ponto != print1 && ponto != 7 );
		}
	}
	public static int dado ( ) {
		Random rn = new Random ( );
		int numero = ( rn.nextInt ( 6 ) + 1 );
		return numero;
	}
	public static int primeiraRodada ( int dado1 , int dado2 ) {
		int numero = 0;
		if ( dado1 + dado2 == 2 || dado1 + dado2 == 12 || dado1 + dado2 == 3 ) {
			numero = -1;
		} else if ( dado1 + dado2 == 7 || dado1 + dado2 == 11 ) {
			numero = 1;
		} else if ( dado1 + dado2 == 4 || dado1 + dado2 == 5 || dado1 + dado2 == 6 || dado1 + dado2 == 8 || dado1 + dado2 == 9 || dado1 + dado2 == 10 ) {
			numero = dado1 + dado2;
		}
		return numero;
	}
	public static int rodada ( int primeiraRodada ) {
		int dado1 = dado ( ) ;
		int dado2 = dado ( ) ;
		if ( dado1 + dado2 == primeiraRodada ) {
			return primeiraRodada;
		} else if ( dado1 + dado2 == 7 ) {
			return 7;
		}
			return dado1 + dado2;
	}
	public static void print1 ( int print1 ) {
		if ( print1 == -1 ) {
			System.out.println ( "Você perdeu! CRAPS!" );
		} else if ( print1 == 1 ) {
			System.out.println ( "Você ganhou! Tu és um NATURAL!" );
		} else {
			System.out.println ( "Seu ponto é o número " + print1 );
		}
	}
	public static void printRodada ( int print2 , int ponto ) {
		System.out.println ( "Número sorteado: " + print2 );
		if ( print2 == 7 ) {
			System.out.println ( "Você perdeu..." );
		} else if ( print2 == ponto ) {
			System.out.println ( "PONTO! Você ganhou!" );
		}
	}
}
