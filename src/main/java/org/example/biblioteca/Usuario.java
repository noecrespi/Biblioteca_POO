package org.example.biblioteca;

import java.util.ArrayList;

public class Usuario extends Persona {
    //Desarrolla la clase Usuario. Heredará los atributos anteriores, pero además deseamos almacenar su teléfono,
    // dirección, código postal, correo electrónico y lista de Reservas. Crea constructor vacío, todos los parámetros
    // (incluidos los de la superclase), copia, getters/setters y toString (que imprimirá también los datos de la
    // superclase).

    int telefono;
    String direccion;
    int codigoPostal;
    String correoElectronico;
    ArrayList<Reserva> reservas = new ArrayList<>();

    // Constructor
    public Usuario(){};

    public Usuario(String nombre, String apellido1, String apellido2, String edad, int telefono, String direccion,
                    int codigoPostal, String correoElectronico){
        super(nombre, apellido1, apellido2, edad);
        this.telefono = telefono;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.correoElectronico = correoElectronico;
    }
    public Usuario(String nombre, String apellido1, String edad, int telefono, String direccion,
                    int codigoPostal, String correoElectronico){
        super(nombre, apellido1, edad);
        this.telefono = telefono;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.correoElectronico = correoElectronico;
    }

    // Get y set
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public boolean isCorrectCP(int codigoPostal){
        if (String.valueOf(codigoPostal).length() == 5){
            return true;
        }else{
            return false;
        }
    }

    //Constructor copia
    public Usuario(Usuario usuario){
        super(usuario.getNombre(),
                usuario.getApellido1(),
                usuario.getApellido2(),
                usuario.getEdad());
        this.telefono = usuario.getTelefono();
        this.direccion = usuario.getDireccion();
        this.codigoPostal = usuario.getCodigoPostal();
        this.correoElectronico = usuario.getCorreoElectronico();
        this.reservas = usuario.getReservas();
    }

    //toString
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", edad='" + edad + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", reservas=" + reservas +
                '}';
    }
}
