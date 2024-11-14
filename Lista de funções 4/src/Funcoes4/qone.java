package Funcoes4;

import java.util.Scanner;

public class qone {

	public static void main ( String [] args ) {
		int horas , minutos , loop = -1;
		String horario [] = new String [ 3 ];
		Scanner sc = new Scanner ( System.in );
		while ( loop != 0 ) {
			System.out.println ( "Insira 0 para parar. " );
			loop = sc.nextInt();
			if ( loop != 0 ) {
				System.out.println ( "Insira o horário no formato 24h.\nPrimeiro as horas:" );
				do {
					horas = sc.nextInt();
					if ( horas < 0 || horas > 23 ) {
						System.out.println ( "ERRO. Horário inválido. Insira novamente." );
					}
				} while ( horas < 0 || horas > 23 );
				System.out.println ( "Depois os minutos:" );
				
				do {
					minutos = sc.nextInt();
					if ( minutos < 0 || minutos > 59 ) {
						System.out.println ( "ERRO. Horário inválido. Insira novamente." );
					}
				} while ( minutos < 0 || minutos > 59 );

				horario = formatador ( horas , minutos );
				print ( horario );
			}
		}
		sc.close();
	}
	public static String [] formatador ( Integer hora , Integer minuto ) {
		
		String vetorHorario [] = new String [ 3 ];
		String formatted = String.format ("%02d", minuto );
		if ( hora < 12 || hora == 0 ) {
			vetorHorario [ 2 ] = " A.M" ;
		} else if ( hora >= 12 && hora != 0 ) {
			vetorHorario [ 2 ] = " P.M" ;
		}
		if ( hora > 12 ) {
			hora = hora - 12;
		}
		if ( hora == 0 ) {
			hora = 12;
		}	
		vetorHorario [ 0 ] = hora.toString() ;
		if ( minuto < 10 ) {
			vetorHorario [ 1 ] = formatted;
		} else {
			vetorHorario [ 1 ] = minuto.toString();
		}
			
		return vetorHorario;
	}
	public static void print ( String [] horario ) {
			
		System.out.println ( horario [ 0 ] + ":" + horario [ 1 ] + horario [ 2 ] );

	}
}