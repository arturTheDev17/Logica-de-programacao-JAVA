package Funcoes3;

import java.util.Scanner;

public class quest1 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		String caracteres = "" ;
		boolean result;
		System.out.println ( "Insira seus caracteres." );
		caracteres = sc.nextLine();
		result = maiusculas ( caracteres );
		if ( result ) {
			System.out.println ( "Todos caracteres alfabéticos existentes em sua frase são minúsculos." );
		} else {
			System.out.println ( "NEM todos caracteres alfabéticos existentes em sua frase são minúsculos." );
		}
		sc.close();
	}
	public static boolean maiusculas ( String caracteres ) {
		boolean minusculo = true;
		
		for ( int posicao = 0 ; posicao < caracteres.length() ; posicao++ ) {
			Character caractere = caracteres.charAt( posicao );
			
			if ( Character.isUpperCase ( caractere ) ) {
				minusculo = false;
				break;
			} 
		}
		
		return minusculo;
	}
}
