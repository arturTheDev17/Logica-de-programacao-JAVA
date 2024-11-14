package Funcoes4;

import java.util.Scanner;

public class qfour {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		System.out.println ( "Insira um número: " );
		int num = sc.nextInt();
		System.out.println ( reversorDeNumero ( num ) );
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
