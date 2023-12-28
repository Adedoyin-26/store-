package org.example.models;

import org.example.enums.Role;

import java.util.Comparator;


public class  User {
    private String firstName;
    private String lastName;
    private String id;
    private Role role;

    public User(String firstName, String lastName, String id, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.role = role;
    }


    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;

    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", role='" + role + '\'' +
                '\n';
    }

}
