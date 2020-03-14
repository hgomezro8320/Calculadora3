
import java.util.Scanner;

public class Menu
{
    
    private static Scanner entrada=new Scanner (System.in);
    
    public static void main (String[] args)
    {
     int opcion=0;    
     while(opcion!=4)
     {
      System.out.println ("\nMenu Principal del Sistema de Empleados");
      System.out.println ("\n");      
      System.out.println ("Escoja una de las sigientes opciones: ");
      System.out.println("1.Mostar todos los empleados");
      System.out.println("2.Buscar un empleado");
      System.out.println("3.Ingresar nuevo empleado");
      System.out.println("4. Salir ");
      System.out.print("INGRESE LA OPCION: ");
      opcion=entrada.nextInt();
      switch(opcion)
      {
         case 1:{ //imprimir toda la base de datos
            Consultas.Todos();
         } 
         break; 
         case 2:{ //imprimir un empleado especifico
            Consultas.Unempleado();
         } 
         break;
         case 3:{ //imprimir un empleado especifico
            Consultas.Ingreso();
         } 
         break;
         case 4:{
            System.exit(0);
         }
      }
     }
    }
}
