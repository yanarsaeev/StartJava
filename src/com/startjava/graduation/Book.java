package com.startjava.graduation;

public class Book {
    private final String author;
    private final String name;
    private final int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return author + ", " + name + ", " + year;
    }

    public String getName() {
        return name;
    }
}
