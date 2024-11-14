package Funcoes3;

import java.util.Scanner;

public class quest2 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		boolean result;
		System.out.println ( "Insira a primeira frase: " );
		String frase1 = sc.nextLine();
		System.out.println ( "Insira a segunda frase: " );
		String frase2 = sc.nextLine();
		
		result = comparaFrases ( frase1 , frase2 );
		System.out.println ( result );
		sc.close();
	}
	public static boolean comparaFrases ( String comparando , String comparada ) {
		boolean igual = false;
		String parametro;
		if ( comparando.length() < comparada.length() ) {
			parametro = comparando;
		} else {
			parametro = comparada;
		}
		
		for ( int posicao = 0 ; posicao < parametro.length() ; posicao++ ) {
			Character caractere1 = comparando.charAt( posicao );
			Character caractere2 = comparada.charAt( posicao );
			
			if ( caractere1 == caractere2 && comparando.length() == comparada.length() ) {
				igual = true;
			}
			else {
			}
		}
		return igual;
	}
}
