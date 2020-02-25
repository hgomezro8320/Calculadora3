package ConversorUnidades;

import java.util.Scanner;

public class ConversorUnidades {

   
    public static void main(String[] args) {
        double total;
        String respuesta="";
        double pies = 0.0833;
        double centimetro = 2.54;
        double legua = 190080.02;
        double yarda = 36;
        String medida ="";
        double numero;

        System.out.println("Convertidor de Pies, Centimetros, Leguas y Yardas a Pulgadas");
        System.out.println("------------------------------------------------------------");

        Scanner entrada = new Scanner (System.in); 
        do{
            System.out.println("Digita la letra correspondiente a la Medida ('P’ para pie,\n" +
                    "‘C’ para centímetro, ‘L’ para legua, y ‘Y’ para yarda)");
            medida = entrada.nextLine (); 
        }while (medida.equals(""));
        do{
            System.out.println("Digita la medida mayor que 0");
            numero = entrada.nextDouble (); 
        }while(numero <= 0);

        
        if (medida.equals("P") || medida.equals("p")){
            total = pies * numero;
            respuesta = numero + " Pies es igual a " + total + " pulgadas";
        }else{
           
            if (medida.equals("C") || medida.equals("c")){
                total = centimetro * numero;
                respuesta = numero + " Centimetros es igual a " + total + " pulgadas";
            }else{
                if (medida.equals("L") || medida.equals("l")){
                    total = legua * numero;
                    respuesta = numero + " Leguas es igual a " + total + " pulgadas";
                }else{
                    if (medida.equals("Y") || medida.equals("y")){
                        total = yarda * numero;
                        respuesta = numero + " Yardas es igual a " + total + " pulgadas";
                    }else{
                        System.out.println("Digite una Letra de medida válida, y ejecute el programa nuevamente");
                    }
                }
            }
        }



        System.out.println(respuesta);
    }

}