package Lista;

import java.util.Scanner;

public class numero1 {
	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		int inicial , posicaoFinal , passo ;
		System.out.println ( "Insira a posição inicial." );
		inicial = sc.nextInt();
		System.out.println ( "Insira a posição final." );
		posicaoFinal = sc.nextInt();
		System.out.println ( "Insira a distância fixa percorrida por passo." );
		passo = sc.nextInt();
		sc.close();
		System.out.println ( atravessaRua ( inicial , posicaoFinal , passo ) + " Passos." );
	}
	public static int atravessaRua ( int X , int Y , int Z ) {
		int nPassos = 0;
		while ( X < Y ) {
			X = X + Z;
			nPassos++;
		}
		return nPassos;
	}
}
