package matrizNaval;

import java.util.Scanner;

public class questao1 {
	//Calcule a soma dos elementos das diagonais principal e secundária de uma matriz quadrada.

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		int numb;
		System.out.println ( "Insira o tamanho da matriz: " );
		numb = sc.nextInt();
		int matriz [][] = new int [ numb ][ numb ] , somaPrincipal = 0 , somaSecundaria = 0;
		for ( int linhas = 0 ; linhas < numb ; linhas++ ) {
			for ( int colunas = 0 ; colunas < numb ; colunas++ ) {
				System.out.println ( "Insira o número presente na linha " + linhas + " e coluna " + colunas );
				matriz [ linhas ] [ colunas ] = sc.nextInt();  
			}
		}
		for ( int linhasPrint = 0 ; linhasPrint < numb ; linhasPrint++ ) {
			System.out.println ();
			for ( int colunasPrint = 0 ; colunasPrint < numb ; colunasPrint++ ) {
				System.out.print ( matriz [ linhasPrint ][ colunasPrint ] + "  " );
			}
		}
		
		for ( int linhasSoma = 0 ; linhasSoma < numb ; linhasSoma++ ) {
			somaSecundaria = somaSecundaria + matriz [ linhasSoma ][ ( numb - 1 ) - linhasSoma ];
			for ( int colunasSoma = 0 ; colunasSoma < numb ; colunasSoma++ ) {
				if ( linhasSoma == colunasSoma ) {
					somaPrincipal = somaPrincipal + matriz [ linhasSoma ][ colunasSoma ];
				}
			}
		}
		System.out.println ( "\n\nSoma principal | " + somaPrincipal + " |" );
		System.out.println ( "Soma secundária | " + somaSecundaria + " |" );
		System.out.println ( "\n--FIM--" );
		sc.close();
	}

}
