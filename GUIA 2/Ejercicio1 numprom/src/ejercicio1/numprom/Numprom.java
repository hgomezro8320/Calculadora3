package Ejercicio1.Numprom;

import  java.util.Scanner ;

public class Numprom {

	public  static  void  main ( String [] args ) {
		
		Scanner teclado =  nuevo  escáner ( System . In );
	       
        Sistema . a cabo . print ( " Por favor ingrese el tamaño del array: " );
        int n = teclado . nextInt ();
        int array [] =  nuevo  int [n];
       
        for ( int i =  0 ; i < array . length; i ++ ) {
            Sistema . a cabo . print ( " Ingrese dato " + (i + 1 ) + " : " );
            matriz [i] = teclado . nextInt ();
            
        }
       
		doble alcalde, menor, promedio =  0 ;
        mayor = menor = matriz [ 0 ];
       
        for ( int i =  0 ; i < array . length; i ++ ) {
            if (matriz [i] > mayor) {
                mayor = matriz [i];
            }
            if (matriz [i] < menor) {
                menor = matriz [i];
            }
            promedio = matriz [i] + promedio;
        }
        promedio = promedio / matriz . longitud;
        
        Sistema . a cabo . println ( " El mayor valor es: " + mayor);
        Sistema . a cabo . println ( " El menor valor es: " + menor);
        Sistema . a cabo . println ( " El promedio es: "  + promedio);
	}

}