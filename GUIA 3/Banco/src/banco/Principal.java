package banco;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Principal {
static List<Cuenta> cuentas = new LinkedList<>();
    static Scanner kbd = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion;
        
        do {
            System.out.println("0. Salir");
            System.out.println("1. Crear una cuenta");
            System.out.println("2. Mostrar todas las cuentas");
            System.out.println("3. Consignar en una cuenta");
            System.out.println("4. Retirar de una cuenta");
            System.out.println("5. Cuentas de un usuario");
            System.out.print("Opcion=> ");
            opcion = kbd.nextInt();
            switch (opcion) {
                case 1:
                    crearCuenta();
                    break;
                case 2:
                    mostrarCuentas();
                    break;
                case 3:
                    consignarCuenta();
                    break;
                case 4:
                    retirarCuenta();
                    break;
                case 5:
                    mostrarCuentasUsuario();
                    break;
            }
        } while(opcion != 0);       
    }

    private static boolean existeCuenta(int numCuenta) {
        for (Cuenta c : cuentas) {
            if (c.getNúmero() == numCuenta) {
                return true;
            }
        }
        return false;
    }
    
    private static Cuenta buscarCuenta(int numCuenta) {
        for (Cuenta c : cuentas) {
            if (c.getNúmero() == numCuenta) {
                return c;
            }
        }
        return null;
    }
    
    private static void crearCuenta() {
        System.out.print("Número de la cuenta: ");
        int num = kbd.nextInt();
        kbd.nextLine();
        System.out.print("Nombre del usuario: ");
        String nom = kbd.nextLine();
        System.out.print("Saldo inicial: ");
        int saldo = kbd.nextInt();
        
        if (existeCuenta(num)) {
            System.out.println("Ya existe una cuenta con ese número!");
        }
        else {
            Cuenta cuenta = new Cuenta(num, nom, saldo);
            cuentas.add(cuenta);
            System.out.println("Cuenta creada con éxito! Hay " + 
                    cuentas.size() + " cuenta(s) en el banco!");
        }
    }

    private static void mostrarCuentas() {
        for (Cuenta c : cuentas) {
            System.out.println(c);
        }
    }

    private static void consignarCuenta() {
        System.out.println("Número de la cuenta a consignar: ");
        int numCuenta = kbd.nextInt();
        Cuenta cuenta = buscarCuenta(numCuenta);
        if (cuenta != null) {
            System.out.println("Cuanto vas a consignar: ");
            int monto = kbd.nextInt();
            try {
                cuenta.consignar(monto);
                System.out.println("Consignación exitosa! Saldo actual: " + cuenta.getSaldo());
            }
            catch (Exception ex) {
                System.out.println("ERROR: Monto a consignar negativo!!");
            }
        }
        else {
            System.out.println("ERROR: No existe una cuenta con ese número!");
        }
    }

    private static void retirarCuenta() {
        System.out.print("Número de la cuenta de donde retiramos: ");
        int numCuenta = kbd.nextInt();
        Cuenta cuenta = buscarCuenta(numCuenta);
        if (cuenta != null) {
            System.out.println("Cuanto vas a retirar: ");
            int monto = kbd.nextInt();
            try {
                cuenta.retirar(monto);
                System.out.println("Retiro exitoso! Saldo actual: " + cuenta.getSaldo());
            }
            catch (Exception ex) {
                System.out.println("ERROR: Saldo insuficiente!");
            }
        }   
        else {
            System.out.println("ERROR: No existe una cuenta con ese número!");
        }
    }

    private static void mostrarCuentasUsuario() {
        System.out.print("Usuario a buscar: ");
        kbd.nextLine();
        String usuario = kbd.nextLine();
        int cont = 0;
        
        for (Cuenta c : cuentas) {
            if (c.getUsuario().equalsIgnoreCase(usuario)) {
                cont++;
                System.out.println("Cuenta " + cont + " con numero = "+ c.getNúmero());
            }
        }
        if (cont == 0) {
            System.out.println("Ese señor no tiene cuentas en este banco!!");
        }
        else {
            System.out.println("El señor " + usuario + " tiene " + cont + 
                    " cuenta(s) en este banco!!");
        }
    }
    
}

