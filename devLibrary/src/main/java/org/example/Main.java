package org.example;

import org.example.enums.BookCategories;
import org.example.enums.Role;
import org.example.exceptions.BookException;
import org.example.models.Book;
import org.example.models.Library;
import org.example.models.User;

import java.util.PriorityQueue;
import java.util.Queue;

import org.example.functions.UserComparator;
import org.example.services.ServiceImplementation.LibrarianServiceImplementation;


import java.util.*;

public class Main {
    public static void main(String[] args) throws RuntimeException {

       Book book = new Book("Essential Chemistry", "Chang Raymond", BookCategories.SCIENCE_TEXTBOOKS, 1);
        Book book1 = new Book("Essential Physics", "Chang Raymond", BookCategories.SCIENCE_TEXTBOOKS, 2);
        Book book2 = new Book("A Portable Anthology", "Janet E. Gardner", BookCategories.ART_TEXTBOOKS, 2);
        Book book3 = new Book("Essential Commerce", "Chang Raymond", BookCategories.COMMERCIAL_TEXTBOOKS, 2);

        // Adding of books to list.
        Library.book.add(book);
        Library.book.add(book1);
        Library.book.add(book2);
        Library.book.add(book3);

        Library.book.addAll(Library.book);

        User user1 = new User("Ola", "Wale", "S01", Role.SENIOR_STUDENT);
        User user3 = new User("Agbaje", "Lola", "T01",  Role.TEACHER);
        User user2 = new User("Adunni", "Ade", "J01", Role.JUNIOR_STUDENT);
        User user4 = new User("Oyin", "Loye", "L01", Role.LIBRARIAN);

        // Adding users to list.
        Library.user.add(user1);
        Library.user.add(user2);
        Library.user.add(user3);
        Library.user.add(user4);

        // Adding users to user queue.
        Library.userQueue.addAll(Library.user);
//       UserComparator userComparator = new UserComparator();
//       Collections.sort(Library.user, userComparator);
//        System.out.println(Library.user);

        // Testing the Library Impl.
        // Adding users to priority queue.
        Library.priorityQueue.addAll(Library.user);
        System.out.println(Library.priorityQueue);
        LibrarianServiceImplementation librarianServiceImplementation = new LibrarianServiceImplementation();
        try {
            System.out.println(librarianServiceImplementation.lendOutBook(Library.priorityQueue, book1));
//            System.out.println(librarianServiceImplementation.lendOutBook(Library.priorityQueue,book1));
        } catch (BookException e) {
            System.err.println(e.getMessage());
        }

        LibrarianServiceImplementation librarianServiceImplementation1 = new LibrarianServiceImplementation();
        try {
           System.out.println(librarianServiceImplementation1.lendOutBook(Library.userQueue, book));
          // System.out.println(librarianServiceImplementation1.lendOutBook(Library.userQueue, book1));
//         //   System.out.println(librarianServiceImplementation1.lendOutBook(Library.userQueue,book1));

        } catch (BookException e) {
            System.err.println(e.getMessage());
        }


//        System.out.println(Chemistry);
//        System.out.println(Physics);
//        System.out.println(Novel);
//        System.out.println(Commerce);


    }
}
