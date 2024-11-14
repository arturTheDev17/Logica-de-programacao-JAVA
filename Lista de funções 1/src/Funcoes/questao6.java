package Funcoes;

import java.util.Scanner;

public class questao6 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		int numMes;
		System.out.print ( "Insira o número de um mês: " );
		numMes = sc.nextInt();
		sc.close();
		String nomeMes = mes ( numMes );
		System.out.println ( "\n" + numMes + ". | " + nomeMes + " |" );
	}
	public static String mes ( int numMes ) {
		String nomeMeses [] = new String [] 
		{ "Janeiro" , "Fevereiro" , "Março" , "Abril" , "Maio" , "Junho" , "Julho" , "Agosto" , "Setembro" , "Outubro" , "Novembro" , "Dezembro" ,};
		return nomeMeses [ numMes - 1 ];
	}
}
