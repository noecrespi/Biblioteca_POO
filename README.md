# Proyecto biblioteca
___

## Índice

1. Introducción
1. Objetivos del proyecto
1. Diseño
   1. Diagrama de componentes
      1. Apartado A
      1. Apartado B
1. Creación del documento CCF
   1. Apartado A
   1. Apartado B
1. Herramientas utilizadas
   1. IntelliJ IDEA
   1. Git


## Introducción
___

El instituto de CIFP FB Moll tiene una biblioteca la cual necesita un programa para poder gestionarla más rápido ya que actualmente se está haciendo a mano.


## Objetivos del proyecto
___

- Saber y entender el polimorfismo
- Saber y entender la herencia
- Saber y entender encapsulamiento
- Saber y entender la abstracción
- Saber y entender las colecciones
- Aprender a solucionar los problemas en una situación real
- Saber los conceptos de la POO (programación orientada a objetos)
- Aprender a usar nuevas librerías y funciones
- Aprender a manejar el git y el github
- Tener creatividad a la hora de programar


## Diseño
___
### Diagrama de componentes
Apartado A
###### Foto

Apartado B
##### foto

## Creación del documento CCF
___
### Apartado A
- `Main`: es el documento principal de la aplicación, es decir es la que arranca la aplicación. encontramos un menú principal la cual puedes elegir que apartado quieres gestionar (libros, personas o usuarios).
- La clase `Biblioteca`: gestiona  la biblioteca.
  - Almacenar las bibliotecas
  - Almacenar los libros
  - ALmacenar los empleados
  - Mostrar libros
  - Mostrar libros disponibles
- La clase `Libro`: almacena los libros que luego serán añadidos en una lista de libros.
  - Almacenar ISBN
  - Almacenar título
  - Almacenar autor
  - Almacenar editorial
  - Almacenar nº de copias
  - Almacenar nº copias disponibles
  - Crear libro
  - Eliminar libro
  - Buscar libro
- La clase `Persona`: almacena las personas.
  - Almacenar nombre
  - Almacenar apellidos
  - Almacenar dni
  - Almacenar contraseña
  - Comprobar contraseña
  - Añadir persona
  - Eliminar persona
  - Buscar persona
- La clase `Usuario`: almacena los usuarios.
  - Almacenar nombre
  - Almacenar apellidos
  - Almacenar nif
  - Almacenar contraseña
  - Cifrar la contraseña del usuario
  - Controlar longitud de la contraseña
  - Añadir usurio
  - Eliminar usuario
  - Lista de Usuarios

### Apartado B
- `Main`: es el documento principal de la aplicación, es decir es la que arranca la aplicación. encontramos un menú principal.
- La clase `Biblioteca`: gestiona  la biblioteca.
  - Almacenar las Usuarios
  - Almacenar los Bibliotecarios
  - Almacenar personas
  - Solicitar datos de la persona
- La clase `Libro`: almacena los libros que luego serán añadidos en una lista de libros.
  - Almacenar ISBN
  - Almacenar título
  - Almacenar autor
  - Almacenar editorial
  - Almacenar nº de copias
  - Almacenar nº copias disponibles
  - Crear libro
  - Eliminar libro
  - Buscar libro
- La clase `Persona`: almacena las personas.
  - Almacenar nombre
  - Almacenar primer apellido
  - Almacenar segundo apellido
  - Almacenar edad
- La clase `Usuario`: almacena los usuarios.
  - Almacenar teléfono
  - Almacenar dirección
  - Almacenar código postal
  - Almacenar correo electrónico
  - Almacenar la lista de reserva
- La clase `Reserva`: almacena los usuarios.
  - Almacenar Libro
  - Almacenar fecha
  - Almacenar hora
- La clase `Bibliotercio`: almacena los usuarios.
  - Almacenar puesto de trabajo
  - Almacenar nif
  - Almacenar contraseña
  - Dar de alta a más bibliotecarios
  - Mostrar bibliotecarios
  - Realizar reservas
  - Devolver libro
  - Interfaz Material:
  - Almacenar libro
  - Almacenar dvd’s
  - Almacenar revistas

## Herramientas utilizadas
___
### IntelliJ IDEA
El IntelliJ IDEA es un editor de código fuente (IDEA) utilizado para desarrollar el código fuente.

### Git
El Git es un software de control de versiones. En nuestro caso hemos utilizado Git como sistema de versionado de código para compartir y trabajar sobre nuestra aplicación y para mantener un registro de los cambios realizados.

