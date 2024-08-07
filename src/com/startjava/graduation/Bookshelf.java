package com.startjava.graduation;

import java.util.Arrays;

public class Bookshelf {
    private static final int MAX_BOOKS = 10;
    private int booksCount = 0;
    private int shelfsCount = 10;
    private final Book[] books = new Book[MAX_BOOKS];

    void addBook(Book book) {
        if (booksCount == 10) {
            System.out.println("В шкафу нет места.");
            return;
        }
        booksCount++;
        shelfsCount--;
        books[booksCount - 1] = book;
        System.out.println("Книга \"" + book.getName() + "\" успешно добавлена");
    }

    void removeBook(String name) {
        for (int i = 0; i < books.length; i++) {
            if (name.equals(books[i].getName())) {
                books[i] = null;
                System.out.println("Книга была удалена");
                booksCount--;
                shelfsCount++;
                break;
            }
        }

        for (int i = 1; i < books.length; i++) {
            if (books[i - 1] == null && books[i] != null) {
                books[i - 1] = books[i];
                books[i] = null;
            }
        }

        if (booksCount == books.length) {
            System.out.println("Такой книги в шкафу нет");
        }
    }

    void searchBook(String name) {
        boolean isBook = false;
        for (int i = 0; i < booksCount; i++) {
            if (name.equals(books[i].getName())) {
                System.out.println("Книга найдена: " + books[i].toString());
                isBook = true;
                break;
            }
        }

        if (!isBook) {
            System.out.println("Книга не найдена");
        }
    }

    void printBooks() {
        if (booksCount == 0) {
            System.out.println("В шкафу нет книг");
            return;
        }

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].toString());
            }
        }
    }

    void cleanShelf() {
        Arrays.fill(books, null);
        shelfsCount = 10;
        booksCount = 0;
    }

    void printBookcase() {
        if (booksCount == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу.");
            return;
        }
        System.out.println("В шкафу книг - " + booksCount + ", свободно полок - " + shelfsCount);
        for (int i = 0; i < booksCount; i++) {
            System.out.println("| " + books[i].toString() +
                    "\n|--------------------------------------------|");
        }
        System.out.println("|                                            |");
    }
}
