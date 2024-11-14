package VetoresR;

import java.util.Scanner;

public class questao1 {

	public static void main ( String [] args ) {
		
		Scanner sc = new Scanner ( System.in );
		
		System.out.println ( "Indique o tamanho do seu vetor: " );
		int vetorTamanho,  maiorModa = 0;
		vetorTamanho = sc.nextInt();
		
		int vetor [] = new int [ vetorTamanho ];
		int vetorContador [] = new int [ vetorTamanho ];
		
		for ( int contador = 0 ; contador < vetorTamanho ; contador++ ) {
			System.out.println ( "Insira um valor para o vetor." );
			vetor [ contador ] = sc.nextInt();
			
			for ( int percorre = 0 ; percorre < vetorTamanho ; percorre++ ) {
				if ( vetor [ contador ] == vetor [ percorre ] ) {
						vetorContador [ percorre ] ++;
						if ( vetorContador [ percorre ] > maiorModa ) {
							maiorModa = vetorContador [ percorre ];
						}
				}
			}
		}
		System.out.println ( "Os números que são moda (apareceram mais vezes) são: " );
		for ( int compara = 0 ; compara < vetorTamanho ; compara++ ) {
			if ( vetorContador [ compara ] == maiorModa ) {
				System.out.print ( vetor [ compara ] + ", " );
			}
		}
		sc.close();
	}

}
