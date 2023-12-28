package org.example.services.ServiceImplementation;

import org.example.enums.BookCategories;
import org.example.enums.Role;
import org.example.models.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceServiceImplementationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void requestBook() {
        UserServiceServiceImplementation userServiceServiceImplementation = new UserServiceServiceImplementation();
        Book book = new Book("Commerce", "Chang Raymond", BookCategories.COMMERCIAL_TEXTBOOKS, 2);
        Role role = Role.LIBRARIAN;
        assertEquals("Book Borrowed Successfully", userServiceServiceImplementation.requestBook(book, role));

    }
}