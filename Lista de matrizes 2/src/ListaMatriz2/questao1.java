package ListaMatriz2;
import java.util.Scanner;

public class questao1 {

	public static void main	( String [] args ) {
		int matriz [][] = new int [ 5 ][ 5 ];
		int somaPares = 0 , contador = 0;
		float media ;
		Scanner sc = new Scanner ( System.in );
		for ( int linhas = 0 ; linhas < matriz.length ; linhas++ ) {
			for ( int colunas = 0 ; colunas < matriz.length ; colunas++ ) {
				System.out.println ( "Insira o " + ( linhas + 1 ) + "º valor da " + ( colunas + 1 ) + "ª coluna:"  );
				matriz [ linhas ][ colunas ] = sc.nextInt();
				if ( matriz [ linhas ][ colunas ] % 2 == 0 ) {
					somaPares = somaPares + matriz [ linhas ][ colunas ];
					contador++;
				}
			}
		}
		System.out.println( "\nA matriz:" );
		for ( int linhasPrint = 0 ; linhasPrint < matriz.length ; linhasPrint++ ) {
			System.out.println ();
			for ( int colunasPrint = 0 ; colunasPrint < matriz.length ; colunasPrint++ ) {
				System.out.print ( matriz [ linhasPrint ][ colunasPrint ] + "  " );
			}
		}
		media = ( float ) somaPares / ( float ) contador;
		System.out.println ( "\nMédia dos seus pares: | " + media + " |" );
		sc.close();
	}
}
