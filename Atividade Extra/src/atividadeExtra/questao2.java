package atividadeExtra;

public class questao2 {

	public static void main ( String [] args ) {
		String jogos [] [] = new String [ 3 ] [ 2 ] , maiorFaltas = null , menorFaltas = null ;
		int faltas [] [] = new int [ 3 ][ 2 ] , somaFaltas [] = new int [ 3 ] , somaFaltasCamp;
		
		jogos [ 0 ] [ 0 ] = "Brasil"; jogos [ 0 ] [ 1 ] = "Itália";
		jogos [ 1 ] [ 0 ] = "Brasil"; jogos [ 1 ] [ 1 ] = "Espanha";
		jogos [ 2 ] [ 0 ] = "Itália"; jogos [ 2 ] [ 1 ] = "Espanha";
		
		faltas [ 0 ] [ 0 ] = 10; faltas [ 0 ] [ 1 ] = 9;
		faltas [ 1 ] [ 0 ] = 5; faltas [ 1 ] [ 1 ] = 7;
		faltas [ 2 ] [ 0 ] = 7; faltas [ 2 ] [ 1 ] = 8;
		
		for ( int jogo = 0 ; jogo < 3 ; jogo++ ) {
			for ( int time = 0 ; time < 2 ; time++ ) {
				if ( jogos [ jogo ] [ time ] == "Brasil" ) {
					somaFaltas [ 0 ] = somaFaltas [ 0 ] + faltas [ jogo ] [ time ];
				} else if ( jogos [ jogo ] [ time ] == "Espanha" ) {
					somaFaltas [ 1 ] = somaFaltas [ 1 ] + faltas [ jogo ] [ time ];
				} else if ( jogos [ jogo ] [ time ] == "Itália" ) {
					somaFaltas [ 2 ] = somaFaltas [ 2 ] + faltas [ jogo ] [ time ];
				}
				if ( somaFaltas [ 0 ] > somaFaltas [ 1 ] && somaFaltas [ 0 ] > somaFaltas [ 2 ] ) {
					maiorFaltas = "Brasil";
				} else if ( somaFaltas [ 1 ] > somaFaltas [ 0 ] && somaFaltas [ 1 ] > somaFaltas [ 2 ] ) {
					maiorFaltas = "Espanha";
				} else if ( somaFaltas [ 2 ] > somaFaltas [ 0 ] && somaFaltas [ 2 ] > somaFaltas [ 1 ] ) {
					maiorFaltas = "Itália";
				}
				if ( somaFaltas [ 0 ] < somaFaltas [ 1 ] && somaFaltas [ 0 ] < somaFaltas [ 2 ] ) {
					menorFaltas = "Brasil";
				} else if ( somaFaltas [ 1 ] < somaFaltas [ 0 ] && somaFaltas [ 1 ] < somaFaltas [ 2 ] ) {
					menorFaltas = "Espanha";
				} else if ( somaFaltas [ 2 ] < somaFaltas [ 0 ] && somaFaltas [ 2 ] < somaFaltas [ 1 ] ) {
					menorFaltas = "Itália";
				}
			}
		}
		
		somaFaltasCamp = somaFaltas [ 0 ] + somaFaltas [ 1 ] + somaFaltas [ 2 ];
		System.out.println ( "Todas as faltas do campeonato: " + somaFaltasCamp );
		System.out.println ( "A seleção que mais cometeu faltas foi: | " + maiorFaltas + " |" );
		System.out.println ( "A seleção que menos cometeu faltas foi: | " + menorFaltas + " |" );

	}

}
