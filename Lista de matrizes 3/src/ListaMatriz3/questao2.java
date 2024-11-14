package ListaMatriz3;

import java.util.Scanner;

public class questao2 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		int linhas , colunas;
		System.out.println ( "Insira um valor inteiro: " );
		linhas = sc.nextInt();
		colunas = linhas;
		int matriz [][] = new int [ linhas ][ colunas ];
		
		for ( int contadorLinhas = 0 ; contadorLinhas < linhas ; contadorLinhas++ ) {
			for ( int contadorColunas = 0 ; contadorColunas < colunas ; contadorColunas++ ) {
				if ( contadorLinhas == 0 || contadorLinhas == ( linhas - 1 ) ) {
					if ( contadorColunas == 0 || contadorColunas == ( colunas - 1 ) ) {
						matriz [ contadorLinhas ][ contadorColunas ] = 1;
					}
				}
				if ( contadorLinhas > 0 && contadorLinhas < ( linhas - 1 ) ) {
					if ( contadorColunas > 0 && contadorColunas < ( colunas - 1 ) ) {
						matriz [ contadorLinhas ][ contadorColunas ] = 1;
					}
				}
			}
		}
		for ( int linhasPrint = 0 ; linhasPrint < linhas ; linhasPrint++ ) {
			System.out.println ();
			for ( int colunasPrint = 0 ; colunasPrint < colunas ; colunasPrint++ ) {
				if ( matriz [ linhasPrint ][ colunasPrint ] == 1  ) {
					System.out.print ( "▪ " );
				} else if ( matriz [ linhasPrint ][ colunasPrint ] == 0 ) {
					System.out.print ( "▫ " );
				}
			}
		}
		sc.close();
	}

}
