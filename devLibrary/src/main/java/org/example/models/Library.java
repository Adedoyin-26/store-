package org.example.models;

import org.example.enums.Role;
import org.example.functions.UserComparator;

import java.util.*;

public class Library {

    public static List<Book> book = new ArrayList<>();

    public static List<User> user = new ArrayList<>();

    public static Queue<User> userQueue = new LinkedList<>();
    ArrayList<User> userArrayList = new ArrayList<>(userQueue);
    public static PriorityQueue<User> priorityQueue = new PriorityQueue<>(new UserComparator());

    public Library() {
    this.book = book;
    this.user = user;
    this.userQueue = userQueue;
    this.priorityQueue = priorityQueue;
    }

    public static List<Book> getBook() {
        return book;
    }

    public static void setBook(List<Book> book) {
        Library.book = book;
    }

    public static List<User> getUser() {
        return user;
    }

    public static void setUser(List<User> user) {
        Library.user = user;
    }

    public static Queue<User> getUserQueue() {
        return userQueue;
    }

    public static void setUserQueue(Queue<User> userQueue) {
        Library.userQueue = userQueue;
    }

    public static PriorityQueue<User> getPriorityQueue() {
        return priorityQueue;
    }

    public static void setPriorityQueue(PriorityQueue<User> priorityQueue) {
        Library.priorityQueue = priorityQueue;
    }
}


