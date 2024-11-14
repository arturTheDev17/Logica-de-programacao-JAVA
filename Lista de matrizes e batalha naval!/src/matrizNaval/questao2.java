package matrizNaval;

import java.util.Scanner;

public class questao2 {
	// Realize a transposição de uma matriz. 
	// A transposta de uma matriz A é obtida trocando as linhas pelas colunas.
	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		int qlinhas , qcolunas;
		System.out.print ( "• Insira a quantidade de linhas: " );
		qlinhas = sc.nextInt();
		System.out.print ( "• Insira a quantidade de colunas: " );
		qcolunas = sc.nextInt();
		int matriz [][] = new int [ qlinhas ][ qcolunas ];
		int matrizTransposta [][] = new int [ qcolunas ][ qlinhas ];
		for ( int linhas = 0 ; linhas < qlinhas ; linhas++ ) {
			for ( int colunas = 0 ; colunas < qcolunas ; colunas++ ) {
				System.out.println ( "Insira o número presente na linha " + linhas + " e coluna " + colunas );
				matriz [ linhas ] [ colunas ] = sc.nextInt();
				matrizTransposta [ colunas ][ linhas ] = matriz [ linhas ][ colunas ];
			}
		}
		for ( int linhasPrint = 0 ; linhasPrint < qlinhas ; linhasPrint++ ) {
			System.out.println ();
			for ( int colunasPrint = 0 ; colunasPrint < qcolunas ; colunasPrint++ ) {
				System.out.print ( matriz [ linhasPrint ][ colunasPrint ] + "  " );
			}
		}
		System.out.println ();
		for ( int linhasPrint = 0 ; linhasPrint < qcolunas ; linhasPrint++ ) {
			System.out.println ();
			for ( int colunasPrint = 0 ; colunasPrint < qlinhas ; colunasPrint++ ) {
				System.out.print ( matrizTransposta [ linhasPrint ][ colunasPrint ] + "  " );
			}
		}
		System.out.println ( "\n\n--FIM--" );
		sc.close();
	}

}
