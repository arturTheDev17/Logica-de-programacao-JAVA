package Funcoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class questao7 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		DecimalFormat df = new DecimalFormat ( "###,###,###" );
		int num , result;
		System.out.print ( "Insira um número: " );
		num = sc.nextInt();
		result = fatorial ( num );
		System.out.println ( "O fatorial de " + num + " é:\n" + num + "! = " + df.format( result ) );
		sc.close ();
	}

	public static int fatorial ( int num ) {
		int fatorial = 1;
		for ( ; num > 0 ; num--  ) {
			fatorial = num * fatorial;
		}
		return fatorial;
	}

}
