package procedures;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class questao2Longa {
	
	public static void main ( String [] args ) {
		
		int ano = 0 , mes = 0 , dia = 0 , nDias, erro = -1; 
		Scanner sc = new Scanner ( System.in );
		while ( erro != 0 ) {
			System.out.println ( "Insira o ano atual: " );
			ano = sc.nextInt();
			if ( ano > 0 ) {
				erro = 0;
			} else {
				System.out.println ( "ERRO. Valor para ano inválido. Insira novamente." );
			}
		}
		erro = -1;
		while ( erro != 0 ) {
			System.out.println ( "Insira o mês atual: " );
			mes = sc.nextInt();
			if ( mes > 0 && mes < 13 ) {
				erro = 0;
			} else {
				System.out.println ( "ERRO. Valor para mês inválido. Insira novamente." );
			}
		}
		erro = -1;
		while ( erro != 0 ) {
			System.out.println ( "Insira o dia de hoje: " );
			dia = sc.nextInt();
			if ( dia > 0 ) {
				if ( mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia < 32 ) {
					erro = 0;
				} else if ( mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia < 31 ) {
					erro = 0;
				} else if ( mes == 2 ) {					
					if ( ( ano % 400 == 0 ) || ( ( ano % 4 == 0 ) && ( ano % 100 != 0 ) ) && dia < 30 ){
						erro = 0;
					}
					else if ( dia < 29 ) {
						erro = 0;
					}
				}
			} else {
				System.out.println ( "ERRO. Valor para dia inválido. Insira novamente." );
			}
		}
		System.out.println( "Insira a quantidade de dias: " );
		nDias = sc.nextInt();
		System.out.println ( "Escolha a língua que gostaria de imprimir o dia da semana:\n| 1 | Português;\n| 2 | Inglês;\n| 3 | Francês;\n| 4 | Espanhol;\n| 5 | Alemão;\n| 6 | Italiano;" );
		int lingua = sc.nextInt();
		calendario ( dia , mes , ano , nDias , lingua );
		
		sc.close();
	}
	public static void calendario ( int dia , int mes , int ano , int nDias , int lingua ) {
		
		LocalDate data = LocalDate.of ( ano, mes, dia );
		LocalDate novaData = data.plusDays ( nDias );
		DateTimeFormatter formatada = DateTimeFormatter.ofPattern ( "dd/MM/yyyy" );
		String valorFormatado = novaData.format( formatada );
		DayOfWeek diaDaSemana = novaData.getDayOfWeek();
		int numeroSemana = diaDaSemana.getValue() - 1;
		
		switch ( lingua ) {
		case 1 :
			String portugues [] = new String [ ] 
					{ "Segunda-Feira" , "Terça-Feira" , "Quarta-Feira" , "Quinta-Feira" , "Sexta-Feira" , "Sábado" , "Domingo" };
			System.out.println ( valorFormatado + " (" + portugues [ numeroSemana ] + ")" );
			break;
		case 2 :
			String ingles [] = new String [ ]
					{ "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday" , "Sunday"  };
			System.out.println ( valorFormatado + " (" + ingles [ numeroSemana ] + ")" );
			break;
		case 3 :
			String frances [] = new String [ ]
					{ "Lundi" , "Mardi" , "Mercredi" , "Jeudi" , "Vendredi" , "Samedi" , "Dimanche"  };
			System.out.println ( valorFormatado + " (" + frances [ numeroSemana ] + ")" );
			break;
		case 4 :
			String espanhol [] = new String [ ]
					{ "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"  };
			System.out.println ( valorFormatado + " (" + espanhol [ numeroSemana ] + ")" );
			break;
		case 5 :
			String alemao [] = new String [ ]
					{ "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"  };
			System.out.println ( valorFormatado + " (" + alemao [ numeroSemana ] + ")" );
			break;
		case 6 :
			String italiano [] = new String [ ]
					{ "Lunedì" , "Martedì" , "Mercoledì" , "Giovedì" , "Venerdì" , "Sabato" , "Domenica"  };
			System.out.println ( valorFormatado + " (" + italiano [ numeroSemana ] + ")" );
			break;
		}
	}
}