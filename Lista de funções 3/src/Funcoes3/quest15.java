package Funcoes3;

import java.util.Random;
import java.util.Scanner;

public class quest15 {

	public static void main ( String [] args ) {
		
		System.out.println ( "Insira a quantidade de bilhetes: " );
		Scanner sc = new Scanner ( System.in ); 
		int vetorSorteio [ ] = new int [ 5 ] , num , dezenas , contador = 0 , contadorBilhetes = 0 , temo = 0 , quadra = 0 , quina = 0 , bilhetes;
		bilhetes = sc.nextInt();
		int apostas [] = new int [ bilhetes ] , codigos [] = new int [ bilhetes ];
		for ( int sorteio = 0 ; sorteio < 5 ; sorteio++ ) {
			num = sorteador ( );
			vetorSorteio [ sorteio ] = num ;
			}
		
		while ( bilhetes > contadorBilhetes ) {
			System.out.println ( "Insira o código da aposta: " );
			codigos [ contadorBilhetes ] = sc.nextInt();
			do {
				System.out.println ( "Insira a quantidade de dezenas no bilhete: " );
				dezenas = sc.nextInt();
				if ( 1 > dezenas || dezenas > 10 ) {
					System.out.println ( "ERRO. Quantidade de dezenas inválida. TENTE NOVAMENTE." );
				}
			} while ( 1 > dezenas || dezenas > 10 );
			int vetorEscolhidos [ ] = new int [ dezenas ];
			
			for ( int sorteio = 0 ; sorteio < dezenas ; sorteio++ ) {
				System.out.print ( "Insira um número: " );
				num = sc.nextInt();
				vetorEscolhidos [ sorteio ] = num ;
				}
			
			for ( int compara = 0 ; compara < dezenas ; compara++ ) {
				if ( comparador ( vetorEscolhidos [ compara ] , vetorSorteio ) ) {
					contador++;
				}
			}
			if ( contador == 3 ) {
				temo++;
			} else if ( contador == 4 ) {
				quadra++;
			} else if ( contador == 5 ) {
				quina++;
			}
			apostas [ contadorBilhetes ] = contador;
			contadorBilhetes++;
		}
		print ( temo , quadra , quina , codigos , apostas );
		sc.close();
	}
	
	public static int sorteador ( ) {
		Random rand = new Random ();
		int numero = rand.nextInt ( 98 ) + 1;
		System.out.println ( numero );
		return numero;
	}
	public static void print ( int temo , int quadra , int quina , int [] codigos , int [] apostas ) {
		System.out.println ( "Ganhadores!" );
		for ( int print = 0 ; print < ( temo + quadra + quina ) ; print++ ) {
			if ( apostas [ print ] > 3 ) {
				System.out.println ( "Código: " + codigos [ print ] );
			}
		}
		System.out.println (   "-----------------------------------" );
		System.out.println (   "Número de Temos: | " + temo   + " |" );
		System.out.println ( "Número de Quadras: | " + quadra + " |" );
		System.out.println (  "Número de Quinas: | " + quina  + " |" );
		System.out.println (   "-----------------------------------" );
	}
	
	public static boolean comparador ( int num , int [] vetorSorteio  ) {
		for ( int comparador = 0 ; comparador < 5 ; comparador++ ) {
			if ( num == vetorSorteio [ comparador ] ) {
				return true;
			} 
		}
		return false;
	}
}