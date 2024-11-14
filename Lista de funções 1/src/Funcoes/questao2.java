package Funcoes;

import java.util.Scanner;

public class questao2 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		int inteiro , absoluto;
		System.out.print ( "Insira um inteiro qualquer: " );
		inteiro = sc.nextInt();
		absoluto = absolutador ( inteiro );
		System.out.println ( "Esse inteiro em sua forma absoluta é : | " + absoluto + " |" );
		sc.close();
	}
	public static int absolutador ( int num ) {
		int absoluto;
		if ( num < 0 ) {
			absoluto = num * -1;
		} else {
			absoluto = num;
		}
		return absoluto;
	}
}
