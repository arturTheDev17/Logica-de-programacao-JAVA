package Lista;

import java.util.Scanner;

public class questao2 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		System.out.print ( "Insira o valor do saldo.\nR$ " );
		float saldo = definirSaldoInicial();
		int escolha = -1;
		while ( escolha != 0 ) {
			System.out.print ( "\nCONTA CORRENTE\n"
					+ 			 "| 1 | Depositar;  "
					+ 			 "| 2 | Sacar;  "
					+ 			 "| 3 | Ver saldo;  "
					+ 			 "| 0 | Fechar;  ");
			do {
				System.out.println ( "\nEscolha: " );
				escolha = sc.nextInt();
				if ( escolha != 1 && escolha != 2 && escolha != 3 && escolha != 0 ) {
					System.out.println ( "ERRO. ESCOLHA INVÁLIDA." );
				}
			} while ( escolha != 1 && escolha != 2 && escolha != 3 && escolha != 0 );
			
			if ( escolha != 0 ) {
				saldo = escolha (  saldo , escolha );
			}
		}
	}
	public static float definirSaldoInicial (  ) {
		Scanner sc = new Scanner ( System.in );
		float saldo = sc.nextFloat();
		return saldo;
	}
	public static boolean retirar ( float saldo , float valorRetirar ) {
		if ( saldo >= valorRetirar ) {
			return true;
		}
		return false;
	}
	public static float depositar ( float saldo , float valorDeposito ) {
		float novoDeposito = saldo + valorDeposito;
		return novoDeposito;
	}
	public static float escolha ( float saldo , int escolha ) {
		Scanner sc = new Scanner ( System.in );
		float valor ;
		switch ( escolha ) {
		case 1 :
			System.out.print ( "Insira o valor R$ " );
			valor = sc.nextFloat();
			saldo = depositar ( saldo , valor );
			System.out.println ( "SALDO: R$ " + saldo );
			return saldo;
		case 2 :
			System.out.print ( "Insira o valor R$ " );
			valor = sc.nextFloat();
			if ( retirar ( saldo , valor ) ) {
				saldo = saldo - valor;
			} else {
				System.out.println ( "Saldo menor que o valor de retirada." );
			}
			System.out.println ( "SALDO: R$ " + saldo );
			return saldo;
		case 3 :
			System.out.println ( "SALDO: R$ " + saldo );
			return saldo;
		}
		return 0;
	}
}
