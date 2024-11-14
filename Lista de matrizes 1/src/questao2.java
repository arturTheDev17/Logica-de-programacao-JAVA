
public class questao2 {

	public static void main ( String [] args ) {
		int matriz [][] = new int [ 5 ][ 5 ];
		System.out.println ( "\n0 --> diferente\n1 --> igual" );
		for ( int linhas = 0 ; linhas < 5 ; linhas++ ) {
			System.out.println ( "" );
			for ( int colunas = 0 ; colunas < 5 ; colunas++ ) {
				if ( colunas == linhas ) {
					System.out.print ( ( matriz [ linhas ][ colunas ] + 1 ) + ", " );
				} else {
					System.out.print ( matriz [ linhas ][ colunas ] + ", " );
				}
			}
		}
	}
}
