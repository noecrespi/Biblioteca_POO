package org.example.bibllioteca;

public class Persona {
    // Una clase llamada Persona. Concretamente debemos almacenar: nombre, apellidos, NIF, contraseña. Para esta
    // clase debes crear constructor con todos los parámetros, constructor copia, toString, getters/settersy un control
    // de la contraseña que debe tener al menos 8 caracteres. Crea los métodos que consideres oportunos para poder
    // añadir/eliminar personas que gestionarán la biblioteca (bibliotecarios).
    String nombre;
    String apellidos;
    String dni;
    String contrasenya;

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

    public String getContraseña() {
        return contrasenya;
    }

    public void setContraseña(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    // comprovar que la contraseña tenga una longitud de 8 aaccteres
    public String comprovarContra(){
        if (contrasenya.length() < 8){
            return "La contraseña debe tener al menos 8 caracteres";
        }else{
            return "La contraseña es correcta";
        }
    }

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
