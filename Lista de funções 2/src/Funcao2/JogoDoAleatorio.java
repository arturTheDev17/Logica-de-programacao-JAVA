package Funcao2;

import java.util.Scanner;
import java.util.Random;

public class JogoDoAleatorio {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		Random ran = new Random ();
		int random , num = 0 , contador = 0;
		random = ran.nextInt ( 1000 );
		System.out.println ( "GERANDO NÚMERO ALEATÓRIO..." );
		System.out.println ( "Insira um número. " );
		while ( random != num ) {
			num = sc.nextInt();
			if ( comparador ( random , num ) == 1 ) {
				System.out.println ( "| O número aleatório é menor que o inserido |" );
			} else if ( comparador ( random , num ) == 2 ) {
				System.out.println ( "| O número aleatório é maior que o inserido |" );
			}
				contador++;
		}
		System.out.println ( "VOCÊ ACERTOU!!! Você levou " + contador + " tentativas para acertar." );
		sc.close();
	}
	
	public static int comparador ( int randomizado , int num ) {
		int result = 0;
		if ( num != randomizado ) {
			if ( num >= randomizado ) {
				result = 1;
			} else if ( num <= randomizado ) {
				result = 2;
			} 
		} else {
			result = 0;
		}
		return result;	
	}
	
}
