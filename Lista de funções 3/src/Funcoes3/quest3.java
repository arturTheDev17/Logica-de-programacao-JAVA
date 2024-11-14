package Funcoes3;

import java.util.Scanner;

public class quest3 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		String texto;
		int result;
		System.out.println ( "Insira seus caracteres." );
		texto = sc.nextLine();
		result = comparaNumeroLetra ( texto );
		sc.close();
		if ( result == -1 ) {
			System.out.println ( "Existe na cadeia pelo menos um caractere que não seja um caractere numérico e alfabético." );
		} else if ( result == 0 ) {
			System.out.println ( "A quantidade de caracteres numéricos da cadeia for maior ou igual a quantidade de caracteres alfabéticos." );
		} else if ( result == 1 ) {
			System.out.println ( "A quantidade de caracteres alfabéticos da cadeia for maior que quantidade de caracteres numéricos." );
		}
	}
	public static int comparaNumeroLetra ( String frase ) {
		int resposta = 2 , contadorNumero = 0 , contadorLetra = 0;
		for ( int posicao = 0 ; posicao < frase.length() ; posicao++ ) {
			Character caractere = frase.charAt ( posicao );
			if ( Character.isLetter ( caractere ) == false && Character.isDigit ( caractere ) == false ) {
				resposta = -1;
			}
			
			if ( Character.isLetter ( caractere )  ) {
				contadorLetra++;
			} else if ( Character.isDigit ( caractere ) ) {
				contadorNumero++;
			}
		}
		if ( resposta != -1 ) {
			if ( contadorNumero >= contadorLetra ) {
				resposta = 0;
			} else if ( contadorNumero < contadorLetra ) {
				resposta = 1;
			}
		}
		
		return resposta;
	}
}
