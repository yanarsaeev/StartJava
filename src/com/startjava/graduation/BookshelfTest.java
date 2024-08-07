package com.startjava.graduation;

import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        do {
            printMenu();
            menu(bookshelf);
        } while (toWork());
    }
    private static void printMenu() {
        System.out.println("""
                1. Посмотреть все книги
                2. Посмотреть все полки
                3. Добавить новую книгу
                4. Найти книгу
                5. Удалить книгу
                6. Очистить шкаф
                """);
    }


    private static void menu(Bookshelf bookshelf) {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.nextLine();
        switch (option) {
            case 1 -> bookshelf.printBooks();
            case 2 -> bookshelf.printBookcase();
            case 3 -> {
                System.out.println("Введите название книги, которую хотите добавить: ");
                String name = scanner.nextLine();
                System.out.println("Укажите автора книги: ");
                String author = scanner.nextLine();
                System.out.println("Укажите год выхода книги: ");
                int year = scanner.nextInt();
                bookshelf.addBook(new Book(name, author, year));
            }
            case 4 -> {
                System.out.println("Введите название книги, которую хотите найти: ");
                bookshelf.searchBook(scanner.nextLine());
            }
            case 5 -> {
                System.out.println("Введите название книги, которую хотите удалить: ");
                bookshelf.removeBook(scanner.nextLine());
            }
            case 6 -> bookshelf.cleanShelf();
        }
    }

    private static boolean toWork() {
        System.out.println("Для продолжения работы программы нажмите <Enter>");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().isEmpty();
    }
}
