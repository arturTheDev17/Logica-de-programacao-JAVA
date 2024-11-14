package VetoresR;

import java.util.Scanner;

public class questao3 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		int vetor [] = new int [ 10 ];
		int estante , indice = 0 , indiceMax = ( vetor.length - 1 );
		for ( int insira = 0 ; insira < vetor.length ; insira++ ) {
			System.out.println ( "Insira o " + ( insira + 1 ) + "º valor: " );
			vetor [ insira ] = sc.nextInt();
		}
		System.out.println ( "\nVetor original:" );
		for ( int print = 0 ; print < vetor.length ; print++ ) {
			System.out.print ( vetor [ print ] + ", " );
		}
		for ( int inverter = 0 ; inverter < vetor.length ; inverter++ ) {
			estante = vetor [ indice ];
			for ( int troca = 0 ; troca <= indiceMax ; troca++ ) {
				if ( ( troca ) > 0 ) {
					vetor [ troca - 1 ] = vetor [ troca ];
				}
			}
			vetor [ indiceMax ] = estante;
			
			indiceMax--;
		}
		System.out.println ( "\nVetor invertido:" );
		for ( int printInvr = 0 ; printInvr < vetor.length ; printInvr++ ) {
			System.out.print ( vetor [ printInvr ] + ", " );
		}
	}

}
