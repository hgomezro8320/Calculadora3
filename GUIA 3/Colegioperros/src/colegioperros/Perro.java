package colegioperros;

import java.util.Scanner;


public class Perro {
    
    // Atributos
    private String perro;
    private String raza;
    private String localidad;
    private String cedula;
    private String nombre;
    private String telefono;
    private String dia;
    
    
    // Constructor
    
    public Perro(String perroc, String razac, String localidac, String cedulac, 
                      String nombrec, String telefonoc, String diac) {
       this.perro=perroc; 
       this.raza=razac;
       this.localidad=localidac;
       this.cedula=cedulac;
       this.nombre=nombrec;
       this.telefono=telefonoc;
       this.dia=diac;
    }

    public String getPerro() {
        return perro;
    }

    public void setPerro(String perro) {
        this.perro = perro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    String size() {
        return null;
        
    }

    void add(Perro perro) {
       
    }

    }

    
    

    