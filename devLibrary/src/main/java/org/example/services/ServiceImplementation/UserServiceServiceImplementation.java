package org.example.services.ServiceImplementation;

import org.example.enums.Role;
import org.example.models.Book;
import org.example.services.UserServices;

public class UserServiceServiceImplementation implements UserServices {


    @Override
    public String requestBook(Book book, Role role) {
        if (book.getQuantity() > 0 ) {
            return "Book Borrowed Successfully";

        } else {
            return "Book is taken";
        }
    }
}
