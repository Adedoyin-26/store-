package org.example.models;

import org.example.enums.BookCategories;

public class Book {
    public static int count = 0;
    private int id;
    private String title;
    private String author;
    BookCategories bookCategories;
    private int quantity;

    public Book() {
    }

    public Book(String title, String author, BookCategories bookCategories, int quantity) {
        this.id = count;
        this.title = title;
        this.author = author;
        this.bookCategories = bookCategories;
        this.quantity = quantity;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookCategories getBookCategories() {
        return bookCategories;
    }

    public void setBookCategories(BookCategories bookCategories) {
        this.bookCategories = bookCategories;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id = " + id +
                ", title = "+ title + '\'' +
                ", author =" + author + '\'' +
                ", bookCategories =" + bookCategories + '\'' +
                ", quantity =" + quantity +
                '\n';
                }
    }

