import java.lang.Math ;
    import java.util.Scanner;
    
    public class Pendulo {
        
       
        double longitud;
        double aceleracionGravitacional;
       
                      
        public static void main(String args[]) {
        
         Scanner teclado = new Scanner(System.in);
         double longitud = 0,aceleracionGravitacional= 0;
         boolean mantener = true;
         int opcion; 
         
         while(mantener){
            System.out.println("");
            System.out.println("");
            System.out.println("1. Crear pendulo");
            System.out.println("2. Hallar periodo del pendulo");
            System.out.println("3. Salir");
            
            opcion = teclado.nextInt(); 
            Pendulo pendulo = new Pendulo(longitud ,aceleracionGravitacional);        
            
            switch(opcion){
                case 1:
                    System.out.println("ingrese la longitud del pendulo: ");
                    longitud = teclado.nextDouble();
                    
                    System.out.println("ingrese la  aceleración gravitacional del pendulo");
                    aceleracionGravitacional = teclado.nextDouble();
                   
                    pendulo.longitud = longitud;
                    pendulo.aceleracionGravitacional = aceleracionGravitacional;
                    break;
                    
                case 2:
                   double periodo = pendulo.calcularPeriodoOscilacion(); 
                   System.out.println("el periodo del pendulo es : "+ periodo);
                   break;
                   
                case 3:
                   mantener = false;   
                   break ;
                default: 
                     System.out.println("ingreso mal la opcion");
            
            }
            }
        
        }
    
    
        public Pendulo(double longitud ,double aceleracionGravitacional){
            this.longitud = longitud;
            this.aceleracionGravitacional = aceleracionGravitacional;
        }
        
        
        
    public double calcularPeriodoOscilacion(){
           
        double periodo = (2 * Math.PI)*(Math.sqrt(this.aceleracionGravitacional/this.longitud));
        return periodo ;
        }
    }

