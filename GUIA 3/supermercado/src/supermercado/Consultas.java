
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Consultas
{
    private static List<Empleados> basedatos = new ArrayList <>();
    private static Scanner entrada=new Scanner (System.in);
    private static int contador;
    public static void Todos ()
    {
        System.out.print("\n");
        for (contador=0;contador<basedatos.size();contador++)
        {
            Empleados colaborador=basedatos.get(contador);
            System.out.println("__________________________________________________________________");
            System.out.println("ID");
            System.out.println("Nombre: "+colaborador.InfNombre());
            System.out.println("Departamento: "+colaborador.InfDepartamento());
            System.out.println("posicion: "+colaborador.InfPosicion());
            System.out.println("salario: "+colaborador.InfSalario());
            
            
        }
         System.out.println("__________________________________________________________________");
    }
    
    public static void Unempleado ()
    {
        System.out.print("\n");
        String buscar;
        System.out.print("Digite el Nombre del empleado: ");
        buscar=entrada.next();
        
        for (Empleados colaborador:basedatos)
        {
            if (colaborador.InfNombre().equalsIgnoreCase(buscar))
            {
            System.out.println("__________________________________________________________________");
            System.out.println("ID");
            System.out.println("Nombre: "+colaborador.InfNombre());
            System.out.println("Departamento: "+colaborador.InfDepartamento());
            System.out.println("posicion: "+colaborador.InfPosicion());
            System.out.println("salario: "+colaborador.InfSalario());
            
            }
        }
         System.out.println("__________________________________________________________________");
    }
    
    public static void Ingreso ()
    {
    String id;
    String nombre;
    String departamento;
    String posicion;
    String salario;
    
    System.out.print ("Ingrese el nombre del empleado: ");
    nombre=entrada.nextLine();
    System.out.print ("Ingrese el departamento del empleado: ");
    departamento=entrada.nextLine();
    System.out.print ("Ingrese el posicion del empleado: ");
    posicion=entrada.nextLine();
    System.out.print ("Ingrese el salario del empleado: ");
    salario=entrada.nextLine();
    
    Empleados colaborador = new Empleados (nombre, departamento,posicion, salario);
    basedatos.add (colaborador);
    
    System.out.println ("Los datos fueron guardados exitosamente ");
    }
}