package Funcoes;

import java.util.Scanner;

public class questao5 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		int year; 
		boolean result;
		System.out.println ( "Insira um ano" );
		year = sc.nextInt();
		sc.close();
		result = bissexto ( year );
		if ( result == true ) {
			System.out.println ( "O ano é bissexto." );
		} else {
			System.out.println ( "O ano não é bissexto." );
		}
	}
	public static boolean bissexto ( int ano ) {
		boolean retorno = false;;
		if ( ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0  ) {
			retorno = true;
		} 
		return retorno;
	}
}
