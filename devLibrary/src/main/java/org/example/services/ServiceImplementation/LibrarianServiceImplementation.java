package org.example.services.ServiceImplementation;

import org.example.enums.Status;
import org.example.exceptions.BookException;
import org.example.models.Book;
import org.example.models.Library;
import org.example.models.User;
import org.example.services.LibrarianServices;

import java.util.PriorityQueue;
import java.util.Queue;

public class LibrarianServiceImplementation implements LibrarianServices  {




    @Override
    public Status lendOutBook(PriorityQueue<User> priorityQueue, Book book) throws BookException {
        if (book.getQuantity() > 0) {
            int usersProcessed = 0;
            while (!priorityQueue.isEmpty() && book.getQuantity() > 0) {
                User currentUser = priorityQueue.poll();
                System.out.println(book.getTitle() + "Processing user: " + currentUser);
                book.setQuantity(book.getQuantity() - 1);
                usersProcessed++;
            }
            if (usersProcessed > 0) {
                return Status.SUCCESSFUL;
            } else {
                throw new BookException("No users in the queue or BOOK IS TAKEN");
            }
        } else {
            throw new BookException("BOOK IS TAKEN");
        }
    }

    @Override
    public String lendOutBook(Queue<User> userQueue, Book book) throws BookException {

        if (book.getQuantity() > 0 && !userQueue.isEmpty()) {
            book.setQuantity(book.getQuantity() - 1);
            User firstUserOnQueue = Library.userQueue.poll();
            return book.getTitle() + "Book Successfully taken by First User On Queue--" + firstUserOnQueue;

        } else {
            throw new BookException("BOOK IS TAKEN");
        }
    }

}

