package matrizNaval;

import java.util.Scanner;

public class batalhaNaval {
	//Faça um jogo de batalha naval, utilize as seguinte regras:
		//– O primeiro usuário será o que vai configurar o tabuleiro inserindo os navios.
		//– O tabuleiro deve ter 8×8
		//– Quando inserido todos os navios o restante será considerado como “água”.
		//– Cada navio pode ocupar apenas 1 posição
		//– O jogador deve respeitar o espaço de 1 célula entre os navios
		//– O jogador que irá descobrir onde os navios estão tem apenas 10 tiros
		//– O jogador 1 pode posicionar 5 navios
	
	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		// int borda [][] = new int [ 10 ][ 10 ];
		int contadorAcertos = 0 , jogo [][] = new int [ 10 ][ 10 ] , linha = 0 , coluna = 0 , erro , ataque [][] = new int [ 10 ][ 10 ];
		System.out.println ( "--- BATALHA NAVAL! ---" );
		System.out.println ( "Jogador 1, favor inserir seus 5 barcos;" );
		for ( int insira = 0 ; insira < 5 ; insira++ ) {
			for ( int linhasPrint = 0 ; linhasPrint < jogo.length ; linhasPrint++ ) {
				
				if ( linhasPrint == 0 ) {
					System.out.print ( "╔══════════════════════════════╗" );
				} 
					System.out.print ( "\n║ "  );
				for ( int colunasPrint = 0 ; colunasPrint < jogo.length; colunasPrint++ ) {
					if ( colunasPrint + 1 < jogo.length ) {
						if ( jogo [ linhasPrint ][ colunasPrint ] == 0 ) {
							System.out.print ( "   " );
						} else if ( jogo [ linhasPrint ][ colunasPrint ] == 1 ) {
							System.out.print (  "■  " );
						}
					} else {
						if ( jogo [ linhasPrint ][ colunasPrint ] == 0 ) {
							System.out.print ( "  " );
						} else if ( jogo [ linhasPrint ][ colunasPrint ] == 1 ) {
							System.out.print (  "■ " );
						}
					}
					if ( colunasPrint + 1 == jogo.length ) {
						System.out.print ( "║" );
					}
				}
			}
			System.out.println ( "\n╚══════════════════════════════╝" );
			erro = 0;
			while ( erro != -1 ) {
				System.out.println ( "Insira a linha onde o barco será posicionado: " );
				linha = sc.nextInt();
				System.out.println ( "Insira a coluna onde o barco será posicionado: " );
				coluna = sc.nextInt();
				if ( linha < 1 || linha > 8 || coluna < 1 || coluna > 8 ) {
					System.out.println ( "ERRO. VALOR PARA LINHA E/OU COLUNA INVÁLIDO. TENTE NOVAMENTE." );
				} else if ( jogo [ linha ][ coluna ] != 0 ) {
					System.out.println ( "ERRO. POSIÇÃO OCUPADA. ESCOLHA OUTRA." );
				} else if ( jogo [ linha - 1 ][ coluna - 1 ] != 0 || jogo [ linha - 1 ][ coluna ] != 0 || 
						    jogo [ linha - 1 ][ coluna + 1 ] != 0 || jogo [ linha ][ coluna - 1 ] != 0 || 
						    jogo [ linha ][ coluna + 1 ] != 0 || jogo [ linha + 1 ][ coluna - 1 ] != 0 || 
						    jogo [ linha + 1 ][ coluna ] != 0 || jogo [ linha + 1 ][ coluna + 1 ] != 0 ) {
						System.out.println ( "ERRO. HÁ UM OUTRO NAVIO MUITO PRÓXIMO. ESCOLHA OUTRA POSIÇÃO." );
				} else {
					erro = -1;
				}
			}
			jogo [ linha ][ coluna ] = 1;
		}
		for ( int linhasPrint = 0 ; linhasPrint < jogo.length ; linhasPrint++ ) {
			
			if ( linhasPrint == 0 ) {
				System.out.print ( "╔══════════════════════════════╗" );
			} 
				System.out.print ( "\n║ "  );
			for ( int colunasPrint = 0 ; colunasPrint < jogo.length; colunasPrint++ ) {
				if ( colunasPrint + 1 < jogo.length ) {
					if ( jogo [ linhasPrint ][ colunasPrint ] == 0 ) {
						System.out.print ( "   " );
					} else if ( jogo [ linhasPrint ][ colunasPrint ] == 1 ) {
						System.out.print (  "■  " );
					}
				} else {
					if ( jogo [ linhasPrint ][ colunasPrint ] == 0 ) {
						System.out.print ( "  " );
					} else if ( jogo [ linhasPrint ][ colunasPrint ] == 1 ) {
						System.out.print (  "■ " );
					}
				}
				if ( colunasPrint + 1 == jogo.length ) {
					System.out.print ( "║" );
				}
			}
		}
		System.out.println ( "\n╚══════════════════════════════╝" );
		System.out.println ( "ATACAR!!! Agora é a vez do Jogador 2 atacar os Barcos do jogador 1." );
		for ( int tiros = 10 ; tiros > 0 ; tiros -- ) {
			if ( contadorAcertos >= 5 ) {
				break;
			}
			erro = -2;
			System.out.println ( "Você tem " + tiros + " disparos restantes." );
			for ( int linhasPrint = 0 ; linhasPrint < ataque.length ; linhasPrint++ ) {
				
				if ( linhasPrint == 0 ) {
					System.out.print ( "╔══════════════════════════════╗" );
				} 
					System.out.print ( "\n║ "  );
				for ( int colunasPrint = 0 ; colunasPrint < ataque.length; colunasPrint++ ) {
					if ( colunasPrint + 1 < ataque.length ) {
						if ( ataque [ linhasPrint ][ colunasPrint ] == 0 ) {
							System.out.print ( "   " );
						} else if ( ataque [ linhasPrint ][ colunasPrint ] == 1 ) {
							System.out.print (  "○  " );
						} else if ( ataque [ linhasPrint ][ colunasPrint ] == 2 ) {
							System.out.print (  "◘  " );
						}
					} else {
						if ( ataque [ linhasPrint ][ colunasPrint ] == 0 ) {
							System.out.print ( "  " );
						} else if ( ataque [ linhasPrint ][ colunasPrint ] == 1 ) {
							System.out.print (  "○ " );
						} else if ( ataque [ linhasPrint ][ colunasPrint ] == 2 ) {
							System.out.print (  "◘ " );
						}
					}
					if ( colunasPrint + 1 == ataque.length ) {
						System.out.print ( "║" );
					}
				}
			}
			System.out.println ( "\n╚══════════════════════════════╝" );
			while ( erro != -1 ) {
				System.out.println ( "Insira a linha onde será efetuado o disparo: " );
				linha = sc.nextInt();
				System.out.println ( "Insira a coluna onde será efetuado o disparo: " );
				coluna = sc.nextInt();
				if ( linha < 1 || linha > 8 || coluna < 1 || coluna > 8 ) {
					System.out.println ( "ERRO. VALOR PARA LINHA E/OU COLUNA INVÁLIDO. TENTE NOVAMENTE." );
				} else {
					erro = -1;
				}
			}
			ataque [ linha ][ coluna ] = 1;
			if ( ataque [ linha ][ coluna ] == jogo [ linha ][ coluna ] ) {
				ataque [ linha ][ coluna ] = 2;
				contadorAcertos++;
			}
		}
		for ( int linhasPrint = 0 ; linhasPrint < ataque.length ; linhasPrint++ ) {
			
			if ( linhasPrint == 0 ) {
				System.out.print ( "╔══════════════════════════════╗" );
			} 
				System.out.print ( "\n║ "  );
			for ( int colunasPrint = 0 ; colunasPrint < ataque.length; colunasPrint++ ) {
				if ( colunasPrint + 1 < ataque.length ) {
					if ( ataque [ linhasPrint ][ colunasPrint ] == 0 ) {
						System.out.print ( "   " );
					} else if ( ataque [ linhasPrint ][ colunasPrint ] == 1 ) {
						System.out.print (  "○  " );
					} else if ( ataque [ linhasPrint ][ colunasPrint ] == 2 ) {
						System.out.print (  "◘  " );
					}
				} else {
					if ( ataque [ linhasPrint ][ colunasPrint ] == 0 ) {
						System.out.print ( "  " );
					} else if ( ataque [ linhasPrint ][ colunasPrint ] == 1 ) {
						System.out.print (  "○ " );
					} else if ( ataque [ linhasPrint ][ colunasPrint ] == 2 ) {
						System.out.print (  "◘ " );
					}
				}
				if ( colunasPrint + 1 == ataque.length ) {
					System.out.print ( "║" );
				}
			}
		}
		System.out.println ( "\n╚══════════════════════════════╝" );
		if ( contadorAcertos < 5 ) {
			System.out.println ( "O jogador 1 ganhou!" );
		} else {
			System.out.println ( "O jogador 2 ganhou!" );
		}
		
		sc.close();
	}

}
