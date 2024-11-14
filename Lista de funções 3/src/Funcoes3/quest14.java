package Funcoes3;

import java.util.Scanner;

public class quest14 {

	public static void main ( String [] args ) {
		
		Scanner sc = new Scanner ( System.in );
		
		int alunos = 0;
		
		do {
			System.out.print ( "Escreva a quantidade de alunos que desejas registrar: " );
			alunos = sc.nextInt();
			if ( alunos <= 0 ) {
				System.out.println ( "ERRO. Quantidade de alunos inválida. TENTE NOVAMENTE." );
			}
		} while ( alunos <= 0 );
		
		float vetorNotas [] = new float [ 4 ];
		float nota , menorNota = 200;
		int codigo;
		for ( int insira = 0; insira < alunos; insira ++ ) {
			System.out.println ( ( insira + 1 ) + "º aluno: " );
			System.out.println ( "Informe o ID do aluno: " );
			codigo = sc.nextInt();
			
			for ( int notas = 0; notas < 4; notas++ ) {
				
				do {
					System.out.println ( ( notas + 1 ) + "ª nota: " );
					nota = sc.nextFloat();
					
					if ( nota < 0 || nota > 100 ) {
						System.out.println ( "ERRO. Nota inválida. Tente Novamente." );
					}
				} while ( nota < 0 || nota > 100 );
				if ( nota < menorNota ) {
					menorNota = nota;
				}
				
				vetorNotas [ notas ] = nota;
			}
			realizarCalculo ( vetorNotas, codigo , menorNota );
		}
		
		sc.close();
		
	}
	
	public static void realizarCalculo ( float vetor [], int codAluno , float menorNota ) {
		System.out.println ( menorNota );
		float soma = 0, media = 0;
		for ( int somar = 0 ; somar < 4 ; somar++ ) {
			soma = vetor [ somar ] + soma;
		}
		soma = soma - menorNota;
		media = soma / 3;
		
		System.out.println ( "\nCódigo do aluno: " + codAluno );
		System.out.println ( "Média final do aluno: " + media );
		print ( media );
	}
	public static void print ( float media ) {
		
		if ( media < 39 ) {
			System.out.println ( "Conceito F \n" );
		} else if ( media < 59 ) {
			System.out.println ( "Conceito E \n" );
		} else if ( media < 69 ) {
			System.out.println ( "Conceito D \n" );
		} else if ( media < 79 ) {
			System.out.println ( "Conceito C \n" );
		} else if ( media < 89 ) {
			System.out.println ( "Conceito B \n" );
		} else {
			System.out.println ( "Conceito A \n" );
		}	
	}
}