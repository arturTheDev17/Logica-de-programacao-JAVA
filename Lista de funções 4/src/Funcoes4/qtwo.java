package Funcoes4;

import java.util.Scanner;

public class qtwo {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		float valor = -1 , valoresParcelas = 0;
		int diasAtraso , contador = 0;
		while ( valor != 0 ) {
			System.out.println ( "Insira o valor da prestação: (Insira 0 para parar o programa)" );
			valor = sc.nextFloat();
			if ( valor != 0 ) {
				System.out.println ( "Insira a quantidade de dias com atraso: " );
				diasAtraso = sc.nextInt();
				valoresParcelas = valoresParcelas + valorPagamento ( valor, diasAtraso );
				contador++;
			}
		}
		System.out.println ( "\n----- RELATÓRIO DO DIA: -----" + 
							 "\nNúmero de parcelas pagas: " + contador +
							 "\nValor Total: R$ " + valoresParcelas );
		sc.close();
	}
	public static float valorPagamento ( float valor , int diasAtraso ) {
		float valorCalculado;
		if ( diasAtraso > 0 ) {
			valorCalculado = valor + ( valor * 0.03f ) + ( 0.001f * valor * diasAtraso );
		} else {
			valorCalculado = valor;
		}
		return valorCalculado;
	}
}
