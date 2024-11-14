package atividadeExtra;

import java.util.Scanner;

public class questao1 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		char resposta;
		int contador = 0;
		System.out.println ( "BEM VINDO AO INTERROGATÓRIO" );
		System.out.println ( "• Responda S para sim e N para não." );
		for ( int contadorPergunta = 0 ; contadorPergunta < 5 ; contadorPergunta++ ) {
			switch ( contadorPergunta ) {
			case 0 :
				System.out.println ( "Telefonou para a vítima?" );
				break;
			case 1 :
				System.out.println ( "Esteve no local do crime?" );
				break;
			case 2 :
				System.out.println ( "Mora perto da vítima?" );
				break;
			case 3 :
				System.out.println ( "Devia para a vítima?" );
				break;
			case 4 : 
				System.out.println ( "Já trabalhou com a vítima?" );
			}
			resposta = sc.next().charAt(0);
			if ( detectorDeCrime ( resposta ) == 1 ) {
				contador++;
			}
		}
		if ( contador < 2 ) {
			System.out.println ( "Inocente" );
		} else if ( contador == 2 ) {
			System.out.println ( "Suspeito" );
		} else if ( contador == 3 || contador == 4 ) {
			System.out.println ( "Cúmplice" );
		} else if ( contador >= 5 ) {
			System.out.println ( "Assassino" );
		}
		sc.close();
	}
	
	public static int detectorDeCrime ( int resposta ) {
		int contadorRespostaS = 0;
		if ( resposta == 's' || resposta == 'S' ) {
			contadorRespostaS = 1;
		}
		return contadorRespostaS;
	}
}
