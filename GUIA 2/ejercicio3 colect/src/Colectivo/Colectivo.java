package Colectivo;

import java.util.Scanner;


public class Colectivo {
    public static void main(String[] args) {
        int valor_viaje = 10000;
        int valor_conductor = 2000;
        int capacidad;
        int personas;
        int viajes;
        int pago_conductor;
        int pago_turistas;

        System.out.println("Determina el número de personas que caben en el colectivo y el número de turistas\n" +
                "que van a un hotel, cuántos viajes debe realizar el colectivo de acuerdo a su capacidad, cuánto dinero en total deberán pagar los\n" +
                "turistas al colectivo y cuánto dinero deberá pagar el conductor al propietario");
        System.out.println("-------------------------------------------------------");

        Scanner entrada = new Scanner (System.in);

        do{
            System.out.println("Digita la capacidad de personas del Bus Colectivo");
            capacidad = entrada.nextInt (); 
        }while(capacidad <= 0);

        do{
            System.out.println("Digita el número de pasajeros");
            personas = entrada.nextInt (); 
        }while(personas <= 0);

       
        if (personas > capacidad){
            viajes = personas/capacidad;

            float viajes2 = personas % capacidad;

            if (viajes2 > 0){
                viajes = viajes + 1;
            }
        }else{
            viajes = 1;
        }

        if (viajes >1){
            System.out.println("El conductor deberá realizar: " + viajes + " viajes");
        }else{
            System.out.println("El conductor deberá realizar: " + viajes + " viaje");
        }

        
        pago_turistas = personas * valor_viaje;
        System.out.println("Los turistas deberan pagar la suma de: " + pago_turistas);

        
        pago_conductor = viajes * valor_conductor;
        System.out.println("El conductor deberá pagar la suma de: " + pago_conductor);


    }
}