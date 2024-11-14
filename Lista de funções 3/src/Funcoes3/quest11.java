package Funcoes3;

import java.util.Scanner;

public class quest11 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );

		String texto, criptografado;
		int casas;

		System.out.println ( "Informe um texto:" );
		texto = sc.nextLine ();

		System.out.println ( "\nInforme quantas posições serão puladas: " );
		casas = sc.nextInt();

		criptografado = criptografa ( texto, casas );

		System.out.println ( criptografado );
		sc.close ();
	}

	public static String criptografa ( String texto , int casas ) {
		int tamanho = texto.length(), letra;
		StringBuilder auxiliar = new StringBuilder();

		for ( int contador = 0; contador < tamanho; contador++ ) {
			letra = ( ( int ) texto.charAt ( contador )) + casas;
			Character caracter = ( char ) (letra - casas );
			
			if ( letra - casas == 32 ) {
				letra = 32;
			}
			
			if ( Character.isLowerCase ( caracter ) ) {

				while ( letra > 122 ) {
					letra -= 26;
				}
			}
			
			if ( Character.isUpperCase (caracter) ) {

				while ( letra > 90 ) {
					letra -= 26;
				}
			}

			auxiliar.append ( (char) letra );
		} 

		return auxiliar.toString();
	}

}
