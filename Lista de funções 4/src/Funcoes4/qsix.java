package Funcoes4;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class qsix {

	public static void main ( String [] args ) {
		int ano = 0 , mes = 0 , dia = 0 , nDias; 
		ano = ano ();
		mes = mes ();
		dia = dia ( mes , ano );
		LocalDate data = LocalDate.of ( ano, mes, dia );
		System.out.println ( dia + "/" + mes + "/" );
	}
	public static int ano ( ) {
		Scanner sc = new Scanner ( System.in );
		int ano;
		boolean erro = true;
		while ( erro ) {
			System.out.println ( "Insira o ano atual: " );
			ano = sc.nextInt();
			if ( ano > 0 ) {
				return ano;
			} else {
				System.out.println ( "ERRO. Valor para ano inválido. Insira novamente." );
			}
		}
		return 0;
	}
	public static int mes ( ) {
		Scanner sc = new Scanner ( System.in );
		int mes;
		boolean erro = true;
		while ( erro ) {
			System.out.println ( "Insira o mês atual: " );
			mes = sc.nextInt();
			if ( mes > 0 && mes < 13 ) {
				return mes;
			} else {
				System.out.println ( "ERRO. Valor para mês inválido. Insira novamente." );
			}
		}
		return 0;
	}
	public static int dia ( int mes , int ano ) {
		Scanner sc = new Scanner ( System.in );
		boolean erro = true;
		int dia;
		while ( erro ) {
			System.out.println ( "Insira o dia de hoje: " );
			dia = sc.nextInt();
			if ( dia > 0 && dia < 32  ) {
				if ( mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia < 32 ) {
					return dia;
				} else if ( mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia < 31 ) {
					return dia;
				} else if ( mes == 2 ) {					
					if ( ( ano % 400 == 0 ) || ( ( ano % 4 == 0 ) && ( ano % 100 != 0 ) ) && dia < 30 ){
						return dia;
					}
					else if ( dia < 29 ) {
						return dia;
					}
				}
			} else {
				System.out.println ( "ERRO. Valor para dia inválido. Insira novamente." );
			}
		}
		return 0;
	}
}