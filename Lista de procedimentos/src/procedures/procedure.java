package procedures;

public class procedure {

	public static void main ( String [] args ) {
		int a = 10 , b = 20 , result;
		soma ( a , b );
		result = subtracao ( a , b );
		System.out.println ( "Subtracao: " + result );

	}
	
	public static void soma ( int c , int d ) {
		
		int resultado = c + d;
		System.out.println ( resultado );
		System.out.println ( "Soma: " + resultado );

	}
	
	public static int subtracao ( int c , int d ) {
		int resultado = c - d;
		return resultado;
	}
/*
 * if (  mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) {
			comprimentoMes = 31;
		} else if ( mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
			comprimentoMes = 30;
		} else {
			
 */
}
