package org.example.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotecario extends Persona{
    //Desarrolla la clase Bibliotecario. Heredará los atributos anteriores, pero además deseamos almacenar su puesto de
    // trabajo, NIF y contraseña. Crea constructor vacío, todos los parámetros (incluidos los de la superclase), copia,
    // getters/setters y toString (NO imprimirá los datos de la superclase).

    String puestoTrabajo;
    String NIF;
    String contrasena;

    ArrayList<Bibliotecario> bibliotecarios = new ArrayList<>();

    // Constructor
    public Bibliotecario(){}

    @Override
    public void solicitarDatosPersona(ArrayList<Usuario> usuarios, ArrayList<Bibliotecario> bibliotecarios, ArrayList<Persona> personas) {

    }

    public Bibliotecario(String nombre, String apellido1, String apellido2, String edad, String puestoTrabajo,
                         String NIF, String contrasena){
        super(nombre, apellido1, apellido2, edad);
        this.puestoTrabajo = puestoTrabajo;
        this.NIF = NIF;
        this.contrasena = contrasena;
    }
    public Bibliotecario(String nombre, String apellido1, String edad, String puestoTrabajo,
                         String NIF, String contrasena){
        super(nombre, apellido1, edad);
        this.puestoTrabajo = puestoTrabajo;
        this.NIF = NIF;
        this.contrasena = contrasena;
    }

    // get y set

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // solicitar datos de la persona
    @Override
    public  void solicitarDatosPersona(){
        // crear persona
        Bibliotecario bibliotecario = new Bibliotecario();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del usuario: ");
        bibliotecario.setNombre(sc.nextLine());

        System.out.println("Introduce el primer apellido del usuario: ");
        bibliotecario.setApellido1(sc.nextLine());

        System.out.println("Introduce el segundo apellido del usuario: ");
        bibliotecario.setApellido2(sc.nextLine());

        System.out.println("Introduce la edad del usuario: ");
        bibliotecario.setEdad(sc.nextLine());

        System.out.println("Introduce el teléfono del usuario: ");
        bibliotecario.setPuestoTrabajo(sc.nextLine());

        System.out.println("Introduce la dirección del usuario: ");
        bibliotecario.setNIF(sc.nextLine());

        System.out.println("Introduce el código postal del usuario: ");
        bibliotecario.setContrasena(sc.nextLine());

        // añadir usuario a la lista de usuarios
        bibliotecarios.add(bibliotecario);
        System.out.println("Usuario añadido correctamente");
    }

    // constructor copia
    public Bibliotecario(Bibliotecario bibliotecario){
        super(bibliotecario.getNombre(), bibliotecario.getApellido1(), bibliotecario.getApellido2(),
                bibliotecario.getEdad());
        this.puestoTrabajo = bibliotecario.getPuestoTrabajo();
        this.NIF = bibliotecario.getNIF();
        this.contrasena = bibliotecario.getContrasena();
    }

    // toString
    @Override
    public String toString() {
        return "Bibliotecario{" +
                "puestoTrabajo='" + puestoTrabajo + '\'' +
                ", NIF='" + NIF + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}
