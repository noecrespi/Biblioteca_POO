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

    public static void listBibliotecarios(ArrayList<Bibliotecario> bibliotecarios) {
        for(Bibliotecario bibliotecario : bibliotecarios){
            System.out.println(bibliotecario);
        }
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

    public void solicitarDatosPersona(ArrayList<Usuario> usuarios, ArrayList<Bibliotecario> bibliotecarios, ArrayList<Persona> personas) {
        //creamos Bibliotecario
        Bibliotecario bibliotecario = new Bibliotecario();
        Scanner sc = new Scanner(System.in);

        //solicitamos datos
        System.out.println("Introduce el nombre del bibliotecario");
        bibliotecario.setNombre(sc.nextLine());

        System.out.println("Introduce el primer apellido del bibliotecario");
        bibliotecario.setApellido1(sc.nextLine());

        System.out.println("Introduce el segundo apellido del bibliotecario");
        bibliotecario.setApellido2(sc.nextLine());

        System.out.println("Introduce la edad del bibliotecario");
        bibliotecario.setEdad(sc.nextLine());

        System.out.println("Introduce el puesto de trabajo del bibliotecario");
        bibliotecario.setPuestoTrabajo(sc.nextLine());

        System.out.println("Introduce el NIF del bibliotecario");
        bibliotecario.setNIF(sc.nextLine());

        System.out.println("Introduce la contraseña del bibliotecario");
        bibliotecario.setContrasena(sc.nextLine());

        //añadimos bibliotecario a la lista de bibliotecarios
        bibliotecarios.add(bibliotecario);
        System.out.println("Bibliotecario añadido correctamente");
    }

    // solicitar datos de la persona c
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
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", edad='" + edad + '\'' +
                "puestoTrabajo='" + puestoTrabajo + '\'' +
                ", NIF='" + NIF + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}
