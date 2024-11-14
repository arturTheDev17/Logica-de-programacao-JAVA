package ListaMatriz2;

public class questao6 {

	public static void main ( String [] args ) {
		int matriz [][] = new int [ 7 ][ 8 ];
		for ( int linhas = 0 ; linhas < matriz.length ; linhas++ ) {
			for ( int colunas = 0 ; colunas < 8 ; colunas++ ) {
				matriz [ linhas ][ colunas ] = ( linhas + 1 ) + ( colunas + 1 );
			}
		}
		for ( int linhasPrint = 0 ; linhasPrint < matriz.length ; linhasPrint++ ) {
			System.out.println ();
			System.out.print ( "| " );
			for ( int colunasPrint = 0 ; colunasPrint < 8 ; colunasPrint++ ) {
				if ( matriz [ linhasPrint ][ colunasPrint ] < 10 ) {
					System.out.print ( 0 );
				}
				System.out.print ( matriz [ linhasPrint ][ colunasPrint ] + " | " );
			}
		}
	}

}
