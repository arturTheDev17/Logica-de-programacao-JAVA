import java.util.Scanner;
public class questao4 {
	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in ) ;
		int matriz [][] = new int [ 6 ][ 6 ];
		int x , contador = 0;
		for ( int linhasLer = 0 ; linhasLer < matriz.length ; linhasLer++ ) {
			System.out.println ( "Insira os valores da " + ( linhasLer + 1 ) + "ª linha: " );
			for ( int colunasLer = 0 ; colunasLer < matriz.length ; colunasLer++ ) {
				matriz [ linhasLer ] [ colunasLer ] = sc.nextInt() ;
			}
		}
		System.out.println ( "Insira agora o valor de X: " );
		x = sc.nextInt();
		for ( int linhasProcura = 0 ; linhasProcura < matriz.length ; linhasProcura++ ) {
			for ( int colunasProcura = 0 ; colunasProcura < matriz.length ; colunasProcura++ ) {
				if ( matriz [ linhasProcura ] [ colunasProcura ] == x ) {
					System.out.println ( "O valor X, que é " + x + " está presente na " + ( linhasProcura + 1 ) + "ª linha e " + ( colunasProcura + 1 ) + "ª coluna." );
					contador++;
				}
			}
		}
		if ( contador == 0 ) {
			System.out.println ( "Valor não encontrado..." );
		}
		sc.close ();
	}
}
