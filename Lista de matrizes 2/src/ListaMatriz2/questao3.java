package ListaMatriz2;
import java.util.Scanner;

public class questao3 {

	public static void main ( String [] args ) {
		int M [][] = new int [ 5 ][ 5 ];
		int somaL4 = 0 , somaC2 = 0 , somaPrincipal = 0 , somaSecundaria = 0 , 
			secundariaL = 0 , secundariaC = 4 , soma = 0;
		Scanner sc = new Scanner ( System.in );
		
		for ( int linhas = 0 ; linhas < M.length ; linhas++ ) {
			System.out.println ( "Insira os valores da " + ( linhas + 1 ) + "ª linha: " );
			for ( int colunas = 0 ; colunas < M.length ; colunas++ ) {
				M [ linhas ][ colunas ] = sc.nextInt();
			}
		}
		for ( int linhasSoma = 0 ; linhasSoma < M.length ; linhasSoma++ ) {
			somaL4 = somaL4 + M [ 3 ][ linhasSoma ];  
			somaC2 = somaC2 + M [ linhasSoma ][ 1 ];
			somaSecundaria = somaSecundaria + M [ secundariaL ][ secundariaC ];
			for ( int colunasSoma = 0 ; colunasSoma < M.length ; colunasSoma++ ) {
				if ( colunasSoma == linhasSoma ) {
					somaPrincipal = somaPrincipal + M [ linhasSoma ][ colunasSoma ];
				}
				soma = soma + M [ linhasSoma ][ colunasSoma ];
			}
			secundariaL++; secundariaC--;
		}
		for ( int linhasPrint = 0 ; linhasPrint < M.length ; linhasPrint++ ) {
			System.out.println ();
			for ( int colunasPrint = 0 ; colunasPrint < M.length ; colunasPrint++ ) {
				System.out.print ( M [ linhasPrint ][ colunasPrint ] + "  " );
			}
		}
		System.out.println ( "\nA soma da linha 4 de M | " + somaL4 + " |" );
		System.out.println ( "\nA soma da coluna 2 de M | " + somaC2 + " |" );
		System.out.println ( "\nA soma da diagonal principal de M | " + somaPrincipal + " |" );
		System.out.println ( "\nA soma da diagonal secundária de M | " + somaSecundaria + " |" );
		System.out.println ( "\nA soma de todos valores da matriz M | " + soma + " |" );

		sc.close();
	}

}
