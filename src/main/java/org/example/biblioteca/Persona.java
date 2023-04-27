package org.example.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;


public class Persona {

    //Desarrolla la clase Persona. Se caracteriza por: nombre, apellido1, apellido2, edad. Crea constructor vacío,
    // todos los parámetros, copia, getters/setters y toString.

    String nombre;
    String apellido1;
    String apellido2;
    String edad;

    // Constructor
    //tiene tres constructores ya que la persona puede que no tenga segundo apellido
    public Persona(){};

    public Persona(String nombre, String apellido1, String apellido2, String edad){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido1, String edad){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.edad = edad;
    }

    // Get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    //Constructor copia
    public Persona(Persona persona){
        this.nombre = persona.nombre;
        this.apellido1 = persona.apellido1;
        this.apellido2 = persona.apellido2;
        this.edad = persona.edad;
    }

    //to String
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }



}
