package Funcoes3;

import java.util.Scanner;

public class quest4 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		int numero , caracteres;
		System.out.println ( "Insira um número" );
		numero = sc.nextInt();
		caracteres = transforma ( numero );
		System.out.println ( "Quantidade de caracteres: | " + caracteres + " |" );
		sc.close();
	}
	public static int transforma ( int num ) {
		int caracteres;
		String numero = Integer.toString( num );
		caracteres = numero.length();
		return caracteres;
	}
}
