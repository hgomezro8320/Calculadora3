//programa para calcular el valor de las horas extras de un trabajador en un mes teniendo los
//siguientes datos:
//-salario base: $900.000
//-horas ordinarias trabajadas
//-horas extras diurnas trabajadas
//-horas extras nocturnas trabajadas

//-horas extras diurnas: 25%
//-horas extras nocturnas: 75%

package programagrupo;

import java.util.Scanner;
public class programagrupo
{
public static void main(String[] args) 
{
   Scanner lector = new Scanner (System.in);
   
   double valor_hora, salario_ordinario = 0, salario_extra= 0, a_pagar;
   int hora_ordinaria, horas_extras_diurnas, horas_extras_nocturnas;


   System.out.println("Ingrese el valor de la hora de acuerdo a su salario:");
   valor_hora = lector.nextDouble();
   
   System.out.println("Ingrese la cantidad de horas ordinarias trabajadas: ");
   hora_ordinaria = lector.nextInt();
   
   System.out.println("Ingrese la cantidad de horas extras diurnas trabajadas: ");
   horas_extras_diurnas = lector.nextInt();
   
   System.out.println("Ingrese la cantidad de horas extras nocturnas trabajadas: ");
   horas_extras_nocturnas = lector.nextInt();

  salario_ordinario = hora_ordinaria * valor_hora;
  salario_extra = (horas_extras_diurnas * valor_hora) * 1.25 + (horas_extras_nocturnas * valor_hora) * 1.75;
  a_pagar = salario_ordinario + salario_extra;

  System.out.println("El valor de las horas extras trabajadas es:" + salario_extra);
  System.out.println("El valor a pagar al empleado es:" + a_pagar);
   
   
    }
    
}
