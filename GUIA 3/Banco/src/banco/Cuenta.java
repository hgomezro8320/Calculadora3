package banco;

import java.text.DecimalFormat;


public class Cuenta {
    
    // Atributos
    private int número;
    private String usuario;
    private int saldo;
    
    // Constructor
    public Cuenta(int número, String usuario, int saldo) {
        this.número = número;
        this.usuario = usuario;
        this.saldo = saldo;
    }

    public int getNúmero() {
        return número;
    }

    public void setNúmero(int número) {
        this.número = número;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("$###,###.##");
        String saldoStr = format.format(saldo);
        return "Cuenta{" + "número=" + número + ", usuario=" + usuario + ", saldo=" + saldoStr + '}';
    }
   
    public void consignar(int monto) throws Exception {
        if (monto > 0) {
            this.saldo += monto;
        }
        else {
            throw new Exception("No se puede consignar valores negativos");
        }
    }
    
    public void retirar(int monto) throws Exception {
        if (monto <= saldo) {
            this.saldo -= monto;
        }
        else {
            throw new Exception("Saldo insuficiente!");
        }
    }
    
}
