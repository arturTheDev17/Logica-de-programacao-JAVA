package procedures;

import java.util.Scanner;
import java.time.LocalDate;

public class questao2 {

	public static void main ( String [] args ) {
		int ano , mes , dia , nDias; 
		Scanner sc = new Scanner ( System.in );
		System.out.println ( "Insira o ano atual: " );
		ano = sc.nextInt();
		System.out.println ( "Insira o mês atual: " );
		mes = sc.nextInt();
		System.out.println ( "Insira o dia de hoje: " );
		dia = sc.nextInt();
		System.out.println( "Insira a quantidade de dias: " );
		nDias = sc.nextInt();
		calendario ( dia , mes , ano , nDias );
		sc.close();
	}
	public static void calendario ( int dia , int mes , int ano , int nDias ) {
		String diaSemana [] = new String [ ] 
		{ "Domingo" , "Segunda-Feira" , "Terça-Feira" , "Quarta-Feira" , "Quinta-Feira" , "Sexta-Feira" , "Sábado" };
	}
}
