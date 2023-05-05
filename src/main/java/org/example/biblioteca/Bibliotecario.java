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

    //iniciar sesion
    //Nuestro sistema debe dar soporte para realizar reservas y devolver libros. Las reservas las realiza únicamente un bibliotecario, que previamente ha realizado el login (NIF+contraseña),
    public static void iniciarSesion(ArrayList<Bibliotecario> bibliotecarios) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu NIF");
        String NIF = sc.nextLine();
        System.out.println("Introduce tu contraseña");
        String contrasena = sc.nextLine();

        for(Bibliotecario bibliotecario : bibliotecarios){
            if(bibliotecario.getNIF().equals(NIF) && bibliotecario.getContrasena().equals(contrasena)){
                System.out.println("Bienvenido " + bibliotecario.getNombre());
                System.out.println("¿Que quiere reservar un libro o devolverlo?\n +" +
                        "1. Reservar\n " +
                        "2. Devolver");
                return;
            }
        }
        System.out.println("Usuario o contraseña es incorrecta");
    }

    //reservar libro
    // El método reservarLibro, pedirá al usuario el teléfono y el correo electrónico, si coincide, le permitirá
    // realizar la reserva, y por tanto, solicitará el ISBN del libro, y en consecuencia quedará completa la información
    //de la reserva (revisa la clase Reserva). Debes tener en cuenta que debes actualizar la clase Libro, con la
    // información de libros disponibles, y obviamente se debe tener en cuenta que no podrá reservar si no hay unidades
    // disponibles.

    public static void reservarLibro(ArrayList<Libro> libros, ArrayList<Usuario> usuarios, ArrayList<Bibliotecario> bibliotecarios, ArrayList<Reserva> reservas) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de telefono del usuario");
        int telefono = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el correo electronico del usuario");
        String correo = sc.nextLine();

        //comprobamos que el usuario existe

        boolean existe = false;
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreoElectronico().equals(correo) && usuario.getTelefono() == telefono) {
                existe = true;
            } else {
                System.out.println("El usuario no existe, el correo o el telefono no coinciden o no existe");
            }
        }
        // llamamos al metodo de la clase reserva
        if (existe) {
            Reserva.addReserva(libros, usuarios, bibliotecarios, reservas);
        }
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
