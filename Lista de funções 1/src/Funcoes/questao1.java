package Funcoes;

import java.util.Scanner;

public class questao1 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		int numero , result ;
		System.out.print ( "Insira o número que desejas para montar uma tabuada: " );
		numero = sc.nextInt();
		System.out.println ( "\n------ TABUADA ------" );
		for ( int contador = 1 ; contador <= 10 ; contador++ ) {
			result = calculadora ( numero , contador );
			System.out.println ( "  " + numero + " X " + ( contador ) + " = " + result );
		}
		sc.close();
	}
	
	public static int calculadora ( int num , int contador ) {
		int tabuada = num * contador ;
		return tabuada ;
	}
}
