package org.example.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Usuario {
    //Desarrolla la clase Usuario. Heredará los atributos anteriores, pero además deseamos almacenar su teléfono,
    // dirección, código postal, correo electrónico y lista de Reservas. Crea constructor vacío, todos los parámetros
    // (incluidos los de la superclase), copia, getters/setters y toString (que imprimirá también los datos de la
    // superclase).


    String nombre;
    String apellidos;
    String nif;
    String contrasenya;

    static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    // Constructor
    public Usuario() {
    }

    ;

    public Usuario(String nombre, String apellidos, String nif, String contrasenya) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
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

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public String getContraCifrada() {
        return IntStream.range(0, this.contrasenya.length())
                .mapToObj(i -> "*")
                .collect(Collectors.joining());
    }

    public static void addUsuario(ArrayList<Usuario> usuarios) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del usuario: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce los apellidos del usuario: ");
        String apellidos = sc.nextLine();
        System.out.println("Introduce el NIF del usuario: ");
        String nif = sc.nextLine();
        System.out.println("Introduce la contraseña del usuario: ");
        String contrasenya = sc.nextLine();
        controlContrasenya(contrasenya);
        Usuario usuario = new Usuario(nombre, apellidos, nif, contrasenya);
        usuarios.add(usuario);
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    // Control de la contraseña
    public static void controlContrasenya(String contrasenya) {
        while (contrasenya.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            System.out.println("Introduce la contraseña del usuario: ");
            Scanner sc = new Scanner(System.in);
            contrasenya = sc.nextLine();
        }
    }

    public static void eliminarUsuario(ArrayList<Usuario> usuarios, String deleteNif) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el NIF del usuario que quieres eliminar: ");
        String nif = sc.nextLine();
        //stream
        usuarios.removeIf(usuario -> usuario.getNif().equals(nif));
    }


    public static void listUsuarios(ArrayList<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    // Constructor copia
    public Usuario(Usuario usuario) {
        this.nombre = usuario.nombre;
        this.apellidos = usuario.apellidos;
        this.nif = usuario.nif;
        this.contrasenya = usuario.contrasenya;
    }

    // toString
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nif='" + nif + '\'' +
                ", contraseña= " + getContraCifrada() + '\'' +
                //", contraseña='" + contrasenya + '\'' +
                '}';
    }
}
