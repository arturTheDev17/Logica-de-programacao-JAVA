package Funcoes4;

import java.util.Scanner;

public class qthree {

	public static void main ( String [] args ) {
		int num;
		Scanner sc = new Scanner ( System.in );
		System.out.println ( "Insira um número: " );
		num = sc.nextInt();
		System.out.println ( contaCasas ( num ) );
		sc.close();
	}
	public static int contaCasas ( Integer numero ) {
		int casas;
		if ( numero < 0 ) {
			numero *= -1;
		}
		String num = numero.toString();
		casas = num.length();
		return casas;
	}
}
