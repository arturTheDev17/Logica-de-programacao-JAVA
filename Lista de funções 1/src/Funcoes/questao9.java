package Funcoes;

import java.util.Scanner;

public class questao9 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		float altura , peso , result ;
		char genero = ' ';
		int idade;
		
		System.out.println ( "Insira seu gênero.\n| M | Masculino\n| F | Feminino " );
		genero = sc.next().charAt(0);
		System.out.println ( "Insira sua altura em cm" );
		altura = sc.nextFloat();
		System.out.println ( "Insira seu peso em Kg" );
		peso = sc.nextFloat();
		System.out.println( "Insira sua idade" );
		idade = sc.nextInt();
		
		result = funcaoGeb ( altura , peso , genero , idade ); 
		System.out.println ( result + " Kcal" );
		
		sc.close();
	}
	public static float funcaoGeb ( float altura , float peso , char genero , int idade ) {
		float resultado = 0;
		if (genero == 'M' || genero == 'm' ) {
			resultado = 66.47f + ( 13.75f * peso ) + ( 5 * altura ) - ( 6.76f * idade );
		} else if ( genero == 'F' || genero == 'f' ) {
			resultado = 655.1f + ( 9.56f * peso ) + ( 1.85f * altura ) - ( 4.67f * idade );
		}
		return resultado;
	}
}
