package ListaMatriz2;

import java.util.Scanner;
import java.lang.Math;
public class questao4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in );
		
		int matriz [][] = new int [ 5 ][ 5 ];
		int cubo [][] = new int [ matriz.length ][ matriz.length ];
		
		for ( int linhas = 0 ; linhas < matriz.length ; linhas++ ) {
			System.out.println ( "Insira os valores da " + ( linhas + 1 ) + "ª linha:" );
			for ( int colunas = 0 ; colunas < matriz.length ; colunas++ ) {
				matriz [ linhas ][ colunas ] = sc.nextInt();
				cubo [ linhas ][ colunas ] = ( int ) Math.pow ( matriz [ linhas ][ colunas ] , 3 ) ;
			}
		}
		System.out.print ( "Matriz original e ao lado a matriz ao cubo" );
		for ( int linhasPrint = 0 ; linhasPrint < matriz.length ; linhasPrint++ ) {
			System.out.println ();
			for ( int colunasPrint1 = 0 ; colunasPrint1 < matriz.length ; colunasPrint1++ ) {
				System.out.print ( matriz [ linhasPrint ][ colunasPrint1 ] + "  " );
			}
			System.out.print ( "	 " );
			for ( int colunasPrint2 = 0 ; colunasPrint2 < matriz.length ; colunasPrint2++ ) {
				System.out.print ( cubo [ linhasPrint ][ colunasPrint2 ] + "  "  );
			}
		}
		sc.close();
	}

}
