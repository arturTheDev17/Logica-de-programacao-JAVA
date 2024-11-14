import java.util.Scanner;
public class questao3 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		int matriz [][] = new int [ 4 ] [ 4 ] ;
		for ( int linhasLer = 0 ; linhasLer < matriz.length ; linhasLer++ ) {
			System.out.println ( "Insira os valores da " + ( linhasLer + 1 ) + "ª linha: " );
			for ( int colunasLer = 0 ; colunasLer < matriz.length ; colunasLer++ ) {
				matriz [ linhasLer ] [ colunasLer ] = sc.nextInt() ;
			}
		}
		for ( int linhas = 0 ; linhas < matriz.length ; linhas++ ) {
			System.out.println ( "" );
			for ( int colunas = 0 ; colunas < matriz.length ; colunas++ ) {
				if ( matriz [ linhas ] [ colunas ] < 0 ) {
					matriz [ linhas ] [ colunas ] = 0 ;
					System.out.print ( matriz [ linhas ][ colunas ] + ", " );
				} else {
					System.out.print ( matriz [ linhas ][ colunas ] + ", " );
				}
			}
		}
	sc.close ();
	}

}
