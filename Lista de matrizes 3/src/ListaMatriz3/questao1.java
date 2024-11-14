package ListaMatriz3;

import java.util.Scanner;

public class questao1 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		int matriz [][] = new int [ 4 ] [ 4 ];
		for ( int lerLinhas = 0 ; lerLinhas < matriz.length ; lerLinhas++ ) {
			System.out.println ( "Inserir os valores da " + ( lerLinhas + 1 ) + "ª linha: " );
			for ( int lerColunas = 0 ; lerColunas < matriz.length ; lerColunas++ ) {
				matriz [ lerLinhas ] [ lerColunas ] = sc.nextInt() ;
			}
		}
		System.out.print ( "\nOs elementos da diagonal principal: " );
		for ( int linhas = 0 ; linhas < matriz.length ; linhas++ ) {
			System.out.println ( "" );
			for ( int colunas = 0 ; colunas < matriz.length ; colunas++ ) {
				if ( linhas == colunas ) {
					System.out.print ( matriz [ linhas ][ colunas ] + "  " );
				} else {
					System.out.print ( "   " );
				}
			}
		}
		System.out.print ( "\nTodos os elementos, exceto os elementos da diagonal principal: " );
		for ( int linhasDif = 0 ; linhasDif < matriz.length ; linhasDif++ ) {
			System.out.println ( "" );
			for ( int colunasDif = 0 ; colunasDif < matriz.length ; colunasDif++ ) {
				if ( linhasDif != colunasDif ) {
					System.out.print ( matriz [ linhasDif ][ colunasDif ] + "  " );
				} else {
					System.out.print ( "   " );
				}
			}
		}
		sc.close();
	}

}
