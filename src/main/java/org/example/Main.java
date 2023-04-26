package org.example;

import org.example.biblioteca.Biblioteca;
import org.example.biblioteca.Libro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Crea un menú (con switch), que permita gestionar la biblioteca dando soporte a todos los métodos que se han
        // solicitado anteriormente. Puede ser interesante que haya varios menús, uno para gestionar el personal de la
        // biblioteca y otro para gestionar las reservas.

        // hacer un arraylist de libros
        Libro libro1 = new Libro(1, "El señor de los anillos", "J.R.R. Tolkien", "Minotauro", 10, 10);
        Libro libro2 = new Libro(2, "El señor de los anillos2", "J.R.R. Tolkien", "Minotauro", 10, 10);

        Biblioteca biblioteca = new Biblioteca();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println( "|     MENÚ BIBLIOTECA              |\n" +
                                "\n" +
                                "|     1. Libros                    |\n" +
                                "|     1. Biblioteca                |\n" +
                                "|     2. Persona                   |\n" +
                                "\n" +
                                "|     0.Salir                      |\n");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        System.out.println( "|     MENÚ BIBLIOTECA              |\n" +
                                "\n" +
                                "|        LIBROS                    |\n" +
                                "|     1.Añadir libro               |\n" +
                                "|     2.Eliminar libro             |\n" +
                                "|     3.Buscar libro por ISBN      |\n" +
                                "|     4.Buscar libro por titulo    |\n" +
                                "|     5.Mostrar libros             |\n" +
                                "|     6.Mostrar libros disponibles |\n" +
                                "\n" +
                                "|     7. Atras                     |\n" +
                                "|     0.Salir                      |\n");

                        opcion = sc.nextInt();
                        switch (opcion) {
                            case 1 -> {
                                Libro.addLibro();
                            }
                            case 2 -> biblioteca.eliminarLibro(libro1);
                            case 3 -> biblioteca.buscarLibroISBN(1);
                            case 4 -> biblioteca.buscarLibroTitulo("El señor de los anillos");
                            case 5 -> biblioteca.mostrarLibros();
                            case 6 -> biblioteca.mostrarLibrosDisponibles();
                            case 7 -> System.out.println("Saliendo...");
                            default -> System.out.println("Opción incorrecta");
                        }
                    }

                    break;
                case 2:
                    biblioteca.mostrarLibros();
                    break;
                case 3:
                    biblioteca.mostrarLibrosDisponibles();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 4);


    }
}