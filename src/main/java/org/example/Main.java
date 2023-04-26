package org.example;

import org.example.biblioteca.Biblioteca;
import org.example.biblioteca.Libro;
import org.example.biblioteca.Persona;

import java.util.ArrayList;
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
        ArrayList<Libro> libros = new ArrayList<Libro>();
        ArrayList<Persona> listaPersonal = new ArrayList<Persona>();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println( "|     MENÚ BIBLIOTECA              |\n" +
                                "\n" +
                                "|     1. Libros                    |\n" +
                                "|     2. Persona                   |\n" +
                                "\n" +
                                "|     0.Salir                      |\n");

            opcion = sc.nextInt();


            switch (opcion) {
                    case 1:
                        do {
                            boolean salir = true;
                            //while (salir) {
                            System.out.println("|     MENÚ BIBLIOTECA              |\n" +
                                    "\n" +
                                    "|        LIBROS                    |\n" +
                                    "|     1.Añadir libro               |\n" +
                                    "|     2.Eliminar libro             |\n" +
                                    "|     3.Buscar libro por ISBN      |\n" +
                                    "|     4.Buscar libro por titulo    |\n" +
                                    "|     5.Mostrar libros             |\n" +
                                    "|     6.Mostrar libros disponibles |\n" +
                                    "\n" +
                                    "|     7.Volver al menú principal   |\n" +
                                    "|     0.Salir                      |\n");
                                System.out.println("Introduce una opción : ");
                                opcion = sc.nextInt();

                            //int opcionLibro = sc.nextInt();
                            switch (opcion) {
                                case 1:
                                    Libro.addLibro(libros);
                                    break;
                                case 2:
                                    Libro.eliminarLibro(libros);
                                    break;
                                case 3:
                                    Libro.buscarLibroISBN(libros);
                                    break;
                                case 4:
                                    Libro.buscarLibroTitulo(libros);
                                    break;
                                case 5:
                                    biblioteca.mostrarLibros(libros);
                                    break;
                                case 6:
                                    biblioteca.mostrarLibrosDisponibles(libros);
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Opción incorrecta");
                                    break;
                            }
                        //}
                        break;
                    } while (opcion != 0);


                case 2:
                    do {
                        System.out.println( "|         MENÚ BIBLIOTECA          |\n" +
                                            "\n" +
                                            "|             PERSONA              |\n" +
                                            "|     1. Crear persona             |\n" +
                                            "|     2.Eliminar persona           |\n" +
                                            "|     3.Buscar persona por DNI     |\n" +
                                            "\n" +
                                            "|     0.Salir                      |\n");

                        opcion = sc.nextInt();
                        //ArrayList<Persona> listaPersonal = biblioteca.getListaPersonal();
                        switch (opcion) {

                            case 1:
                                /*Scanner sc2 = new Scanner(System.in);
                                //Scanner sc = new Scanner(System.in);
                                System.out.println("Introduce el nombre de la persona");
                                String nombre = sc2.nextLine();
                                System.out.println("Introduce los apellidos de la persona");
                                String apellidos = sc2.nextLine();
                                System.out.println("Introduce el dni de la persona");
                                String dni = sc2.nextLine();
                                System.out.println("Introduce la contraseña de la persona");
                                String contrasenya = sc2.nextLine();
                                Persona newPersona2 = new Persona(nombre, apellidos, dni, contrasenya);
                                Persona.crearPersona(newPersona2);*/
                                Persona.crearPersona(listaPersonal);

                                break;
                            case 2:
                                Scanner sc3 = new Scanner(System.in);
                                System.out.println("Introduce el dni de la persona que quieres eliminar");
                                String deleteDni = sc3.nextLine();
                                Persona.eliminarPersona(listaPersonal, deleteDni);
                                break;
                            case 3:
                                Scanner sc4 = new Scanner(System.in);
                                System.out.println("Introduce el DNI de la persona que quieres buscar:");
                                String findDni = sc4.nextLine();
                                Persona.findPersona(listaPersonal, findDni);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opción incorrecta");
                        }
            } while (opcion != 0);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 0);


    }
}