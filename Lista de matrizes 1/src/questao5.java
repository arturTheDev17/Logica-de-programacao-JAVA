import java.util.Scanner;

public class questao5 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		int matriz [][] = new int [ 4 ] [ 4 ];
		for ( int linhasLer = 0 ; linhasLer < matriz.length ; linhasLer++ ) {
			System.out.println ( "Insira os valores da " + ( linhasLer + 1 ) + "ª linha: " );
			for ( int colunasLer = 0 ; colunasLer < matriz.length ; colunasLer++ ) {
				matriz [ linhasLer ] [ colunasLer ] = sc.nextInt() ;
			}
		}
		System.out.print ( "\nElementos da diagonal principal: " );
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
		System.out.print ( "\nElementos, exceto os elementos da diagonal principal: " );
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
