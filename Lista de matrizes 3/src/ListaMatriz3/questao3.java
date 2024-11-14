package ListaMatriz3;

import java.util.Scanner;

public class questao3 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in);
		int funcionarios , erroNome , erroMoney;
		System.out.println ( "Insira o número de funcionários: " );
		funcionarios = sc.nextInt();
		float valores [][] = new float [ funcionarios ][ 4 ];
		String nome [] = new String [ funcionarios ];
		String nomeApoio = "";
		float salarioApoio = 0 , somaLiq = 0, somaBrut = 0, somaINSS = 0 , somaImpostRenda = 0;
		for ( int contadorFuncionarios = 0 ; contadorFuncionarios < funcionarios ; contadorFuncionarios++ ) {
			erroNome = 0;
			erroMoney = 0;
			while ( erroNome != -1 ) {
				
				System.out.println ( "\nInsira o nome do Funcionário: " );
				nomeApoio = sc.next();
				if ( nomeApoio.length() < 2   ) {
					System.out.println ( "Nome muito curto! Tente novamente." );
				} else {
					erroNome = -1;
				}
			}
			nome [ contadorFuncionarios ] = nomeApoio;
			
			while ( erroMoney != -1 ) {
				System.out.print ( "\nInsira o seu salário bruto:\n R$  " );
				salarioApoio = sc.nextFloat();
				if ( salarioApoio < 465f ) {
					System.out.println ( "Salário muito pequeno! Tente novamente." );
				} else {
					erroMoney = -1;
				}
			}
			valores [ contadorFuncionarios ][ 0 ] = salarioApoio;
			
			//INSS
			if ( valores [ contadorFuncionarios ][ 0 ] <= 965.67f ) {
				valores [ contadorFuncionarios ][ 1 ] = valores [ contadorFuncionarios ][ 0 ] * 0.08f; 
			} else if ( valores [ contadorFuncionarios ][ 0 ] <= 1609.45f ) {
				valores [ contadorFuncionarios ][ 1 ] = valores [ contadorFuncionarios ][ 0 ] * 0.09f;
			} else if ( valores [ contadorFuncionarios ][ 0 ] <= 3218.9f ) {
				valores [ contadorFuncionarios ][ 1 ] = valores [ contadorFuncionarios ][ 0 ] * 0.11f;
			} else {
				valores [ contadorFuncionarios ][ 1 ] = 354.07f;
			}
			//Imposto de renda
			if ( valores [ contadorFuncionarios ][ 0 ] <= 1.434f ) {
				valores [ contadorFuncionarios ][ 2 ] = 0; 
			} else if ( valores [ contadorFuncionarios ][ 0 ] <= 2.150f ) {
				valores [ contadorFuncionarios ][ 2 ] = valores [ contadorFuncionarios ][ 0 ] * 0.075f;
			} else if ( valores [ contadorFuncionarios ][ 0 ] <= 2.886f ) {
				valores [ contadorFuncionarios ][ 2 ] = valores [ contadorFuncionarios ][ 0 ] * 0.15f;
			} else if ( valores [ contadorFuncionarios ][ 0 ] <= 3.582f ) {
				valores [ contadorFuncionarios ][ 2 ] = valores [ contadorFuncionarios ][ 0 ] * 0.225f;
			} else {
				valores [ contadorFuncionarios ][ 2 ] = valores [ contadorFuncionarios ][ 0 ] * 0.275f;
			}
			//Salario liquido
			valores [ contadorFuncionarios ][ 3 ] = valores [ contadorFuncionarios ][ 0 ] - ( valores [ contadorFuncionarios ][ 1 ] + valores [ contadorFuncionarios ][ 2 ] );
			
			//Somas
			somaBrut = somaBrut + valores [ contadorFuncionarios ][ 0 ];
			somaLiq = somaLiq + valores [ contadorFuncionarios ][ 3 ];
			somaINSS = somaINSS + valores [ contadorFuncionarios ][ 1 ];
			somaImpostRenda = somaImpostRenda + valores [ contadorFuncionarios ][ 2 ];
			
			System.out.println ( "------- Folha de Pagamento -------" );
			System.out.println(  " • Nome: " + nome [ contadorFuncionarios ] );
			System.out.println ( " • Salário bruto: " + valores [ contadorFuncionarios ][ 0 ] );
			System.out.println ( " • INSS: " + valores [ contadorFuncionarios ][ 1 ] );
			System.out.println ( " • Imposto de Renda: " + valores [ contadorFuncionarios ][ 2 ] );
			System.out.println ( " • Salário líquido: " + valores [ contadorFuncionarios ][ 3 ] );
			
		}
		System.out.print  ( "------------------------------------------------------------" );
		System.out.println  ( "\nA soma do valor de todos os salários brutos: " + somaBrut
							+ "\nA soma dos descontos de INSS: " + somaINSS
							+ "\nA soma dos descontos de Imposto de Renda: " + somaImpostRenda
							+ "\nA soma de todos os salários líquidos: " + somaLiq );
		System.out.print  ( "------------------------------------------------------------" );
		sc.close();
	}

}
