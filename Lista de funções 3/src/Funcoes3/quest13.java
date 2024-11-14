package Funcoes3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class quest13 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		DecimalFormat df = new DecimalFormat ( "###,###,###" );
		int num , result;
		System.out.print ( "Insira uma posição: " );
		num = sc.nextInt();
		result = fibonacci ( num );
		System.out.println ( "O número na posição " + num + " da sequência de Fibonacci é:\n" + df.format( result ) );
		sc.close ();
	}

	public static int fibonacci ( int num ) {
		int numero1 = 1 , numero2 = 0 , soma = 1;
		for ( int contador = 0 ; num > contador ; contador++  ) {
			soma = numero1 + numero2;
			numero2 = numero1;
			numero1 = soma;
		}
		return soma;
	}
}
