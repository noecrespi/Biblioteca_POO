package org.example.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Usuario extends Persona {
    //Desarrolla la clase Usuario. Heredará los atributos anteriores, pero además deseamos almacenar su teléfono,
    // dirección, código postal, correo electrónico y lista de Reservas. Crea constructor vacío, todos los parámetros
    // (incluidos los de la superclase), copia, getters/setters y toString (que imprimirá también los datos de la
    // superclase).

    static int telefono;
    String direccion;
    int codigoPostal;
    String correoElectronico;
    private String contrasenya;
    ArrayList<Reserva> reservas = new ArrayList<>();


    // Constructor
    public Usuario(){}


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

    public String getContraCifrada() {
        return IntStream.range(0, this.contrasenya.length())
                .mapToObj(i -> "*")
                .collect(Collectors.joining());
    }

    public boolean isCorrectCP(int codigoPostal){
        if (String.valueOf(codigoPostal).length() == 5){
            return true;
        }else{
            return false;
        }
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

    /*public static void eliminarUsuario(ArrayList<Usuario> usuarios, String deleteNif) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el NIF del usuario que quieres eliminar: ");
        String nif = sc.nextLine();
        //stream
        usuarios.removeIf(usuario -> usuario.getNif().equals(nif));
    }*/


    public static void listUsuarios(ArrayList<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }


    // solicitar datos de la persona
    public void solicitarDatosPersona(ArrayList<Usuario> usuarios, ArrayList<Bibliotecario> bibliotecarios, ArrayList<Persona> personas){
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
        usuario.setTelefono(Integer.parseInt(sc.nextLine()));

        System.out.println("Introduce la dirección del usuario: ");
        usuario.setDireccion(sc.nextLine());

        System.out.println("Introduce el código postal del usuario: ");
        usuario.setCodigoPostal(Integer.parseInt(sc.nextLine()));

        System.out.println("Introduce el correo electrónico del usuario: ");
        usuario.setCorreoElectronico(sc.nextLine());


        // comprobar que el correo electrónico no esta repetido
        boolean correoRepetido = false;
        for (Usuario usuario1 : usuarios) {
            if (usuario1.getCorreoElectronico().equals(usuario.getCorreoElectronico())) {
                correoRepetido = true;
                System.out.println("El correo electrónico ya está registrado.");
                System.out.println("Introduce el correo electrónico del usuario: ");
                usuario.setCorreoElectronico(sc.nextLine());
            }
        }

        // añadir usuario a la lista de usuarios
        usuarios.add(usuario);
        System.out.println("Usuario añadido correctamente");
    }

    //añadir y cambiar contraseña
    public static void changePassword(ArrayList<Usuario> usuarios){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el telefono del usuario: ");
        int telefono = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el mail del usuario: ");
        String correoElectronico = sc.nextLine();

        for(Usuario usuario : usuarios){
            if(usuario.getTelefono() == telefono && usuario.getCorreoElectronico().equals(correoElectronico)){
                System.out.println("Introduce la nueva contraseña: ");
                String contrasenya = sc.nextLine();
                controlContrasenya(contrasenya);
                usuario.setContrasenya(contrasenya);
                System.out.println("Contraseña cambiada correctamente.");
            }
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
                ", contraseña='" + getContraCifrada() + '\'' +
                ", reservas=" + reservas +
                '}';
    }
}
