package org.example.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

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
    ArrayList<Usuario> usuarios = new ArrayList<>();

    // Constructor
    public Usuario(){}

    @Override
    public void solicitarDatosPersona(ArrayList<Usuario> usuarios, ArrayList<Bibliotecario> bibliotecarios, ArrayList<Persona> personas) {

    }

    ;

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

    // copiar la lista de usuarios


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

    // solicitar datos de la persona
    @Override
    public  void solicitarDatosPersona(){
        // crear persona
        Usuario usuario = new Usuario();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del usuario: ");
        usuario.setNombre(sc.nextLine());

        System.out.println("Introduce el primer apellido del usuario: ");
        usuario.setApellido1(sc.nextLine());

        System.out.println("Introduce el segundo apellido del usuario: ");
        usuario.setApellido2(sc.nextLine());

        System.out.println("Introduce la edad del usuario: ");
        usuario.setEdad(sc.nextLine());

        System.out.println("Introduce el teléfono del usuario: ");
        usuario.setTelefono(sc.nextInt());

        System.out.println("Introduce la dirección del usuario: ");
        usuario.setDireccion(sc.nextLine());

        System.out.println("Introduce el código postal del usuario: ");
        usuario.setCodigoPostal(sc.nextInt());

        System.out.println("Introduce el correo electrónico del usuario: ");
        usuario.setCorreoElectronico(sc.nextLine());


        // comprobar que el correo electrónico no esta repetido
        for (Usuario newUsuario : usuarios) {
            if (newUsuario.getCorreoElectronico().equals(this.getCorreoElectronico())){
                System.out.println("El correo electrónico ya existe");
                System.out.println("Introduce otro correo: ");
                this.setCorreoElectronico(sc.nextLine());
            }
        }

        // añadir usuario a la lista de usuarios
        usuarios.add(usuario);
        System.out.println("Usuario añadido correctamente");
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
