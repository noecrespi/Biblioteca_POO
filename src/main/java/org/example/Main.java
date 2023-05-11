package org.example;

import org.example.biblioteca.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Incluye en el menú, para que el bibliotecario, pueda dar de alta más bibliotecarios (compañeros de trabajo), y usuarios, de manera que utilizará el método anterior. Aclaración: tendremos un arraylist de persona, lo que ocurre es que nunca almacenaremos personas, sino Usuarios o Bibliotecarios, por tanto, se entiende que la clase Persona será una clase abstracta. En consecuencia, el menú de gestión del bibliotecario llamará a solicitarDatosPersona para un usuario o para un bibliotecario, y cuando hayamos completado esta información dicha instancia se añadirá a la lista de Personas.
        Usuario usuario1 = new Usuario("Paco", "C", "P", "12", 648, "direccion", 28030 ,"mail");
        Bibliotecario bibliotecario1 = new Bibliotecario("julio", "C", "P", "12", "direccion", "123N" ,"123");


        Biblioteca biblioteca = new Biblioteca();
        ArrayList<Libro> libros = new ArrayList<Libro>();
        ArrayList<Persona> personas = new ArrayList<Persona>();
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        ArrayList<Bibliotecario> bibliotecarios = new ArrayList<Bibliotecario>();
        ArrayList<Reserva> reservas = new ArrayList<Reserva>();

        Scanner sc = new Scanner(System.in);


        Persona.allPersonas(usuarios, bibliotecarios, personas, usuario1, bibliotecario1);
        // menu
        boolean salir = true;
        //boolean salirLibros = true;
        int opcion;

        while (salir) {
            //do {
                System.out.println(
                        "|     MENÚ BIBLIOTECA                               |\n" +
                        "\n" +
                        "|     1. Libros                                     |\n" +
                        "|     2. Usuario                                    |\n" +
                        "|     3. Bibliotecario                              |\n" +
                        "|     4. Mostrar todas las personas registradas     |\n" +
                        "\n" +
                        "|     0.Salir                      |\n");

                opcion = sc.nextInt();
            //}while (opcion < 0 || opcion > 4);



            switch (opcion) {

                    case 1:
                        boolean salirMenu1 = true;
                        while (salirMenu1) {

                            //boolean salirLibros = true;
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
                            int opcionLibro = sc.nextInt();

                            switch (opcionLibro) {
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
                                case 7:
                                    salirMenu1 = false;
                                    break;
                                case 0:
                                    salir = false;
                                    //salirMenu = false;
                                    break;
                                default:
                                    System.out.println("Opción incorrecta");
                                    break;
                            }

                        }break;

                    case 2:
                        boolean salirMenu = true;
                        while (salirMenu){
                        System.out.println("""
                                |         MENÚ BIBLIOTECA          |

                                |             USUARIO              |
                                |     1. Crear usuario             |
                                |     2. Lista de usuarios         |
                                |     3. Salir del menu            |
                                

                                |     0.Salir                      |
                                """);

                        int opcionUsuario2 = sc.nextInt();
                        //ArrayList<Persona> listaPersonal = biblioteca.getListaPersonal();
                        switch (opcionUsuario2) {

                            case 1:
                                Usuario usuario = new Usuario();
                                usuario.solicitarDatosPersona(usuarios, bibliotecarios, personas);
                                break;
                            case 2:
                                Usuario.listUsuarios(usuarios);
                                break;
                            case 3:
                                salirMenu = false;
                                //salir = false;
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opción incorrecta");
                                break;
                        }
                        }
                        break;
                    case 3:
                        boolean salirMenu3 = true;
                        while (salirMenu3){
                        System.out.println("""
                                |         MENÚ BIBLIOTECA          |

                                |         BIBLIOTECARIO            |
                                |     1. Crear bibliotecario       |
                                |     2. Lista de bibliotecarios   |
                                |     3. Iniciar sesión            |
                                |     4. Volver al menu principal  |
                                                                
                                |     0.Salir                      |
                                """);


                        int opcionBibliotecario = sc.nextInt();
                        //ArrayList<Persona> listaPersonal = biblioteca.getListaPersonal();
                        switch (opcionBibliotecario) {
                            case 1:
                                Bibliotecario bibliotecario = new Bibliotecario();
                                bibliotecario.solicitarDatosPersona(usuarios, bibliotecarios, personas);
                                break;
                            case 2:
                                Bibliotecario.listBibliotecarios(bibliotecarios);
                                break;
                            case 3:
                                Bibliotecario.iniciarSesion(bibliotecarios, libros,usuarios, reservas);
                                break;
                            case 4:
                                salirMenu3 = false;
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opción incorrecta");
                                break;
                        }
                        }
                        break;

                    case 4:
                        System.out.println("Lista de personas registradas");
                        //crear un usuario y un bibliotecario
                        //Persona persona = new Persona();

                        //añadirlos a la lista de personas
                        Persona.allPersonas(usuarios, bibliotecarios, personas, usuario1, bibliotecario1);
                        Persona.printPersonas(personas);
                        break;
                    case 0:
                        salir = false;
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                        break;
                }
            }
    }
}