import java.util.Scanner;
public class questao1 {

	public static void main ( String [] args ) {
		
		int choice = 1 , linha , coluna;
		
		Scanner sc = new Scanner ( System.in );
		System.out.println ( "Insira a quantidade de linhas:" );
		linha = sc.nextInt();
		System.out.println ( "Insira a quantidade de colunas:" );
		coluna = sc.nextInt();
		
		int matrizA [][] = new int [ linha ][ coluna ];
		int matrizB [][] = new int [ linha ][ coluna ];
		int matrizSoma [][] = new int [ linha ][ coluna ];
		int matrizSubtracao [][] = new int [ linha ][ coluna ];
		int matrizMultiplicacao [][] = new int [ linha ][ coluna ];
		
	
		while ( choice != 0 && choice == 1 || choice == 2 || choice == 3 ) {
			System.out.println ( "\n------------------------------------" + 
					 "\nBem vindo à calculadora de matrizes! " +
					 "\n ( 1 ) Somar; " +
					 "\n ( 2 ) Subtrair; " +
					 "\n ( 3 ) Multiplicar; " +
					 "\n ( 0 ) Sair. " +
					 "\n------------------------------------" +
					 "\nEscolha sua operação. " );
					choice = sc.nextInt();
					
			for ( int linhaInsere = 0 ; linhaInsere < linha && choice != 0 ; linhaInsere++ ) {
				System.out.println ();
					for ( int colunaInsere = 0 ; colunaInsere < coluna ; colunaInsere++ ) {
					System.out.println ( "Insira o valor " + colunaInsere + " da coluna " + linhaInsere +
										 " da matriz A: " );
					matrizA [ linhaInsere ][ colunaInsere ] = sc.nextInt();
					System.out.println ( "Insira o valor " + colunaInsere + " da coluna " + linhaInsere +
							 " da matriz B: " );
					matrizB [ linhaInsere ][ colunaInsere ] = sc.nextInt();
					}
			}
			
			for ( int linhaConta = 0 ; linhaConta < linha ; linhaConta++ ) {
				for ( int colunaConta = 0 ; colunaConta < coluna ; colunaConta++ ) {
					switch ( choice ) {
					case 1 :
						matrizSoma [ linhaConta ][ colunaConta ] = matrizA [ linhaConta ][ colunaConta ] + matrizB [ linhaConta ][ colunaConta ];
						break;
					case 2 :
						matrizSubtracao [ linhaConta ][ colunaConta ] = matrizA [ linhaConta ][ colunaConta ] - matrizB [ linhaConta ][ colunaConta ];
						break;
					case 3 : 
						matrizMultiplicacao [ linhaConta ][ colunaConta ] = matrizA [ linhaConta ][ colunaConta ] * matrizB [ linhaConta ][ colunaConta ];
						break;
					}
				}
			}
			System.out.print ( "\nA matriz final é: " );
			for ( int linhaPrint = 0 ; linhaPrint < linha ; linhaPrint++ ) {
				System.out.println ( "" );
				for ( int colunaPrint = 0 ; colunaPrint < coluna ; colunaPrint++ ) {
					switch ( choice ) {
					case 1 :
						System.out.print ( matrizSoma [ linhaPrint ][ colunaPrint ] + " " );
						break;
					case 2 :
						System.out.print ( matrizSubtracao [ linhaPrint ][ colunaPrint ] + " " );
						break;
					case 3 : 
						System.out.print ( matrizMultiplicacao [ linhaPrint ][ colunaPrint ] + " " );
						break;
					}
				}
			}
				
		} 
		System.out.println ( "Calculadora fechada." );
		sc.close();
	}

}
