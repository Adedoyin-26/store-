package org.example.services;

import org.example.enums.Status;
import org.example.exceptions.BookException;
import org.example.models.Book;
import org.example.models.User;

import java.util.PriorityQueue;
import java.util.Queue;

public interface LibrarianServices {
    Status lendOutBook(PriorityQueue<User> priorityQueue, Book book) throws BookException;


    String lendOutBook(Queue<User> userQueue, Book book) throws BookException;
}