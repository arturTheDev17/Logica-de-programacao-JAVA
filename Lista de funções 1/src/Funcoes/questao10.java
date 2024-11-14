package Funcoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class questao10 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		DecimalFormat df = new DecimalFormat ("#.###");
		float altura , result = 0;
		char genero;
		
		System.out.println ( "Insira seu gênero:\n| M | Masculino\n| F |Feminino " );
		genero = sc.next().charAt(0);
		System.out.print ( "Insira sua altura em cm: " );
		altura = sc.nextFloat() / 100;
		if ( genero == 'm' || genero == 'M' ) {
			result = pesoIdeal ( true , altura );
		} else if ( genero == 'F' || genero == 'f' ) {
			result = pesoIdeal ( false , altura );
		}
		System.out.println (  df.format ( result ) + " Kg" );
		sc.close();
	}
	
	public static float pesoIdeal ( boolean genero , float alt ) {
		
		float ideal = 0;
		if ( genero == true ) {
			ideal = ( 72.7f * alt ) - 58f;
			
		} else if ( genero == false ) {
			ideal =  ( 62.1f * alt ) - 44.7f;
			
		}
		return ideal;
	}
}