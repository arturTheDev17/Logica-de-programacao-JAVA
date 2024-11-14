package Funcoes;

import java.util.Scanner;

public class questao3 {

	public static void main ( String [] args ) {
	int numero; 
	boolean retorno;
	Scanner sc = new Scanner ( System.in );
	System.out.println ( "Insira um número: " );
	numero = sc.nextInt();
	retorno = par ( numero );
	if ( retorno == true ){
		System.out.println ( "O número é par" );
	} else {
		System.out.println ( "O número é ímpar" );
	}
	sc.close();
	}
	public static boolean par ( int num ) {
		boolean result = false;
		if ( num % 2 == 0 ) {
			result = true;
		} 
		return result;
	}
}
