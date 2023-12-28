package org.example.services.ServiceImplementation;
import org.example.enums.*;
import org.example.exceptions.BookException;
import org.example.functions.UserComparator;
import org.example.models.*;
import org.junit.jupiter.api.BeforeEach;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LibrarianServiceImplementationTest {

    LibrarianServiceImplementation librarianServiceImplementation;

    PriorityQueue<User> priorityQueue;

    Queue<User> queue;

    Book book;

    @BeforeEach
    void setUp() {
        librarianServiceImplementation = new LibrarianServiceImplementation();

        List<User> users = new ArrayList<>();

        users.add (new User("Ola", "Wale", "S01", Role.SENIOR_STUDENT));
        users.add (new User("Adunni", "Ade", "J01",  Role.JUNIOR_STUDENT));
        users.add (new User("Agbaje", "Lola", "T01",  Role.TEACHER));
        users.add (new User("Oyin", "Loye", "L01",  Role.LIBRARIAN));

        book = new Book("Essential Chemistry", "Chang Raymond", BookCategories.SCIENCE_TEXTBOOKS, 1);

        UserComparator userComparator = new UserComparator();

        priorityQueue = new PriorityQueue<>(userComparator);
        priorityQueue.addAll(users);

        queue = new LinkedList<>();
        queue.addAll(users);



    }

    @org.junit.jupiter.api.Test
    void testingLendOutBook() throws BookException {
        User currentUser = priorityQueue.peek();
        assertEquals(Status.SUCCESSFUL, librarianServiceImplementation.lendOutBook(priorityQueue, book));
    }

    @org.junit.jupiter.api.Test
    void testLendOutBook() throws BookException {
        User firstUserOnQueue = queue.peek();
        assertEquals("Book Successfully taken by First User On Queue--" + firstUserOnQueue, librarianServiceImplementation.lendOutBook(queue, book ));
    }
}
