package org.colecciones.entidades;

import java.util.ArrayList;

public class BookCollection {
    // ¿Qué tipo de colección es la más adecuada para almacenar los libros?

    ArrayList<Book> books;
    public BookCollection() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public int pages500(){
        int bookPages500 = 0;
        for (Book book : books) {
            if(book.pages() > 500){
                bookPages500++;
            }
        }
        return bookPages500;
    }

    public int pages300(){
        int bookPages300 = 0;
        for (Book book : books) {
            if(book.pages() < 300){
                bookPages300++;
            }
        }
        return bookPages300;
    }

    public void titleBooks500(){
        for (Book book : books) {
            if(book.pages() > 500){
                System.out.println(book.title());
            }
        }
    }

    /*public void titleBooksMorePages(ArrayList<Book> books){
        books.sort();
        for (Book book : books) {

        }
    }
    */

    public int pagesSum(){
        int bookPagesSum = 0;
        for (Book book : books) {
            bookPagesSum += book.pages();
        }
        return bookPagesSum;
    }

    public void booksAvgPages(){
        int totalBookPages = 0;
        int bookPagesAvg = 0;
        for (Book book : books) {
            totalBookPages += book.pages();
        }
        bookPagesAvg = totalBookPages / books.size();
        for(Book book : books){
            if (book.pages() > bookPagesAvg) {
                System.out.println(book.title());
            }
        }
    }

    public void booksAuthor(){
        ArrayList<String> authors = new ArrayList<>();
        for (Book book : books) {
            if(!authors.contains(book.author())){
                authors.add(book.author());
            }
        }
        for(String author : authors){
            System.out.println(author);
        }
    }

    public void authorsRepeatTimes(){
        ArrayList<String> authors = new ArrayList<>();
        for (Book book : books) {
            if(!authors.contains(book.author())){
                authors.add(book.author());
            }
        }
        for(String author : authors){
            int repeatAuthor = 0;
            for(Book book : books){
                if(book.author().equals(author)){
                    repeatAuthor++;
                }
            }
            if(repeatAuthor >= 2){
                System.out.println(author);
            }
        }
    }

    /*public void bookMorePages(ArrayList<Book> books){
        books.sort();
    }*/

    // Crea los métodos solicitados en el enunciado del ejercicio
}
