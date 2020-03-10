package colegioperros;

import static colegioperros.Guarderiaperros.perro;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Guarderiaperros {
static List<Perro> perro = new LinkedList<>();
    static Scanner kbd = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion;
        
        do {
            System.out.println("0. Salir");
            System.out.println("1. Crear un perro");
            System.out.println("2. Mostrar perros localidad");
            System.out.print("Opcion=> ");
            opcion = kbd.nextInt();
            switch (opcion) {
                case 1:
                    crearMascota();
                    break;
                                              
                case 2:
                    
                    mostrarPerrosLocalidad();
                    break;
            }
        } while(opcion != 0);       
    }

    private static void crearMascota() {
        System.out.print("Nombre del perro: ");
        String nombre = kbd.nextLine();
                  
          {
  
        Perro perro = new perro(perro, raza, localida, cedula, 
                      nombre, telefono, dia);
        perro.add(perro);
        System.out.println("Perro creado con éxito! Hay " + 
        perro.size() + " perros(s) en la localidad!");
        }

    private static void mostrarPerrosLocalidad() {
        System.out.print("Perro a buscar: ");
        kbd.nextLine();
    String String = kbd.nextLine();
        int cont = 0;
    Iterable<Perro> Perro = null;
        
        for (Perro c : Perro) {
            String localidad = null;
            if (c.getLocalidad().equalsIgnoreCase(localidad)) {
                cont++;
                System.out.println("Perro " + cont + " con numero = "+ c.getLocalidad());
            }
        }
        if (cont == 0) {
            System.out.println("Ese perro no esta en esa localidad!!");
        }
        else {
            String usuario = null;
            System.out.println("El perro " + usuario + " tiene " + cont + 
                    " perros(s) en esta localidad!!");
        }
    }
    }
    
       
    
    
        
            
    
    

    

    
  

    
       
    
    


