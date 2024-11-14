package Funcoes3;

import java.util.Scanner;

public class quest10 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		float altura , peso , imc;
		System.out.println ( "Insira seu peso em Kg" );
		peso = sc.nextFloat();
		System.out.println ( "Insira sua altura em cm" );
		altura = sc.nextFloat() / 100;
		System.out.println ( imcCalc ( peso , altura ) );
		sc.close();
	}
	public static String imcCalc ( float peso , float altura ) {
		String pesos [] = new String [  ] 
		{ "Menos de 20 | Magro |" , "20 – 24 | Normal |" , "25 – 29 | Acima do peso |" , "30 – 34 | Obeso |" , "Acima de 34 | Muito Obeso |" };
		int result = 0;
		float imc = peso / ( altura * altura );
		if ( imc < 20 ) {
		} else if ( imc <= 24 ) {
			result = 1;
		} else if ( imc <= 29 ) {
			result = 2;
		} else if ( imc <= 34 ) {
			result = 3;
		} else if ( imc > 34 ) {
			result = 4;
		}
		return pesos [ result ];
	}
}
