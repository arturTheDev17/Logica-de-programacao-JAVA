package Funcoes;

import java.util.Scanner;

public class questao4 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in ); 
		int numero , multiplo ; 
		boolean result ;
		System.out.print ( "Insira um número: " );
		multiplo = sc.nextInt();
		System.out.print ( "Insira outro número: " );
		numero = sc.nextInt();
		result = multiplo ( multiplo , numero );
		if ( result == false ) {
			System.out.println ( "O primeiro valor não é múltiplo do segundo." );
		} else {
			System.out.println ( "O primeiro valor é múltiplo do segundo." );
		}
		sc.close();
	}
	public static boolean multiplo ( int num1 , int num2 ) {
		boolean retorno = false;
		if ( num1 % num2 == 0  ) {
			retorno = true;
		}
		return retorno;
	}
}
