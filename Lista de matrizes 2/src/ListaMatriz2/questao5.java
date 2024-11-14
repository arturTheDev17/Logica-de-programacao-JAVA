package ListaMatriz2;

import java.util.Scanner;

public class questao5 {

	public static void main ( String [] args ) {
		float matriz [][] = new float [ 3 ][ 4 ];
		Scanner sc = new Scanner ( System.in );
		for ( int linhas = 0 ; linhas < 3 ; linhas++ ) {
			System.out.println ( "Insira os valores da " + ( linhas + 1 ) + "ª linha:" );
			for ( int colunas = 0 ; colunas < 4 ; colunas++ ) {
				matriz [ linhas ][ colunas ] = sc.nextFloat();
			}
		}
		System.out.println ( "• Elemento do canto superior esquerdo: " + matriz [ 0 ][ 0 ] );
		System.out.println ( "• Elemento do canto inferior esquerdo: " + matriz [ 2 ][ 0 ] );
		sc.close();
	}

}
