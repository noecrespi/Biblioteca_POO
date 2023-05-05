package org.example.biblioteca;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Reserva {

    //Desarrolla la clase Reserva. Se caracteriza por: tener un Libro, fecha y hora de la reserva. Crea constructor
    //vacío, todos los parámetros, copia, getters/setters y toString.
    String Libro;
    LocalDate fecha;
    LocalTime hora;

    static ArrayList<Reserva> reservas = new ArrayList<Reserva>();

    // Constructor
    public Reserva(){};

    public Reserva(String Libro, LocalDate fecha, LocalTime hora){
        this.Libro = Libro;
        this.fecha = fecha;
        this.hora = hora;
    }

    // Get y set
    public String getLibro() {
        return Libro;
    }

    public void setLibro(String libro) {
        Libro = libro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        //this.fecha = fecha;
        this.fecha = LocalDate.now();
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        //this.hora = hora;
        this.hora = LocalTime.now();
    }

    int ISBN;
    //reservar un libro
    public static void addReserva( ArrayList<Libro> libros,ArrayList<Usuario> usuarios,ArrayList<Bibliotecario> bibliotecarios, ArrayList<Reserva> reservas){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el ISBN del libro que quieres reservar");
        int ISBN = Integer.parseInt(sc.nextLine());
        isLibro(libros, ISBN);

        Reserva reserva = new Reserva();
        libros.stream().filter(libro1 -> libro1.getIBNS() == ISBN).forEach(libro1 -> reserva.setLibro(libro1.getTitulo()));
        reserva.setFecha(LocalDate.now());
        reserva.setHora(LocalTime.now());
        reservas.add(reserva);

        // modificar los libros disponibles
        libros.stream().filter(libro1 -> libro1.getIBNS() == ISBN).forEach(libro1 -> libro1.setlibrosDisponibles(libro1.getlibrosDisponibles() - 1));
    }

    //comprobar si existe el libro
    public static boolean isLibro(ArrayList<Libro> libros, int ISBN){
        boolean existeLibro = false;
        for (Libro libro : libros) {
            if (libro.getIBNS() == ISBN) {
                existeLibro = true;
            } else {
                System.out.println("El libro no existe");
                existeLibro = false;
            }
        }
        return existeLibro;
    }

    // To String
    @Override
    public String toString() {
        return "Reserva{" +
                "Libro='" + Libro + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                '}';
    }

}
