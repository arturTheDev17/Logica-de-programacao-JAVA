package VetoresR;

import java.util.Scanner;

public class questao2 {

	public static void main ( String [] args ) {
		Scanner sc = new Scanner ( System.in );
		String nome [] = new String [ 99 ];
		String telefone [] = new String [ 99 ];
		String email [] = new String [ 99 ];
		String compara = "" ;
		int escolha = -1 , contadorContatos = 0, erro = -1;
		
		while ( escolha != 0 ) {
			System.out.println ( "\n--- MENU DOS CONTATOS ---" );
			System.out.println ( " 1- Adicionar contato; " );
			System.out.println ( " 2- Excluir contato; " );
			System.out.println ( " 3- Ver contatos; " );
			System.out.println ( " 0 - Sair." );
			escolha = sc.nextInt();
			switch ( escolha ) {
			case 1 : 
				System.out.println ( "Insira o nome do contato" );
				nome [ contadorContatos ] = sc.next();
				System.out.println ( "Insira o telefone sem espaços" );
				telefone [ contadorContatos ] = sc.next();
				System.out.println ( "Insira o email:" );
				email [ contadorContatos ] = sc.next();
				contadorContatos++;
				break;
			case 2 : 
				System.out.println ( "Qual o nome do contato que deseja excluir?" );
				compara = sc.next();
				if ( contadorContatos == 0 ) {
						System.out.println ( "Contato não encontrado..." );
				}
				for ( int procura = 0 ; procura < contadorContatos ; procura++ ) {
					if ( compara.equals ( nome [ procura ] ) ) {
						for ( int troca = procura ; troca < contadorContatos ; troca++ ) {
							if ( troca > 0 ) {
								nome [ troca - 1 ] = nome [ troca ];
								telefone [ troca - 1 ] = telefone [ troca ];
								email [ troca - 1 ] = email [ troca ];
								erro = -1;
							} 
						}
						contadorContatos--;
						} else {
							erro = 0;
							}
					}
					if ( erro == 0 ) {
						System.out.println ( "Nome não existente ou não há nomes registrados." );
					}
				break;
			case 3 : 
				for ( int print = 0 ; print < contadorContatos ; print++  ) {
					System.out.println ( "-- Contato " + ( print + 1 ) + " --"  );
					System.out.println ( "Nome: " + nome [ print ] );
					System.out.println ( "Telefone: " + telefone [ print ] );
					System.out.println ( "E-mail: " + email [ print ] );
				}
				break;
			}
		}
		sc.close();
	}

}
