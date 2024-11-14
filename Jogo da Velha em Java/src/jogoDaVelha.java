package jogoDaVelha;

import java.util.Scanner;

public class jogoDaVelha {

	public static void main ( String [] args ) {
		char jogo [][] = new char [ 3 ][ 3 ];
		int ganhador = 0 , linha , coluna, erro , contador = 0;
		Scanner sc = new Scanner ( System.in );
		System.out.println (  "JOGO DA VELHA\n Jogador 1 | X |\n Jogador 2 | 0 |\nJogador 1 começa!\n" );
		erro = -1;
		do {	
			contador++;
			while ( erro != 0 ) {
				for ( int mostrar = 0 ; mostrar < jogo.length ; mostrar++ ) {
					if ( mostrar == 0 ) {
						System.out.println ( "     1     2     3 " );
						System.out.println ( "  ╔═════╦═════╦═════╗" );
					} else if ( mostrar == 1 || mostrar == 2 )  {
						System.out.println ( "\n  ╠═════╬═════╬═════╣" );
					}
					System.out.print ( ( mostrar + 1 ) + " " );
					for ( int mostrarColuna = 0 ; mostrarColuna < jogo.length ; mostrarColuna++ ) {
						System.out.print ( "║  " + jogo [ mostrar ][ mostrarColuna ] + "  " );
						if ( mostrarColuna + 1 == jogo.length ) {
							System.out.print ( "║" );
						}
					}
				}
				System.out.println ( "\n  ╚═════╩═════╩═════╝" );

				System.out.println ( "\nInsira a linha onde gostaria de colocar o X " );
				linha = sc.nextInt() - 1;
				System.out.println ( "Insira a coluna onde gostaria de colocar o X " );
				coluna = sc.nextInt() - 1;
				
				if ( linha < 0 || coluna < 0 || linha > 2 || coluna > 2 ) {
					System.out.println ( "ERRO. Valor para linha e/ou coluna inválido. Tente novamente." );
					
				} else if ( jogo [ linha ][ coluna ] == 'X' || jogo [ linha ][ coluna ] == '0' ) {
					System.out.println ( "ERRO. Linha ocupada. Tente novamente." );
					
				} else {
					jogo [ linha ][ coluna ] = 'X';
					erro = 0;
				}
			}
			if ( jogo [ 0 ][ 0 ] == 'X' && jogo [ 0 ][ 1 ] == 'X' && jogo [ 0 ][ 2 ] == 'X' ) {
				ganhador = -1;
			} else if ( jogo [ 1 ][ 0 ] == 'X' && jogo [ 1 ][ 1 ] == 'X' && jogo [ 1 ][ 2 ] == 'X' ) {
				ganhador = -1;
			} else if ( jogo [ 2 ][ 0 ] == 'X' && jogo [ 2 ][ 1 ] == 'X' && jogo [ 2 ][ 2 ] == 'X' ) {
				ganhador = -1;
			} else if ( jogo [ 0 ][ 0 ] == 'X' && jogo [ 1 ][ 0 ] == 'X' && jogo [ 2 ][ 0 ] == 'X' ) {
				ganhador = -1;
			} else if ( jogo [ 0 ][ 1 ] == 'X' && jogo [ 1 ][ 1 ] == 'X' && jogo [ 2 ][ 1 ] == 'X' ) {
				ganhador = -1;
			} else if ( jogo [ 0 ][ 2 ] == 'X' && jogo [ 1 ][ 2 ] == 'X' && jogo [ 2 ][ 2 ] == 'X' ) {
				ganhador = -1;
			} else if ( jogo [ 0 ][ 0 ] == 'X' && jogo [ 1 ][ 1 ] == 'X' && jogo [ 2 ][ 2 ] == 'X' ) {
				ganhador = -1;
			} else if ( jogo [ 0 ][ 2 ] == 'X' && jogo [ 1 ][ 1 ] == 'X' && jogo [ 2 ][ 0 ] == 'X' ) {
				ganhador = -1;
			}
			erro = -1;
			contador++;
			if ( contador >= 9 ) {
				break;
			}
			if ( ganhador != -1 ) {
				while ( erro != 0 ) {
					for ( int mostrar = 0 ; mostrar < jogo.length ; mostrar++ ) {
						if ( mostrar == 0 ) {
							System.out.println ( "     1     2     3 " );
							System.out.println ( "  ╔═════╦═════╦═════╗" );
						} else if ( mostrar == 1 || mostrar == 2 )  {
							System.out.println ( "\n  ╠═════╬═════╬═════╣" );
						}
						System.out.print ( ( mostrar + 1 ) + " " );
						for ( int mostrarColuna = 0 ; mostrarColuna < jogo.length ; mostrarColuna++ ) {
							System.out.print ( "║  " + jogo [ mostrar ][ mostrarColuna ] + "  " );
							if ( mostrarColuna + 1 == jogo.length ) {
								System.out.print ( "║" );
							}
						}
					}
					System.out.println ( "\n  ╚═════╩═════╩═════╝" );

					System.out.println ( "\nInsira a linha onde gostaria de colocar a 0 " );
					linha = sc.nextInt() - 1;
					System.out.println ( "Insira a coluna onde gostaria de colocar a 0 " );
					coluna = sc.nextInt() - 1;
					if ( linha < 0 || coluna < 0 || linha > 2 || coluna > 2 ) {
						System.out.println ( "ERRO. Valor para linha e/ou coluna inválido. Tente novamente." );
						
					} else if ( jogo [ linha ][ coluna ] == 'X' || jogo [ linha ][ coluna ] == '0' ) {
						System.out.println ( "ERRO. Linha ocupada. Tente novamente." );
					} else {
						jogo [ linha ][ coluna ] = '0';
						erro = 0;
					}
					if ( jogo [ 0 ][ 0 ] == '0' && jogo [ 0 ][ 1 ] == '0' && jogo [ 0 ][ 2 ] == '0' ) {
						ganhador = -2;
					} else if ( jogo [ 1 ][ 0 ] == '0' && jogo [ 1 ][ 1 ] == '0' && jogo [ 1 ][ 2 ] == '0' ) {
						ganhador = -2;
					} else if ( jogo [ 2 ][ 0 ] == '0' && jogo [ 2 ][ 1 ] == '0' && jogo [ 2 ][ 2 ] == '0' ) {
						ganhador = -2;
					} else if ( jogo [ 0 ][ 0 ] == '0' && jogo [ 1 ][ 0 ] == '0' && jogo [ 2 ][ 0 ] == '0' ) {
						ganhador = -2;
					} else if ( jogo [ 0 ][ 1 ] == '0' && jogo [ 1 ][ 1 ] == '0' && jogo [ 2 ][ 1 ] == '0' ) {
						ganhador = -2;
					} else if ( jogo [ 0 ][ 2 ] == '0' && jogo [ 1 ][ 2 ] == '0' && jogo [ 2 ][ 2 ] == '0' ) {
						ganhador = -2;
					} else if ( jogo [ 0 ][ 0 ] == '0' && jogo [ 1 ][ 1 ] == '0' && jogo [ 2 ][ 2 ] == '0' ) {
						ganhador = -2;
					} else if ( jogo [ 0 ][ 2 ] == '0' && jogo [ 1 ][ 1 ] == '0' && jogo [ 2 ][ 0 ] == '0' ) {
						ganhador = -2;
					}
				}
			}
			erro = -1;
		} while ( ganhador != -1 && ganhador != -2 && contador < 9 );
		for ( int mostrar = 0 ; mostrar < jogo.length ; mostrar++ ) {
			if ( mostrar == 0 ) {
				System.out.println ( "     1     2     3 " );
				System.out.println ( "  ╔═════╦═════╦═════╗" );
			} else if ( mostrar == 1 || mostrar == 2 )  {
				System.out.println ( "\n  ╠═════╬═════╬═════╣" );
			}
			System.out.print ( ( mostrar + 1 ) + " " );
			for ( int mostrarColuna = 0 ; mostrarColuna < jogo.length ; mostrarColuna++ ) {
				System.out.print ( "║  " + jogo [ mostrar ][ mostrarColuna ] + "  " );
				if ( mostrarColuna + 1 == jogo.length ) {
					System.out.print ( "║" );
				}
			}
		}
		System.out.println ( "\n  ╚═════╩═════╩═════╝" );

		if ( ganhador == -1 ) {
			System.out.println ( "\n| O JOGADOR 1 GANHOU! |" );
		} else if ( ganhador == -2 ) {
			System.out.println ( "\n| O JOGADOR 2 GANHOU! |" );
		} else if ( contador >= 9 ) {
			System.out.println ( "\nDEU VELHA..." );
		}
		sc.close();
	}

}
