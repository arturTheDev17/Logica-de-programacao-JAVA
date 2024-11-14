package procedures;

import java.util.Scanner;
import java.lang.Math;
public class questao1 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		float valorReais = 0 , moeda = 0;
		int escolha , erro = -1;
		while ( erro != 0 ) {
			System.out.println ( "Insira um valor em reais: " );
			valorReais = sc.nextFloat();
			if ( valorReais > 0 ) {
				erro = 0;
			} else {
				System.out.println ( "ERRO. Valor em reais deve ser maior que 0." );
			}
		} erro = -1;
		while ( erro != 0 ) {
			System.out.println ( "Escolha a moeda desejada para converter: \n1. |  ¥  | → R$ 1 = ¥30\n2. | US$ | → R$ 1 = US$ 0.3 " );
			escolha = sc.nextInt();
			switch ( escolha ) {
			case 1 :
				moeda = 30;
				break;
			case 2 :
				moeda = 0.3f;
			}
			if ( escolha == 1 || escolha == 2 ) {
				erro = 0;
			} else {
				System.out.println ( "Erro. Escolha Inválida." );
			}
		}
		conversao ( valorReais , moeda );
		sc.close();
	}
	public static void conversao ( float valor , float coeficiente ) {
		
		float resultado = valor * coeficiente;
		System.out.print ( "\nCom " + valor + " reais você compra " + Math.floor (resultado) );
		if ( coeficiente < 1 ) {
			System.out.print ( " dólares." );
		} else {
			System.out.print ( " ienes." );
		}
	}
}
