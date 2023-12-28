package org.example.services;

import org.example.enums.Role;
import org.example.models.Book;

public interface UserServices {
   String requestBook(Book book, Role role);

}
