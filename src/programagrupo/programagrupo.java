//programa para calcular el valor de las horas extras de un trabajador en un mes teniendo los
//siguientes datos:
//-salario base: $900.000
//-horas ordinarias trabajadas
//-horas extras diurnas trabajadas
//-horas extras nocturnas trabajadas

//-horas extras diurnas: 25%
//-horas extras nocturnas: 50%

package programagrupo;

import java.util.Scanner;
public class programagrupo
{
public static void main(String[] args) 
{
   Scanner lector = new Scanner (System.in);
   
   double salario, salario_ordinario = 0, salario_extra= 0, a_pagar;
   int h_ord, e_diu, e_noc;
   
   
   System.out.println("Ingrese el salario por hora:"); 
   salario = lector.nextDouble();
   System.out.println("Ingrese la cantidad de horas ordinarias " + " trabajadas: ");
   h_ord = lector.nextInt();
   System.out.println("Ingrese la cantidad de horas extras diurnas " + " trabajadas: ");
   e_diu = lector.nextInt();
   System.out.println("Ingrese la cantidad de horas extras nocturnas " + " trabajadas: ");
   e_noc = lector.nextInt();
   
   salario_ordinario = h_ord * salario;
   salario_extra = (e_diu * salario) * 1.25 + (e_noc * salario) * 1.5;
   a_pagar = salario_ordinario + salario_extra;
   
   System.out.println("El valor de las horas extras trabajadas es:" +salario_extra);
   System.out.println("El valor a pagar al empleado es:" +a_pagar);
   
   
    }
    
}
