package DesviacionEstandar;

import java.util.ArrayList;
import java.util.Scanner;

public class DesviacionEstandar {
    public static void main(String[] args) {
        double elemnetos_a;
        double suma = 0;
        double promedio;
        double o = 0;
        double desviacion;


        ArrayList<Double> vector_a = new ArrayList<>();


        System.out.println("Desviación Estadar");
        System.out.println("-----------------------");

        Scanner entrada = new Scanner (System.in);

        
        do{
            System.out.println("Digita el 'número' de elemnetos del vector");
            elemnetos_a = entrada.nextDouble(); 
        }while(elemnetos_a <= 0);

        for (int i=0;i<elemnetos_a;i++){
            do{
                
                System.out.println("Digita los datos del vector ["+ i +"]");
                vector_a.add(entrada.nextDouble());
            }while(vector_a.get(i) <= 0);
        }

        for (int i=0;i<elemnetos_a;i++){
            suma  = suma + vector_a.get(i);
        }

        promedio = (suma/elemnetos_a);
        System.out.println("---- "+promedio);

        for (int i=0;i<elemnetos_a;i++){
            o = Math.pow((vector_a.get(i) - promedio),2) + o;
            
        }
        
        desviacion = Math.sqrt((o/elemnetos_a));


        System.out.println("La desviación estandar del vector A: "+ vector_a +" es: "+ desviacion);


    }
}

