package org.colecciones;

import org.colecciones.entidades.Book;
import org.colecciones.entidades.BookCollection;

public class App
{
    public static void main( String[] args )
    {
        BookCollection books = new BookCollection();
        books.addBook(new Book("9788422616337", "El Señor de los Anillos", "J.R.R. Tolkien", 800));
        books.addBook(new Book("9788445077528", "El Hobbit", "J.R.R. Tolkien", 350));
        books.addBook(new Book("9788466316781", "Cabo Trafalgar", "Arturo Pérez Reverte", 320));
        books.addBook(new Book("9788493975074", "El corazón de la piedra", "José María García López", 560));
        books.addBook(new Book("9788493291488", "Salmos de vísperas", "Esteban Hernández Castelló", 95));
        books.addBook(new Book("9788420685625", "La música en las catedrales españolas del Siglo de Oro", "Robert Stevenson", 600));
        books.addBook(new Book("9788423913077", "Luces de bohemia", "Ramón del Valle-Inclán", 296));
        books.addBook(new Book("9788448031121", "Contando atardeceres", "La vecina rubia", 528));
        books.addBook(new Book("9781529342079", "The Master: The Brilliant Career of Roger Federer", "Christopher Clarey", 456));
        books.addBook(new Book("9788408264385", "La teoría de los archipiélagos", "Alice Kellen", 300));
        books.addBook(new Book("9788423362479", "Esperando al diluvio", "Dolores Redondo", 576));
        books.addBook(new Book("9788466367349", "El italiano", "Arturo Pérez Reverte", 400));
        books.addBook(new Book("9788466359290", "Línea de fuego", "Arturo Pérez Reverte", 688));

        System.out.println("Cantidad de libros con más de 500 paginas: " + books.pages500());
        System.out.println();

        System.out.println("Cantidad de libros con menos de 300 páginas: " + books.pages300());
        System.out.println();

        System.out.println("Listar el título de todos aquellos libros con más de 500 páginas: ");
        books.titleBooks500();
        System.out.println();

        System.out.println("Obtener el título de los 3 libros con mayor número de páginas: ");

        System.out.println();

        System.out.println("Cantidad total de páginas de todos los libros: " + books.pagesSum());
        System.out.println();

        System.out.println("Obtener todos aquellos libros que superen el promedio en cuanto a número de páginas se refiere: ");
        books.booksAvgPages();
        System.out.println();

        System.out.println("Obtener los autores de todos los libros, sin repetir nombres de autores: ");
        books.booksAuthor();
        System.out.println();

        System.out.println("Autores repetidos: ");
        books.authorsRepeatTimes();

        System.out.println("Obtener el libro con mayor número de páginas: ");

    }
}