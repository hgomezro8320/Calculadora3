 
import java.util.Scanner;
    public class Ascensor {
        int pisoActual;
        int edificioPisos;
        int numerosSotanos;
                
        public static void main(String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        int edificioPisos  = 0;
        int numerosSotanos = 0;
        int pisoActual     = 0;
        int opcionSeleccionada; 
        boolean mantener   = true;

         
         while(mantener){  
            System.out.println("");
            System.out.println("");
            System.out.println("**********************************");
            System.out.println("1) Crear ascensor");
            System.out.println("2) Hallar piso siguiente hacia Arriba");
            System.out.println("3) Hallar piso siguiente hacia Abajo");
            System.out.println("4) Número de pisos que se sirven:");
            System.out.println("5) Salir");
            opcionSeleccionada = teclado.nextInt(); 
            Ascensor ascensor = new Ascensor(edificioPisos,numerosSotanos,pisoActual);
            switch(opcionSeleccionada){
                case 1:
                    System.out.println("ingrese cuantos pisos(sin incluir numerosSotanos) tiene el edificio : ");
                    edificioPisos = teclado.nextInt();
                    
                    System.out.println("ingrese cuantos numerosSotanos tiene el edificio");
                    numerosSotanos = teclado.nextInt();
                    
                    System.out.println("ingrese el piso actual del ascenor");
                    pisoActual = teclado.nextInt();
                   
                    ascensor.edificioPisos =  edificioPisos;
                    ascensor.numerosSotanos =   numerosSotanos;
                    ascensor.pisoActual =  pisoActual;
                     break;
                case 2:
                   ascensor.pisoArriba();
                break;
                
                case 3:
                   ascensor.pisoAbajo();   
                break ;
                case 4:
                   ascensor.pisosAtender();
                break ;
                case 5:
                   mantener = false;   
                   break ;
                default: 
                     System.out.println("Opcion seleccionada NO DIsponible");
            
            }
            }
        
        }
        
        
        
        public Ascensor(int edificioPisos , int numerosSotanos, int pisoActual){
           this.edificioPisos  = edificioPisos;
           this.pisoActual     = pisoActual;
           this.numerosSotanos = numerosSotanos ;
        }
       
        public void pisoArriba(){
           int pisoSiguiente ;
        if(pisoActual < edificioPisos ){
            if( pisoActual == -1 )
            {
                pisoSiguiente = 1;
            }
            else
            {
                pisoSiguiente = (pisoActual + 1) ;            
            }
             System.out.println("el siguiente piso es :" + pisoSiguiente);
        }else{
             System.out.println("Has llegado al Limite, No se puede subir más");
        }   
        }
       
        public void pisoAbajo(){
        if(pisoActual >(-numerosSotanos)){
            int pisoSiguiente;
            if( pisoActual == 1 )
            {
                pisoSiguiente = -1;
            }
            else
            {
                pisoSiguiente = (pisoActual - 1) ;
            }
            System.out.println("El siguiente piso es:" + pisoSiguiente);
        }else{
             System.out.println("No se puede bajar más");
        }   
        }
       
        public void pisosAtender(){
        int totalPisos= numerosSotanos + edificioPisos ;
        System.out.println("Numero de pisos que puede atender es:" + totalPisos);
        }
       
        } 
