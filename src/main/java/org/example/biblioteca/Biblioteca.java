package org.example.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    // Una clase llamada Biblioteca. Concretamente debemos almacenar: nombre de la biblioteca, lista de libros y lista de
    // personal que gestiona la biblioteca. Para esta clase debes crear constructor vacío, constructor con todos los
    // parámetros, constructor copia, toString, getters/setters. Debe haber un control en el setter de manera que el
    // nombre de la biblioteca empiece en mayúsculas.
    // Mostrar libros. Imprimirá por pantalla toda la lista de libros. (método instancia)
    // Mostrar libros disponibles. Solo imprime la lista de los libros disponibles. (método instancia)
    //

    String nombreBiblioteca;
    ArrayList<Libro> listaLibros = new ArrayList<Libro>();
    ArrayList<Persona> listaPersonal = new ArrayList<Persona>();

    //instancia
    Biblioteca bibliotecaPalma = new Biblioteca("biblioteca Palma", listaLibros, listaPersonal);
    //Biblioteca bibliotecaInca = new Biblioteca("biblioteca Inca", listaLibros, listaPersonal);

    // Constructor
    public Biblioteca(){};

    public Biblioteca(String nombreBiblioteca, ArrayList<Libro> listaLibros, ArrayList<Persona> listaPersonal){
        this.nombreBiblioteca = nombreBiblioteca;
        this.listaLibros = listaLibros;
        this.listaPersonal = listaPersonal;
    }

    // Get y set

    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        // biblioteca empiece en mayúsculas
        this.nombreBiblioteca = nombreBiblioteca.substring(0, 1).toUpperCase() + nombreBiblioteca.substring(1);
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ArrayList<Persona> getListaPersonal() {
        return listaPersonal;
    }

    public void setListaPersonal(ArrayList<Persona> listaPersonal) {
        this.listaPersonal = listaPersonal;
    }

    // constructor copia
    public Biblioteca(Biblioteca biblioteca){
        this.nombreBiblioteca = biblioteca.nombreBiblioteca;
        this.listaLibros = biblioteca.listaLibros;
        this.listaPersonal = biblioteca.listaPersonal;
    }

    public void mostrarLibros(ArrayList<Libro> listaLibros){
        listaLibros.stream().forEach(System.out::println);
    }

    public void mostrarLibrosDisponibles(ArrayList<Libro> listaLibros){

        long isLibros = listaLibros.stream().filter(libro -> libro.getlibrosDisponibles() >0 ).count();

        if ( isLibros > 0){
            listaLibros.stream().filter(libro -> libro.getlibrosDisponibles() >0 ).forEach(System.out::println);
        } else {
            System.out.println("No hay libros disponibles");
        }

    }


    // toString
    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombreBiblioteca='" + nombreBiblioteca + '\'' +
                ", listaLibros=" + listaLibros +
                ", listaPersonal=" + listaPersonal +
                '}';
    }
}
