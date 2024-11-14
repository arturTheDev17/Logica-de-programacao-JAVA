package matriz;
import java.util.Scanner;
public class keanuReeves {

	public static void main ( String [] args ) {
		int matriz [][] = new int [ 4 ][ 4 ];
		Scanner sc = new Scanner ( System.in );
		for ( int linha = 0 ; linha < matriz.length ; linha++ ) {
			for ( int coluna = 0 ; coluna < matriz.length ; coluna++ ) {
				System.out.println ( "Insira um valor:" );
				matriz [ linha ][ coluna ] = sc.nextInt();
			}
		}
		for ( int linhaPrint = 0 ; linhaPrint < matriz.length ; linhaPrint++ ) {
			System.out.println ( "" );
			for ( int colunaPrint = 0 ; colunaPrint < matriz.length ; colunaPrint++ ) {
				if ( colunaPrint + 1 == matriz.length ) {
					System.out.print ( matriz [ linhaPrint ][ colunaPrint ] );
				} else {
					System.out.print ( matriz [ linhaPrint ][ colunaPrint ] + ", " );
				}
			}
		}
		sc.close();
	}

}
