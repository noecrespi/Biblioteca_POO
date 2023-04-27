package org.example.biblioteca;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {

    //Desarrolla la clase Reserva. Se caracteriza por: tener un Libro, fecha y hora de la reserva. Crea constructor
    //vacío, todos los parámetros, copia, getters/setters y toString.
    String Libro;
    LocalDate fecha;
    LocalTime hora;

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
