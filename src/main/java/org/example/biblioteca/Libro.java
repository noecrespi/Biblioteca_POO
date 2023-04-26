package org.example.biblioteca;


import java.util.ArrayList;
import java.util.Scanner;

//Una clase llamada Libro. Concretamente debemos almacenar: ISBN, título, autor, editorial, nº de copias y nº copias disponibles. Para esta clase debes crear constructor vacío, constructor con todos los parámetros, constructor copia, toString, getters/setters y un contador de libros (que llevará el control de los diferentes libros que hay en la aplicación, por ejemplo, si tenemos el libro Javañol y de este libro tenemos 4 copias, nuestro contador de libro marcará un libro, es decir, es un contador de títulos distintos de la a). Debe haber un control en el setter de manera que el número de copias inicial nunca debe ser menos de 1. Para esta clase además necesitaremos los siguientes métodos:
//Añadir libro. Solicitará los datos para crear un libro y añadirá dicho libro a una lista de libros que recibirá como parámetro el método. (método static)
//Eliminar libro. Solicitará al usuario un ISBN, lo buscará y lo eliminará de la lista que recibirá como parámetro el método. No se puede eliminar un libro que tiene reservas. (método static)
//Buscar libro por ISBN. Pedirá al usuario un ISBN, lo buscará en la lista que recibirá como parámetro el método. En caso de encontrarlo devolverá la posición en la que se encuentra, en caso contrario devolverá -1. (método static)
//Buscar libro por título. Pedirá al usuario un título, lo buscará en la lista que recibirá como parámetro el método. Mostrará cualquier libro que contenga la cadena buscada. (método static)
public class Libro {

    //Atributos
    int IBNS;
    String titulo;
    String autor;
    String editorial;
    int copias;
    int librosDisponibles;

    int contadorLibros = 0;


    //Constructor
    public Libro(){}

    public Libro(int IBNS, String titulo, String autor, String editorial, int copias, int librosDisponibles) {
        this.IBNS = IBNS;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.copias = copias;
        this.librosDisponibles = librosDisponibles;
    }

    //get y set
    public int getIBNS() {
        return IBNS;
    }

    public void setIBNS(int IBNS) {
        this.IBNS = IBNS;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public int getlibrosDisponibles() {
        return librosDisponibles;
    }

    public void setlibrosDisponibles(int librosDisponibles) {
        this.librosDisponibles = librosDisponibles;
    }

    // contador de libros iguales
    public int getContadorLibros() {
        return contadorLibros;
    }
    public void setContadorLibros(int contadorLibros) {
        this.contadorLibros = contadorLibros;
    }
    //contar los libros iguales
    public void contarLibros(){
        contadorLibros++;
    }

    // Añadir libro
    public static void addLibro(ArrayList<Libro> libros){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ISBN del libro");
        int IBNS = sc.nextInt();
        System.out.println("Introduce el titulo del libro");
        String titulo = sc.next();
        System.out.println("Introduce el autor del libro");
        String autor = sc.next();
        System.out.println("Introduce la editorial del libro");
        String editorial = sc.next();
        System.out.println("Introduce el numero de copias del libro");
        int copias = sc.nextInt();
        System.out.println("Introduce el numero de copias disponibles del libro");
        int librosDisponibles = sc.nextInt();

        Libro libro = new Libro(IBNS, titulo, autor, editorial, copias, librosDisponibles);
        libros.add(libro);
    }

    //Eliminar libro
    public static void eliminarLibro(ArrayList<Libro> libros){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ISBN del libro");
        int IBNS = sc.nextInt();

        for (int i = 0; i < libros.size(); i++){
            if (libros.get(i).getIBNS() == IBNS){
                libros.remove(i);
            }
        }
    }

    // Buscar libro por ISBN
    public static  Libro buscarLibroISBN(ArrayList<Libro> libros){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ISBN del libro");
        int IBNS = sc.nextInt();

        //for (int i = 0; i < libros.size(); i++){
        //    if (libros.get(i).getIBNS() == IBNS){
        //        return i;
        //    }
        //}
        // hacer con stream
        Libro findlibro =  libros.stream()
                .filter(libro -> libro.getIBNS() == IBNS).findFirst().orElse(null);
        System.out.println(findlibro);
        return findlibro;
    }

    // Buscar libro por titulo
    public static void buscarLibroTitulo(ArrayList<Libro> libros){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el titulo del libro");
        String titulo = sc.next();

        for (int i = 0; i < libros.size(); i++){
            if (libros.get(i).getTitulo().contains(titulo)){
                System.out.println(libros.get(i));
            }
        }
    }

    //toString
    @Override
    public String toString() {
        return "Libro{" + "IBNS=" + IBNS + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", copias=" + copias + ", librosDisponibles=" + librosDisponibles + '}';
    }

    //Constructor copia
    public Libro(Libro libro){
        this.IBNS = libro.IBNS;
        this.titulo = libro.titulo;
        this.autor = libro.autor;
        this.editorial = libro.editorial;
        this.copias = libro.copias;
        this.librosDisponibles = libro.librosDisponibles;
    }
}
