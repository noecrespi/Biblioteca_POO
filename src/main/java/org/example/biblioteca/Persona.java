package org.example.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;




public class Persona {
    // Una clase llamada Persona. Concretamente debemos almacenar: nombre, apellidos, NIF, contraseña. Para esta
    // clase debes crear constructor con todos los parámetros, constructor copia, toString, getters/settersy un control
    // de la contraseña que debe tener al menos 8 caracteres. Crea los métodos que consideres oportunos para poder
    // añadir/eliminar personas que gestionarán la biblioteca (bibliotecarios).
    String nombre;
    String apellidos;
    String dni;
    String contrasenya;

    Biblioteca biblioteca = new Biblioteca();
    ArrayList<Persona> listaPersonal = biblioteca.getListaPersonal();

    // Constructor
    public Persona(){};

    public Persona(String nombre, String apellidos, String dni, String contrasenya){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.contrasenya = contrasenya;
    }

    // Get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    // comprobar que la contraseña tenga una longitud de 8 aaccteres
    public boolean comprobarContra(){
        if (contrasenya.length() < 8){
            return true;
        }else{
            return false;
        }
    }

    // añadir persona
    public void crearPersona(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de la persona");
        String nombre = sc.nextLine();
        System.out.println("Introduce los apellidos de la persona");
        String apellidos = sc.nextLine();
        System.out.println("Introduce el dni de la persona");
        String dni = sc.nextLine();
        System.out.println("Introduce la contraseña de la persona");
        String contrasenya = sc.nextLine();
        Persona newPersona = new Persona(nombre, apellidos, dni, contrasenya);
        listaPersonal.add(newPersona);
    };
    public void addPersona(Persona persona){
        crearPersona();
    };

    public void eliminarPersona(Persona persona){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dni de la persona que quieres eliminar");
        String din = sc.nextLine();
        listaPersonal.remove(persona);
    };

    // to string
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", contraseña='" + contrasenya + '\'' +
                '}';
    }

    // Constructor copia
    public Persona(Persona persona){
        this.nombre = persona.nombre;
        this.apellidos = persona.apellidos;
        this.dni = persona.dni;
        this.contrasenya = persona.contrasenya;
    }

}
