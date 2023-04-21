package org.example;

import org.example.bibllioteca.Libro;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // hacer un arraylist de libros
        Libro libro1 = new Libro(1, "El señor de los anillos", "J.R.R. Tolkien", "Minotauro", 10, 10);
        Libro libro2 = new Libro(2, "El señor de los anillos2", "J.R.R. Tolkien", "Minotauro", 10, 10);

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ISBN del libro");
        int isbn = sc.nextInt();

        Libro.añadirLibro(libro1, libro2);


    }
}