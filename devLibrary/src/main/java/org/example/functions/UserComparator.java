package org.example.functions;

import org.example.enums.Role;
import org.example.models.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User first, User second) {
        if (first.getRole() == Role.TEACHER && second.getRole() == Role.SENIOR_STUDENT) {
            return -1;
        } else if (first.getRole() == Role.TEACHER && second.getRole() == Role.JUNIOR_STUDENT) {
            return -1;
        } else if (first.getRole() == Role.SENIOR_STUDENT && second.getRole() == Role.JUNIOR_STUDENT) {
            return -1;
        } else if (first.getRole() == second.getRole()) {
            return 0;
        } else {
            return 1;
        }
    }
}






