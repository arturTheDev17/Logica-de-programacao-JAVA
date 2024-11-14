package ListaMatriz2;
import java.util.Scanner;

public class questao2 {

	public static void main ( String [] args ) {
		
		int matriz [][] = new int [ 7 ][ 4 ];
		int menorValor = 99999 , menorC = 0 , menorL = 0;
		Scanner sc = new Scanner ( System.in );
		
		for ( int linhas = 0 ; linhas < 7 ; linhas++ ) {
			for ( int colunas = 0 ; colunas < 4 ; colunas++ ) {
				System.out.println ( "Favor inserir o " + ( linhas + 1 ) + "º valor da " + ( colunas + 1 ) + "ª coluna:"  );
				matriz [ linhas ][ colunas ] = sc.nextInt();
				if ( matriz [ linhas ][ colunas ] < menorValor ) {
					menorValor = matriz [ linhas ][ colunas ];
					menorL = linhas;
					menorC = colunas;
				}
			}
		}
		System.out.println ( "O menor valor encontrado foi " + menorValor + " que está na " + ( menorL + 1 ) + "ª linha e " + ( menorC + 1) + "ª coluna." );
		sc.close();
	}

}
