package VetoresR;

import java.util.Scanner;

public class questao4 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		int vetor [] = new int [ 30 ];
		int maior = -999999 , menor = 999999 , soma = 0 ; 
		float media;
		int contador; 
		for ( contador = 0 ; contador < vetor.length ; contador++ ) {
			System.out.println ( "Insira um valor: " );
			vetor [ contador ] = sc.nextInt();
			if ( vetor [ contador ] < menor ) {
				menor = vetor [ contador ];
			}
			if ( vetor [ contador ] > maior ) {
				maior = vetor [ contador ];
			}
			soma = soma + vetor [ contador ];
		}
		media = soma / contador;
		System.out.println ( "Números pares:" );
		for ( int print1 = 0 ; print1 < vetor.length ; print1++ ) {
			if ( vetor [ print1 ] % 2 == 0 ) {
				System.out.print ( vetor [ print1 ] + ", " );
			}
		}
		System.out.println ( "\nMaior Número: " + maior );
		System.out.println ( "Menor Número: " + menor );
		System.out.println ( "Números acima da média: " );
		for ( int print2 = 0 ; print2 < vetor.length ; print2++ ) {
			if ( ( float ) vetor [ print2 ] > media ) {
				System.out.print ( vetor [ print2 ] + ", " );
			}
		}

		sc.close();

	}

}
